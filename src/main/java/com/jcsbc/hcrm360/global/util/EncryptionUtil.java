package com.jcsbc.hcrm360.global.util;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 21.
 * @version : 1.0.0
 * @description : The component which includes constants used for encryption and decryption.
 */
@Component
@ConfigurationProperties(prefix = "hcrm360.domain.constant")
@RequiredArgsConstructor
@Getter
@Setter
public class EncryptionUtil {

    private String plainKey;
    private String pastureKey;
    private String groupKey;

}
