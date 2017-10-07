package org.gk.shopping.app.dao;

import java.util.List;

import org.gk.shopping.app.bean.Users;
import org.gk.shopping.app.bean.UserType;

public interface UserDao {

	Users createUser(Users user);

	Users updateUser(Users user);

	List<Users> findAllUsers(UserType userType);

	List<Users> findAllUsers(UserType userType, String inputParam);
	
	List<Users> findAllUsers(String inputParam);
	
	Users getUser(String email);

}
