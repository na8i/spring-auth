package com.spring.auth.service;

import com.spring.auth.domain.User;
import com.spring.auth.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public String save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userMapper.save(user);
        return "가입완료";
    }

}
