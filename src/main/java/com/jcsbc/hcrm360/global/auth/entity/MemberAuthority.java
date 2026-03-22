package com.jcsbc.hcrm360.global.auth.entity;

import com.jcsbc.hcrm360.global.auth.enums.ActionType;
import com.jcsbc.hcrm360.global.auth.enums.RegionType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version : 1.0.0
 * @description : The entity of member data.
 */

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(updatable = false, nullable = false)
    private String code;

    @Column(nullable = false)
    private String displayName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ActionType action;

    @Enumerated(EnumType.STRING)
    @Column
    private RegionType region;

}
