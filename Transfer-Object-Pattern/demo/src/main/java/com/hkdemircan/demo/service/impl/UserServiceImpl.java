package com.hkdemircan.demo.service.impl;

import com.hkdemircan.demo.dto.UserDto;
import com.hkdemircan.demo.model.User;
import com.hkdemircan.demo.repository.UserRepository;
import com.hkdemircan.demo.service.UserService;
import com.hkdemircan.demo.util.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<UserDto> getUsers() {
        return Mapper.model2DtoUsers(userRepository.findAll());
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
    	//maybe validation aria
    	User user = Mapper.dto2Model(userDto);
    	//maybe user.setPassword
    
        return Mapper.model2Dto(userRepository.save(user));
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(UserDto userDto) {


    }
}
