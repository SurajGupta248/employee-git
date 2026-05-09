package employee_rest_api.Controller;


import employee_rest_api.Entity.Employee;
import employee_rest_api.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {


        @Autowired
        EmployeeService employeeService;

        @GetMapping("/getEmployeeDetails")
        public ResponseEntity<List<Employee>> getEmployeeDetails(){
            System.out.println("getEmployeeDetails");
            return ResponseEntity.ok(employeeService.getEmployee());
        }

        @PostMapping("/create")
        public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
                Employee created = employeeService.createEmployee(employee);
                return ResponseEntity.status(HttpStatus.CREATED).body(created);
        }

}
