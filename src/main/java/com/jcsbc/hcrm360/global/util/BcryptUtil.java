package com.jcsbc.hcrm360.global.util;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 21.
 * @version : 1.0.0
 * @description : The component that supports ECryptPasswordEncoder.
 */

@Component
@RequiredArgsConstructor
public class BcryptUtil {

    private final BCryptPasswordEncoder bcrypt;

    public String encodePassword(String rawPassword) {
        return bcrypt.encode(rawPassword);
    }

    public boolean isPasswordValid(String encodedPassword, String rawPassword) {
        return bcrypt.matches(rawPassword, encodedPassword);
    }

}
