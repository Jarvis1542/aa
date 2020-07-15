package com.a.aa.service;

import com.a.aa.domain.*;
import com.a.aa.mapper.BoardMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardService {
    @Autowired(required = false)
    BoardMapper boardMapper;

    public void write(WriteDTO writeDTO){
        boardMapper.write(writeDTO);
    }

    public void noCount(long bno) {boardMapper.noCount(bno); }

    public void exCount(long bno) {boardMapper.exCount(bno); }

    public void delete(DeleteDTO deleteDTO) {boardMapper.delete(deleteDTO);}

    public void update(UpdateDTO updateDTO) {boardMapper.update(updateDTO);}

    public void reply(ReplyDTO replyDTO) {boardMapper.reply(replyDTO);}

    //추천기능
    public void reco(RecoDTO recoDTO) {
        if(recoDTO.getRole().equals("True")){
            boardMapper.rxReco(recoDTO);
        }else if(recoDTO.getRole().equals("False")){
            boardMapper.noReco(recoDTO);
        }
    }

    //게시판 리스트 뽑는곳
    public ArrayList<BoardListDTO> boardList(){
        return boardMapper.boardList();
    }

    //회원 리스트 뽑는곳
    public ArrayList<ReplyListDTO> replyList(long bno){
        return boardMapper.replyList(bno);
    }

    public SelectDTO select(long bno){
        System.out.println("board service : " + boardMapper.select(bno));
        return boardMapper.select(bno);
    }
}
