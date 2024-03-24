package com.spring.auth.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;
}
