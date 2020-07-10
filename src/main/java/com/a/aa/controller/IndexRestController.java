package com.a.aa.controller;

import com.a.aa.domain.*;
import com.a.aa.service.BoardService;
import com.a.aa.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.font.TextRecord;

@RestController
public class IndexRestController {
    @Autowired
    MemberService memberService;
    @Autowired
    BoardService boardService;

    @PostMapping("/rest/join")
    public void join(JoinDTO joinDTO){
        System.out.println("join restController : " + joinDTO.toString());
        memberService.join(joinDTO);
    }

    @PostMapping("/rest/reco")
    public void reco(RecoDTO recoDTO) {
        System.out.println("Reco restController : " + recoDTO.toString());
        boardService.reco(recoDTO);
    }

    @PostMapping("/rest/delete")
    public void delete(DeleteDTO deleteDTO) {
        System.out.println("Delete restController : " + deleteDTO.toString());
        boardService.delete(deleteDTO);
    }

    @PostMapping("/rest/update")
    public void update(UpdateDTO updateDTO) {
        System.out.println("Update restController : " + updateDTO.toString());
        boardService.update(updateDTO);
    }

        @PostMapping("/rest/write")
    public void write(WriteDTO writeDTO){
        System.out.println("write restController : " + writeDTO.toString());
        boardService.write(writeDTO);
    }

    @PostMapping("/rest/reply")
    public void reply(ReplyDTO replyDTO){
        System.out.println("write restController : " + replyDTO.toString());
        boardService.reply(replyDTO);
    }
}
