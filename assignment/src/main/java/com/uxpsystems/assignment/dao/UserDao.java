package com.uxpsystems.assignment.dao;

import java.util.List;

import com.uxpsystems.assignment.model.User;

/**
 * UserDao Interface
 * 
 * @author Hitesh
 *
 */
public interface UserDao {

	/**
	 * Get user by id
	 * 
	 * @param id
	 * @return - user entity
	 */
	public User getUser(Long id);

	/**
	 * Add user
	 * 
	 * @param user
	 * @return - user entity
	 */
	public User addUser(User user);

	/**
	 * Update the user
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * Delete the user
	 * 
	 * @param id
	 */
	public void deleteUser(Long id);

	/**
	 * List of all users
	 * 
	 * @return - list of users
	 */
	public List<User> getAllUsers();
}
