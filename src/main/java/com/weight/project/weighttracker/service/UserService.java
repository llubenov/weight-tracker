package com.weight.project.weighttracker.service;

import com.weight.project.weighttracker.dto.UserDto;

import java.util.List;


/**
 * Created by ashish on 13/5/17.
 */
public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
