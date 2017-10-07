package org.gk.shopping.app.dao;

import java.util.List;

import org.gk.shopping.app.bean.Employee;

public interface EmployeeDao {
	 
    void saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees();
     
    void deleteEmployeeBySsn(String ssn);
     
    Employee findBySsn(String ssn);
     
    void updateEmployee(Employee employee);
}
