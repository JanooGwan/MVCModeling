package com.example.TestMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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



    @GetMapping("")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUserByUserName(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public void updateUserName(@PathVariable int id, @RequestBody UserDTO user) {
        userService.updateUserName(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}
