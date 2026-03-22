package com.jcsbc.hcrm360.domain.member.repository;

import com.jcsbc.hcrm360.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Juyoung Kim
 * @version : 1.0.0
 * @since : 2026. 3. 22.
 * @description : The repository that connects database with info about member account.

 */
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
