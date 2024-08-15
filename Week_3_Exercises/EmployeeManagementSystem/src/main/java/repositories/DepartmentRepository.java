package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.DN30.EmployeeManagementSystem.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	List<Department> findByName(String name);
	
	
	// Custom query to find departments with a specific name using JPQL
    @Query("SELECT d FROM Department d WHERE d.name = ?1")
    public List<Department> findDepartmentsByName(String name);

    // Custom query to count departments
    @Query("SELECT COUNT(d) FROM Department d")
    public Long countDepartments();
    

}
