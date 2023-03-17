package com.axceldev.userservice.service;

import com.axceldev.userservice.entity.User;
import com.axceldev.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        User userNew = userRepository.save(user);
        return userNew;
    }

    public User getUserById(Integer id){
        User user = userRepository.findById(id).orElse(null);
        return user;
    }


}
