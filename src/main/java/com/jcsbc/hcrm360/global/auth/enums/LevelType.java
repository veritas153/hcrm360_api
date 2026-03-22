package com.jcsbc.hcrm360.global.auth.enums;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version : 1.0.0
 * @description : Member's level.
 *                ADMIN = '최고관리자 or 목사님'
 *                PLAIN_KEEPER = '평원지기'
 *                GRASSLAND_KEEPER = '초원지기'
 *                PASTURE_KEEPER = '목자'
 */

public enum LevelType {

    ADMIN(10, "최고관리자"),
    PLAIN_KEEPER(5, "평원지기"),
    GRASSLAND_KEEPER(3, "초원지기"),
    PASTURE_KEEPER(1, "목자");

    private final int level;
    private final String role;

    LevelType(int level, String role) {
        this.level = level;
        this.role = role;

    }

    public boolean hasAuthority(int requiredLevel) {
        return this.level >= requiredLevel;

    }

}
