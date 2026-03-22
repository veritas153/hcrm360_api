package com.jcsbc.hcrm360.global.auth.entity;

import com.jcsbc.hcrm360.global.auth.enums.LevelType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version 1.0.0
 * @description : The entity about member's role.
 */

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LevelType target;

    @Column
    private String description;

}
