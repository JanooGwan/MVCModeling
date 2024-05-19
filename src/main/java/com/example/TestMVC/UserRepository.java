package com.example.TestMVC;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    static public ArrayList<UserDTO> users;

    static {
        users= new ArrayList<UserDTO>();
        users.add(new UserDTO(1, "kwanwoo", 23, "hello"));
    }
    public UserDTO insertUser(UserDTO user) {
        users.add(user);
        return user;
    }

    public List<UserDTO> getAllUsers() {
        return users;
    }

    public UserDTO getUserById(int id) {
        return users.stream()
                .filter(userDTO -> userDTO.getId()==id)
                .findAny()
                .orElse(new UserDTO(0, "", 0, ""));
    }

    public void updateUserName(int id, UserDTO user) {
        users.stream()
                .filter(userDTO -> userDTO.getId()==id)
                .findAny()
                .orElse(new UserDTO(0, "", 0, ""))
                .setUserName(user.getUserName());
    }

    public void updateUserInfo(int id, UserDTO user) {
        users.stream()
                .filter(userDTO -> userDTO.getId()==id)
                .findAny()
                .orElse(new UserDTO(0, "", 0, ""))
                .setUserInfo(user.getUserInfo());
    }

    public void deleteUser(int id) {
        users.removeIf(userDTO -> userDTO.getId()==id);
    }
}
