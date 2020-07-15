package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ReplyListDTO {
    private long rno;
    private String rcontent;
    private String rwriter;
    private Date rregDate;
    private long bno;
    private long mno;
}
