package employee_rest_api.Service;

import employee_rest_api.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployee();

    public Employee createEmployee(Employee employee);
}
