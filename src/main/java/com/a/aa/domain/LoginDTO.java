package com.a.aa.domain;

import lombok.Data;

@Data
public class LoginDTO {
    private long mbo;
    private String id;
    private String password;
    private String type;
    private String name;
}
