package com.hkdemircan.demo.controller;

import com.hkdemircan.demo.dto.UserDto;
import com.hkdemircan.demo.request.UserRequest;
import com.hkdemircan.demo.response.UserListResponse;
import com.hkdemircan.demo.response.UserResponse;
import com.hkdemircan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.net.httpserver.HttpServerImpl;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public UserListResponse getAllUsers(HttpServletResponse httpRes){
        UserListResponse res = null;

        res = new UserListResponse(HttpServletResponse.SC_OK, null, userService.getUsers());
        httpRes.setStatus(res.getStatusCode());
        return res;
    }



   /* @GetMapping("/users/{email}")
    public ResponseEntity<User> getUserByEmail(@PathVariable(value = "email") String email){
        User user = userRepository.findFirstByEmail(email);
        if(null == user){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(user);

    }*/
    
    /*

    POST EXAMPLE REQUEST
    { "user":
   {
     "firstName": "hasan",
     "lastName": "kadir",
     "age":21
   } 
	
}
   
    */

    @PostMapping("/users")
    public UserResponse createUser(@Valid @RequestBody UserRequest req, HttpServletResponse httpRes){
        UserResponse res = null;

        res = new UserResponse(HttpServletResponse.SC_OK, null, userService.saveUser(req.getUser()));
        httpRes.setStatus(res.getStatusCode());
        return res;
    }

/*
    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long id, @Valid @RequestBody User userDetails) {
        User user = userRepository.findFirstById(id);
        if(null == user) {
            return ResponseEntity.notFound().build();
        }
        User updatedUser = userRepository.save(userDetails);
        return ResponseEntity.ok(updatedUser);
    }


    @DeleteMapping("/users/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable(value = "id") Long id) {
        User user = userRepository.findFirstById(id);
        if(user == null) {
            return ResponseEntity.notFound().build();
        }
        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }*/
}
