package com.a.aa.mapper;

import com.a.aa.domain.JoinDTO;
import com.a.aa.domain.LoginDTO;
import com.a.aa.domain.MemberListDTO;

import java.util.ArrayList;

public interface MemberMapper {
    void join(JoinDTO joinDTO);
    ArrayList<MemberListDTO> memberList();
    LoginDTO login(LoginDTO loginDTO);
}
