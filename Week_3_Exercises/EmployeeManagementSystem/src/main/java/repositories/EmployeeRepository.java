package repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;

import com.cognizant.DN30.EmployeeManagementSystem.Employee;

import projections.EmployeeDTO;
import projections.EmployeeProjection;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	public List<Employee> findByName(String name);
	
	List<Employee> findByEmail(String email);
	
	List<Employee> findByDepartmentName(String departmentName);
	
	// Custom query to find employees by name using JPQL
    @Query("SELECT e FROM Employee e WHERE e.name = ?1")
    List<Employee> findEmployeesByName(String name);

    // Custom query to find employees by department ID
    @Query("SELECT e FROM Employee e WHERE e.department.id = ?1")
    List<Employee> findEmployeesByDepartmentId(Long departmentId);

    // Custom query to find employees by name and email using native SQL
    @Query(value = "SELECT * FROM employee WHERE name = ?1 AND email = ?2", nativeQuery = true)
    List<Employee> findEmployeesByNameAndEmail(String name, String email);
    
    Page<Employee> findAll(Pageable pageable);
    
    List<EmployeeProjection> findAllBy();
    
    @Query("SELECT new com.example.EmployeeDTO(e.name, d.name) " +
            "FROM Employee e JOIN e.department d")
     List<EmployeeDTO> findAllEmployeeDTOs();
}
