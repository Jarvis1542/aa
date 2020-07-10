package com.a.aa.service;

import com.a.aa.domain.JoinDTO;
import com.a.aa.domain.LoginDTO;
import com.a.aa.domain.MemberListDTO;
import com.a.aa.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MemberService {
    @Autowired(required = false)
    MemberMapper memberMapper;

    public void join(JoinDTO joinDTO){
        System.out.println("join service : " + joinDTO.toString());
        memberMapper.join(joinDTO);
    }

    public ArrayList<MemberListDTO> memberList(){
        System.out.println("memberList service : " + memberMapper.memberList());
        return memberMapper.memberList();
    }

    public LoginDTO login(LoginDTO loginDTO){
        System.out.println("login service : " + memberMapper.login(loginDTO));
        return memberMapper.login(loginDTO);
    }
}
