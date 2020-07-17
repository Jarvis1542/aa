package com.a.aa.service;

import com.a.aa.domain.JoinDTO;
import com.a.aa.domain.LoginDTO;
import com.a.aa.domain.MemberListDTO;
import com.a.aa.domain.user.P_user;
import com.a.aa.domain.user.UserRepository;
import com.a.aa.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired(required = false)
    MemberMapper memberMapper;

    @Autowired
    UserRepository userRepository;

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

//    public UserDetails joinLogin(String id){
//        System.out.println("유저 아이디 : " + id);
//        P_user p_user = userRepository.findById(id);
//        UserDetails user = P_user.
//    }
}
