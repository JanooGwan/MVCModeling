package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("")
    public UserDTO insertUser(@RequestBody UserDTO user) {
        return userService.insertUser(user);
    }

    @ResponseBody
    @GetMapping("/members")
    public String members() { return "members"; }

    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userName}")
    public UserDTO getUserByUserName(@PathVariable String userName) {
        return userService.getUserByUserName(userName);
    }

    @PutMapping("/{userName}")
    public void updateUserName(@PathVariable String userName, @RequestBody UserDTO user) {
        userService.updateUserName(userName, user);
    }

    @PutMapping("/{userInfo}")
    public void updateUserInfo(String userName, UserDTO user) {
        userService.updateUserInfo(userName, user);
    }

    @DeleteMapping("/{userName}")
    public void deleteUser(@PathVariable String userName) {
        userService.deleteUser(userName);
    }
}



//