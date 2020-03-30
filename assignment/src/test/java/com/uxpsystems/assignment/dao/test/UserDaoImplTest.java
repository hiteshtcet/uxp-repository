package com.uxpsystems.assignment.dao.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.uxpsystems.assignment.dao.UserDao;
import com.uxpsystems.assignment.model.User;
import com.uxpsystems.assignment.service.UserService;
/**
 * User DAO Implementation test class
 * 
 * @author Hitesh
 *
 */
public class UserDaoImplTest {

	@InjectMocks
	UserService userService;

	@Mock
	UserDao userDao;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void addUserTest() {
		User user = new User(1L, "Hitesh", "Singh", "Active");
		userService.addUser(user);
		verify(userDao, times(1)).addUser(user);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void getAllUsersTest() {
		List<User> list = new ArrayList<User>();
		User user1 = new User(1L, "Hitesh", "Singh", "Active");
		User user2 = new User(2L, "abc", "xyz", "de-active");
		User user3 = new User(3L, "pqr", "def", "ACtive");

		list.add(user1);
		list.add(user2);
		list.add(user3);

		when(userDao.getAllUsers()).thenReturn(list);
		List<User> userList = userService.getAllUsers();

		assertEquals(3, userList.size());
		verify(userDao, times(1)).getAllUsers();
	}

	@Test
	@Transactional
	@Rollback(true)
	public void updateUserTest() {
		User user = new User(1L, "Hitesh", "Singh", "Active");
		userService.updateUser(user);
		verify(userDao, times(1)).updateUser(user);
	}

	@Test
	@Transactional
	@Rollback(true)
	public void deleteUserTest() {
		User user = new User(1L, "Hitesh", "Singh", "Active");
		userService.deleteUser(user.getId());
		verify(userDao, times(1)).deleteUser(user.getId());
	}

	@Test
	@Transactional
	@Rollback(true)
	public void getUserTest() {
		when(userDao.getUser(1L)).thenReturn(new User(1L, "Hitesh", "Singh", "Active"));
		User user = userService.getUser(1L);
		assertEquals("Hitesh", user.getUsername());
		assertEquals("Singh", user.getPassword());
		assertEquals("Active", user.getStatus());
	}

}
