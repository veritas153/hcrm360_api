package com.jcsbc.hcrm360.global.auth.enums;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version : 1.0.0
 * @description : Member's region where they can do something on website.
 */

public enum RegionType {

    DIARY("diary"),
    MEMBER("member");

    private final String region;

    RegionType(String region) {
        this.region = region;
    }

}
