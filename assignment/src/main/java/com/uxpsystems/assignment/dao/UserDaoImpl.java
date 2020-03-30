package com.uxpsystems.assignment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uxpsystems.assignment.model.User;

/**
 * Repository class for DAO
 * 
 * @author Hitesh
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Fetch all user implementation
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		return userList;
	}

	/**
	 * Get user by id implementation
	 */
	@Override
	public User getUser(Long id) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, id);
		return user;
	}

	/**
	 * Add user implementation
	 */
	@Override
	public User addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(user);
		return user;
	}

	/**
	 * Update user implementation
	 */
	@Override
	public void updateUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(user);
	}

	/**
	 * Delete user implementation
	 */
	@Override
	public void deleteUser(Long id) {
		Session session = this.sessionFactory.getCurrentSession();
		User p = (User) session.load(User.class, new Long(id));
		if (null != p) {
			session.delete(p);
		}
	}
}
