package com.weight.project.weighttracker.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import com.weight.project.weighttracker.converter.UserConverter;
import com.weight.project.weighttracker.dto.UserDto;
import com.weight.project.weighttracker.repository.UserRepository;
import com.weight.project.weighttracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ashish on 13/5/17.
 */
@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto getUserById(Integer userId) {
		return UserConverter.entityToDto(userRepository.getOne(userId));
	}

	@Override
	public void saveUser(UserDto userDto) {
		userRepository.save(UserConverter.dtoToEntity(userDto));
	}

	@Override
	public List<UserDto> getAllUsers() {
		return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
	}
}
