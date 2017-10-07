package org.gk.shopping.app.service;

import java.util.List;

import org.gk.shopping.app.bean.Users;

public interface UserService {

	public Users createUser(Users user);

	public List<Users> getAllUsers();

	public List<Users> getAllUsers(String userType);

	public List<Users> getAllUsersByPartner(String parnterName);

	public boolean approveUser(Users user);

	public boolean rejectUser(Users user);

	public boolean enableUser(Users user);

	public boolean disableUser(Users user);

	public Users updateUser(Users user);
	
	public List<Users> findUser(String inputParam);
}
