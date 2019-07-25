package com.hkdemircan.demo.service;

import com.hkdemircan.demo.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> getUsers();
    public UserDto saveUser(UserDto userDto);
    public UserDto updateUser(UserDto userDto);
    public void deleteUser(UserDto userDto);
}
