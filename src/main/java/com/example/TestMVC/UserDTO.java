package com.example.TestMVC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class UserDTO {
    private int id;
    private String userName;
    private int userAge;
    private String userInfo;

    public int getAge() {
        return this.userAge;
    }

}
