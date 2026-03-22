package com.jcsbc.hcrm360.global.auth.repository;

import com.jcsbc.hcrm360.global.auth.entity.MemberRoleAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Juyoung Kim
 * @since : 2026. 3. 22.
 * @version : 1.0.0
 * @description : The repository that connects database with info about authorization
 */
@Repository
public interface AuthRepository extends JpaRepository<MemberRoleAuthority, Long> {


}
