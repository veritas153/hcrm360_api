package com.jcsbc.hcrm360.domain.member.service;

import com.jcsbc.hcrm360.domain.member.entity.Member;
import com.jcsbc.hcrm360.domain.member.repository.MemberRepository;
import com.jcsbc.hcrm360.global.util.BcryptUtil;
import com.jcsbc.hcrm360.global.util.SystemDataInitializer;
import org.springframework.stereotype.Service;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 22.
 * @version : 1.0.0
 * @description : The service handling with data related with members.
 */
@Service
public class MemberService {

    private BcryptUtil bcryptUtil;
    private MemberRepository memberRepository;

    public MemberService(BcryptUtil bcryptUtil, MemberRepository memberRepository) {
        this.bcryptUtil = bcryptUtil;
        this.memberRepository = memberRepository;
    }

    public void insetAdmin(String adminAccount, String password) {
        Member admin = Member.builder()
                .username(adminAccount)
                .password(bcryptUtil.encodePassword(password))
                .build();

        memberRepository.save(admin);

    }

}
