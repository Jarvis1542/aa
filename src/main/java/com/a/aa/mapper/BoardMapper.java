package com.a.aa.mapper;

import com.a.aa.domain.*;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface BoardMapper {
    void write(WriteDTO writeDTO);
    void delete(DeleteDTO deleteDTO);
    void update(UpdateDTO updateDTO);
    void noCount(long bno);
    void exCount(long bno);
    void noReco(RecoDTO recoDTO);
    void rxReco(RecoDTO recoDTO);
    void reply(ReplyDTO replyDTO);
    ArrayList<ReplyListDTO> replyList(long bno);
    ArrayList<BoardListDTO> boardList();
    SelectDTO select(long bno);


}
