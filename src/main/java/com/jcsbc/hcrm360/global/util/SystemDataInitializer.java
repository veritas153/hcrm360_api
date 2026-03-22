package com.jcsbc.hcrm360.global.util;

import com.jcsbc.hcrm360.domain.member.service.MemberService;
import com.jcsbc.hcrm360.global.auth.service.AuthService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 22.
 * @version : 1.0.0
 * @description : The component when API initiate for first time.
 *                Only runs when essential data were omitted after update.
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class SystemDataInitializer implements ApplicationRunner {

    private final MemberService memberService;

    @Value("${hcrm360.administrator.default.account}")
    private String adminAccount;

    @Value("${hcrm360.administrator.default.password}")
    private String adminPassword;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {

        memberService.insetAdmin(adminAccount, adminPassword);

    }

}
