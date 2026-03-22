package com.jcsbc.hcrm360.domain.individual.entity;

import com.jcsbc.hcrm360.global.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version 1.0.0
 * @description : The entity for all church members whether they have their own account or not.
 */

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Individual extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String individualName;

    @Column(nullable = false, columnDefinition = "TEXT") // Encrypted data only!
    private String phone;

    @Column(columnDefinition = "TEXT") // Encrypted data only!
    private String email;

    @Column(columnDefinition = "TEXT") // Encrypted data only!
    private String address;

    @Column(columnDefinition = "TEXT") // Encrypted data only!
    private String birthday;

    @Column(columnDefinition = "TEXT") // Encrypted data only!
    private String photo;


}
