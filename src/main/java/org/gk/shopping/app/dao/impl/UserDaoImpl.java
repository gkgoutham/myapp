package org.gk.shopping.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.gk.shopping.app.bean.UserType;
import org.gk.shopping.app.bean.Users;
import org.gk.shopping.app.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Users createUser(Users user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findAllUsers(UserType userType) {
		CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
		CriteriaQuery<Users> criteria = criteriaBuilder.createQuery(Users.class);
		Root<Users> root=criteria.from(Users.class);
		criteria.select(root).where(criteriaBuilder.equal(root.get("userType"), userType.getValue()));
        return entityManager.createQuery(criteria).getResultList();
	}

	@Override
	public List<Users> findAllUsers(UserType userType, String inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findAllUsers(String inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users getUser(String email) {
		CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
		CriteriaQuery<Users> criteria = criteriaBuilder.createQuery(Users.class);
		Root<Users> root=criteria.from(Users.class);
		criteria.select(root).where(criteriaBuilder.equal(root.get("emailId"), email));
        return entityManager.createQuery(criteria).getSingleResult();
	}

}
