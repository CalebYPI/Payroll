package za.ac.deklerkbasson.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.deklerkbasson.domain.user.Employee;
import za.ac.deklerkbasson.service.user.EmployeeService;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    @Qualifier("ServiceImpl")
    private EmployeeService service;

    @PostMapping("/create")
    @ResponseBody
    public Employee create(Employee student) {
        return service.create(student);
    }

    @PostMapping("/update")
    @ResponseBody
    public Employee update(Employee student) {
        return service.update(student);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Employee read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Employee> getAll() {
        return service.getAll();
    }

}
