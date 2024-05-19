package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDTO insertUser(UserDTO user) {
        return userRepository.insertUser(user);
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public UserDTO getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public void updateUserName(int id, UserDTO user) {
        userRepository.updateUserName(id, user);
    }

    public void updateUserInfo(int id, UserDTO user) {
        userRepository.updateUserInfo(id, user);
    }

    public void deleteUser(int id) {
        userRepository.deleteUser(id);
    }
}
