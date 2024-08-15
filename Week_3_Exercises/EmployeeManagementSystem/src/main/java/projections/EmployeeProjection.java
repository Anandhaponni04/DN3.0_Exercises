package projections;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {
    String getName();
    String getDepartmentName();
    
    @Value("#{target.name + ' works in ' + target.department.name}")
    String getEmployeeInfo();
}
