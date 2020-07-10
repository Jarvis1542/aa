package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class ReplyDTO {
    private long bno;
    private long mbo;
    private String rwriter;
    private String rcontent;
}
