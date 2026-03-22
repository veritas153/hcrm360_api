package com.jcsbc.hcrm360.domain.member.entity;

import com.jcsbc.hcrm360.domain.individual.entity.Individual;
import com.jcsbc.hcrm360.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version 1.0.0
 * @description : The entity for church members who are granted for access.
 */

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private String password;

    @Column(nullable = false)
    private boolean isWithdraw = false;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "individual_id")
    @PrimaryKeyJoinColumn
    private Individual individual;


    @Builder
    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
