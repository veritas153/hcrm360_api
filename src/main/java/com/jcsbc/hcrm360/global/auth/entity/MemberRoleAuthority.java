package com.jcsbc.hcrm360.global.auth.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 18.
 * @version 1.0.0
 * @description : List entity of which member is allowed to do something on certain group.
 */

@Entity
@Table(
        name = "member_role_authority",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"role_id","authority_id"})
        }
)
public class MemberRoleAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private MemberRole memberRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authority_id")
    private MemberAuthority memberAuthority;

}
