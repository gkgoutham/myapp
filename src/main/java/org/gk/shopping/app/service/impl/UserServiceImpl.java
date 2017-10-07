package org.gk.shopping.app.service.impl;

import java.util.Date;
import java.util.List;

import org.gk.shopping.app.bean.UserType;
import org.gk.shopping.app.bean.Users;
import org.gk.shopping.app.dao.UserDao;
import org.gk.shopping.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public Users createUser(Users user) {
		return userDao.createUser(user);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getAllUsers(String userType) {
		UserType userTypeE= UserType.valueOf(userType);
		return userDao.findAllUsers(userTypeE);
	}

	@Override
	public List<Users> getAllUsersByPartner(String parnterName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean approveUser(Users user) {
		Users usr=userDao.getUser(user.getEmailId());
		usr.setIsApproved((byte)1);
		usr.setApprovedBy("gkgoutham");
		usr.setApprovedOn(new Date());
		userDao.updateUser(usr);
		return true;
	}

	@Override
	public boolean rejectUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disableUser(Users user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Users updateUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findUser(String inputParam) {
		// TODO Auto-generated method stub
		return null;
	}

}
