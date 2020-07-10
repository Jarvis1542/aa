package com.a.aa.domain;

import lombok.Data;

import java.util.Date;

@Data
public class BoardListDTO {
    private long mbo;
    private long bno;
    private String title;
    private String writer;
    private Date regDate;
    private int noCount;
    private int exCount;
    private int rxReco;
    private int noReco;
}
