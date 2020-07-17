package com.a.aa.domain;

import com.a.aa.domain.user.Role;
import lombok.Data;

@Data
public class LoginDTO {
    private long mno;
    private String id;
    private String password;
    private Role role;
    private String email;
    private String name;
}
