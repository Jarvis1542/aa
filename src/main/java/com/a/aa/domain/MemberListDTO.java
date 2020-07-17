package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class MemberListDTO {
    private long mno;
    private String id;
    private String name;
    private Date created_date;
    private String email;
    private String role;
}
