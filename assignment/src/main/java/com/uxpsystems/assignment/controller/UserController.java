package com.uxpsystems.assignment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uxpsystems.assignment.model.User;
import com.uxpsystems.assignment.service.UserService;

/**
 * Controller class for APIs
 * 
 * @author Hitesh
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * API to add user information
	 * 
	 * @param user
	 * @return - redirects to /assignment
	 */
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {
		if (user.getId() == null)
			userService.addUser(user);
		else
			userService.updateUser(user);

		return "redirect:/assignment";
	}

	/**
	 * API to update the user information
	 * 
	 * @param id
	 * @param model
	 * @return - redirects to userInformation view
	 */
	@RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET)
	public String updateUser(@PathVariable("id") Long id, Model model) {
		initStatusModel(model);
		model.addAttribute("user", userService.getUser(id));
		model.addAttribute("listOfUsers", userService.getAllUsers());
		return "userInformation";
	}

	/**
	 * API to delete the user information
	 * 
	 * @param id
	 * @return - redirects to /assignment
	 */
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
	public String deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
		return "redirect:/assignment";
	}

	/**
	 * API to get the user information based on id
	 * 
	 * @param id
	 * @return - user entity
	 */
	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable Long id) {
		return userService.getUser(id);
	}

	/**
	 * API to fetch all the users information
	 * 
	 * @param model
	 * @return - redirects to userInformation view
	 */
	@RequestMapping(value = "/assignment", method = RequestMethod.GET)
	public String getAllUsers(Model model) {
		List<User> listOfUsers = userService.getAllUsers();
		initStatusModel(model);
		model.addAttribute("user", new User());
		model.addAttribute("listOfUsers", listOfUsers);
		return "userInformation";
	}

	/**
	 * API to redirect the user to the home page
	 * 
	 * @return - redirect to /assignment
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goToHome() {
		return "redirect:/assignment";
	}

	/**
	 * Initialize the status model values
	 * 
	 * @param model
	 */
	private void initStatusModel(Model model) {
		List<String> statuses = new ArrayList<String>();
		statuses.add("Activated");
		statuses.add("Deactivated");
		model.addAttribute("statusList", statuses);
	}
}
