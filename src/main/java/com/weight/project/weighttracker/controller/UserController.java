package com.weight.project.weighttracker.controller;

import java.util.List;

import com.weight.project.weighttracker.dto.UserDto;
import com.weight.project.weighttracker.service.UserService;
import com.weight.project.weighttracker.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ashish on 13/5/17.
 */
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(Constants.GET_USER_BY_ID)
	public UserDto getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}
	
	@RequestMapping(Constants.GET_ALL_USERS)
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
	}
}
