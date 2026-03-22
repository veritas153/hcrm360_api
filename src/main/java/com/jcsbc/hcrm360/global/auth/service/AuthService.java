package com.jcsbc.hcrm360.global.auth.service;

import com.jcsbc.hcrm360.global.auth.repository.AuthRepository;
import org.springframework.stereotype.Service;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 22.
 * @version : 1.0.0
 * @description : The service handling with data related with authorization.
 */

@Service
public class AuthService {

    private final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }



}
