package com.a.aa.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<P_user, Long> {
    Optional<P_user> findByEmail(String email); // 이미 가입한 회원인지 처음인지 확인
}
