package za.ac.deklerkbasson.repositoryTest.user.Impl;

import org.springframework.stereotype.Repository;
import za.ac.deklerkbasson.domain.user.Employee;
import za.ac.deklerkbasson.repositoryTest.user.EmployeeRepository;

import java.util.*;

@Repository("InMemory")
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Map<String, Employee> employees;

    private EmployeeRepositoryImpl() {
        this.employees = new HashMap<>();
    }

    private static EmployeeRepositoryImpl employeeRepositoryImpl = null;

    public static EmployeeRepositoryImpl getEmployeeRepositoryImpl() {
        if (employeeRepositoryImpl == null) {
            employeeRepositoryImpl = new EmployeeRepositoryImpl();
        }
        return employeeRepositoryImpl;
    }

    public Employee create(Employee employee){
        this.employees.put(employee.getEmployeeID(),employee);
        return employee;
    }

    public Employee read(String employeeId){
        return this.employees.get(employeeId);
    }

    public Employee update(Employee employee) {
        this.employees.replace(employee.getEmployeeID(),employee);
        return this.employees.get(employee.getEmployeeID());
    }

    public void delete(String employeeId) {
        this.employees.remove(employeeId);
    }

    public Set<Employee> getAll(){
        Collection<Employee> students = this.employees.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(students);
        return set;
    }
}

