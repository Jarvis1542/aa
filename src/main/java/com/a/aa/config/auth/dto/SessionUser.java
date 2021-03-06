package com.a.aa.config.auth.dto;

import com.a.aa.domain.LoginDTO;
import com.a.aa.domain.user.P_user;
import com.a.aa.domain.user.Role;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable { // 이 클래스는 인증된 사용자 정보만 필요
    private Long mno;
    private String name;
    private String email;
    private String picture;
    private Role role;

    public SessionUser(P_user user){    // 소셜 로그인
        this.mno = user.getMno();
        this.name = user.getName();
        this.email = user.getEmail();
        this.role = user.getRole();
        this.picture = user.getPicture();
    }

    public SessionUser(LoginDTO loginDTO){  // 회원가입 로그인
        this.mno = loginDTO.getMno();
        this.name = loginDTO.getName();
        this.email = loginDTO.getEmail();
        this.role = loginDTO.getRole();
    }
}
