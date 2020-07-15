package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class SelectDTO {
    private long bno;
    private String title;
    private String writer;
    private String content;
    private Date regdate;
    private int noCount;
    private int exCount;
    private int rxReco;
    private int noReco;
}
