package za.ac.deklerkbasson.service.user;

import za.ac.deklerkbasson.domain.user.Employee;
import za.ac.deklerkbasson.repositoryTest.IRepository;

import java.util.Set;

public interface EmployeeService extends IRepository<Employee, String>{
    Set<Employee> getAll();
}
