package org.gk.shopping.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.gk.shopping.app.bean.Employee;
import org.gk.shopping.app.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
 
	@PersistenceContext
	private EntityManager entityManager;
	
    public void saveEmployee(Employee employee) {
        entityManager.persist(employee);
    }
 
    public List<Employee> findAllEmployees() {
        CriteriaQuery<Employee> criteria = entityManager.getCriteriaBuilder().createQuery(Employee.class);
        return entityManager.createQuery(criteria).getResultList();
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        Query query = entityManager.createNativeQuery("delete from Employee where ssn = :ssn",Employee.class);
        query.setParameter("ssn", ssn);
        query.executeUpdate();
    }
 
     
    public Employee findBySsn(String ssn){
        return null;
    }
     
    public void updateEmployee(Employee employee){
        
    }
     
}
