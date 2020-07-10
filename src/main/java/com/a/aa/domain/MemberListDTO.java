package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class MemberListDTO {
    private long mbo;
    private String id;
    private String name;
    private Date regDate;
    private String type;
}
