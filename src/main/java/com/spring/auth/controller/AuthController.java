package com.spring.auth.controller;

import com.spring.auth.domain.User;
import com.spring.auth.service.AuthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/save")
    @ResponseBody
    public String save(@RequestBody User user) {
        return authService.save(user);
    }

    @GetMapping("/login")
    public String loginForm() {
        return "/auth/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody LoginRequest loginUserInfo) {

        log.info(loginUserInfo.username());
        log.info(loginUserInfo.password());

        return "로그인 성공";

    }

    public record LoginRequest(String username, String password) {
    }


}

