package com.example.TestMVC;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class UserDTO {
    private String userName;
    private int userAge;
    private String userInfo;

    public String getName() {
        return this.userName;
    }

    public int getAge() {
        return this.userAge;
    }

    public String getInfo() {
        return this.userInfo;
    }
}
