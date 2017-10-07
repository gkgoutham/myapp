package org.gk.shopping.app.controller;

import java.util.List;

import org.gk.shopping.app.bean.Employee;
import org.gk.shopping.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	/**
	 * @return
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Employee> getEmployees() {
		return employeeService.findAllEmployees();
	}

	/**
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Employee getEmployeeById(@PathVariable String id) {
		return employeeService.findBySsn(id);
	}

	/**
	 * @param Employee
	 * @return
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}

	/**
	 * @param Employee
	 * @return
	 */
	@RequestMapping(value = "/employees", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);

	}

	/**
	 * @param id
	 */
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteEmployee(@PathVariable("id") String id) {
		employeeService.deleteEmployeeBySsn(id);

	}
}
