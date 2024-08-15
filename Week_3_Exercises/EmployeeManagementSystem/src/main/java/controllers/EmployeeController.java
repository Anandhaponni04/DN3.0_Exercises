package controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.DN30.EmployeeManagementSystem.Employee;

import projections.EmployeeProjection;
import repositories.EmployeeRepository;

    @RestController
	@RequestMapping("/employees")
	public class EmployeeController {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @GetMapping
	    public List<Employee> getAllEmployees() {
	        return employeeRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
	        return employeeRepository.findById(id)
	            .map(employee -> ResponseEntity.ok().body(employee))
	            .orElse(ResponseEntity.notFound().build());
	    }
	    
	    @GetMapping
	    public Page<Employee> getAllEmployees(
	            @RequestParam(defaultValue = "0") int page,
	            @RequestParam(defaultValue = "10") int size,
	            @RequestParam(defaultValue = "id") String sortBy) {
	        
	        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
	        return employeeRepository.findAll(pageable);
	    }

	    @PostMapping
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
	        return employeeRepository.findById(id)
	            .map(employee -> {
	                employee.setName(employeeDetails.getName());
	                employee.setEmail(employeeDetails.getEmail());
	                employee.setDepartment(employeeDetails.getDepartment());
	                Employee updatedEmployee = employeeRepository.save(employee);
	                return ResponseEntity.ok(updatedEmployee);
	            })
	            .orElse(ResponseEntity.notFound().build());
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
	        return employeeRepository.findById(id)
	            .map(employee -> {
	                employeeRepository.delete(employee);
	                return ResponseEntity.ok().build();
	            })
	            .orElse(ResponseEntity.notFound().build());
	    }
	    
	    @GetMapping("/custom-projection")
	    public List<EmployeeProjection> getCustomProjections() {
	        return employeeRepository.findAllBy();
	}
    }

