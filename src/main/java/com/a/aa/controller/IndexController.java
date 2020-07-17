package com.a.aa.controller;

import com.a.aa.config.auth.dto.SessionUser;
import com.a.aa.domain.JoinDTO;
import com.a.aa.domain.LoginDTO;
import com.a.aa.domain.RecoDTO;
import com.a.aa.domain.user.P_user;
import com.a.aa.service.BoardService;
import com.a.aa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.mail.Session;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    MemberService memberService;
    @Autowired
    BoardService boardService;

    @GetMapping("/")
    public String index(Model model, HttpSession httpSession){
        model.addAttribute("memberList", memberService.memberList());
        model.addAttribute("boardList", boardService.boardList());
        SessionUser user = (SessionUser) httpSession.getAttribute("user");
        //System.out.println("회원가입 세션 정보 : " + httpSession.getAttribute("joinUser"));
        System.out.println("소셜 세션 정보 : " + httpSession.getAttribute("user"));
        if(user != null)
            model.addAttribute("userName", user.getName());
        return "index";
    }

    @GetMapping("/join")
    public String join(Model model, HttpSession httpSession){
        System.out.println("세션 정보 : " + httpSession.getAttribute("user"));
        model.addAttribute("member", httpSession.getAttribute("user"));
        return "join";
    }

    @GetMapping("/user/login")
    public String loginPage(Model model, HttpSession httpSession){
        System.out.println("세션 정보 : " + httpSession.getAttribute("user"));
        model.addAttribute("member", httpSession.getAttribute("user"));
        return "login";
    }

    @PostMapping("/rest/login")
    public String login(LoginDTO loginDTO, HttpSession httpSession, Model model){
        System.out.println("login Controller : " + memberService.login(loginDTO));
        SessionUser user = new SessionUser(memberService.login(loginDTO));
        httpSession.setAttribute("user", user);
        model.addAttribute("member", httpSession.getAttribute("user"));
        System.out.println("세션 정보 : " + httpSession.getAttribute("user"));
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/";
    }

    @GetMapping("/write")
    public String write(Model model,  HttpSession httpSession){
        model.addAttribute("member", httpSession.getAttribute("user"));
        System.out.println("세션 정보 : " + httpSession.getAttribute("user"));
        return "write";
    }

    @GetMapping("/select/{bno}")
    public String select(@PathVariable long bno, Model model, HttpSession httpSession){
        model.addAttribute("member", httpSession.getAttribute("user"));
        model.addAttribute("select", boardService.select(bno));
        System.out.println("댓글리스트 : " + boardService.replyList(bno));
        model.addAttribute("replyList", boardService.replyList(bno));
        LoginDTO loginDTO = (LoginDTO)httpSession.getAttribute("user");
        String a = httpSession.getAttribute("user").toString();
        System.out.println("세션에 담긴 쓰레기 같은 정보2 : " + a);
        if(loginDTO.getRole().equals("False")) {
            boardService.noCount(bno);
        } else {
            boardService.exCount(bno);
        }

        System.out.println("세션에 담긴 쓰레기 같은 정보 : " + httpSession.getAttribute("user"));
        return "select";
    }

    @GetMapping("/update/{bno}")
    public String update(@PathVariable("bno") long bno, Model model, HttpSession httpSession){
        model.addAttribute("member", httpSession.getAttribute("user"));
        model.addAttribute("update", boardService.select(bno));
        System.out.println("세션 정보 : " + httpSession.getAttribute("user"));
        return "/update";
    }


}
