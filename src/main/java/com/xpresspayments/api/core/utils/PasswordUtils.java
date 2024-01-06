package com.xpresspayments.api.core.utils;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PasswordUtils {

    private PasswordEncoder passwordEncoder;

    public String hashedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
