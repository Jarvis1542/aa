package com.a.aa.domain;

import lombok.Data;

@Data
public class LoginDTO {
    private long mno;
    private String id;
    private String password;
    private String role;
    private String name;
}
