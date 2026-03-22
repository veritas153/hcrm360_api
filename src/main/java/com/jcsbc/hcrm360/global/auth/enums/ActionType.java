package com.jcsbc.hcrm360.global.auth.enums;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version : 1.0.0
 * @description : Member's actions which are allowed to do on website.
 */
public enum ActionType {

    READ("읽기"),
    CREATE("쓰기"),
    UPDATE("수정"),
    DELETE("삭제");

    private final String action;

    ActionType(String action) {
        this.action = action;
    }

}
