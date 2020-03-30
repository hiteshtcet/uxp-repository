package com.uxpsystems.assignment.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import com.uxpsystems.assignment.dao.UserDao;
import com.uxpsystems.assignment.model.User;

/**
 * User service class to interact with DAO
 * 
 * @author Hitesh
 *
 */
@Service("userService")
public class UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * Get user service
	 * 
	 * @param id
	 * @return - user entity
	 */
	@Secured("ROLE_USER")
	@Transactional
	public User getUser(Long id) {
		return userDao.getUser(id);
	}

	/**
	 * Add user service
	 * 
	 * @param user
	 */
	@Secured("ROLE_USER")
	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
	}

	/**
	 * Update user service
	 * 
	 * @param user
	 */
	@Secured("ROLE_USER")
	@Transactional
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	/**
	 * Delete user service
	 * 
	 * @param id
	 */
	@Secured("ROLE_USER")
	@Transactional
	public void deleteUser(Long id) {
		userDao.deleteUser(id);
	}
	
	/**
	 * Get all users service
	 * 
	 * @return - list of users
	 */
	@Secured("ROLE_USER")
	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}
}
