package com.example.ProjectBoard.service;


import com.example.ProjectBoard.domain.Board;
import com.example.ProjectBoard.dto.BoardDto;
import com.example.ProjectBoard.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor //롬북을 통해서 간단하게 생성자 주입 방식의 어노테이션으로 fjnal이 붙거나 @notNull이 붙은 생성자들을 자동 생성해준다.
@Service
public class BoardService {


    private  final BoardRepository boardrepository; //@RequiredArgsConstructor 레지스토리 dto


    public List<BoardDto> getList(){ //모든 글을 조회

        return boardrepository.findAllByOrderByModifiedAtDesc().stream().map(board -> board.toDto())//도메인 데이터를 dto로 변환
                .collect(Collectors.toList());

    }

    public  BoardDto getOne(Integer board_id){ //하나의 글만 조회
        return boardrepository.findById(board_id).get().toDto();//id로 해당 내용을 가져오는데 이것을 dto변환한다.
    }


    @Transactional//트랜잭션 기능이 적용된 객체임을 선언
    public BoardDto create(BoardDto dto){ //글 작성
        //DTO에서 엔티티로 만들어주려고 만든 toentity에 작성글을
        Board createBoard = dto.toEntity();

        return  boardrepository.save(createBoard).toDto(); //그리고 그것을 toDto에 저장한다
    }







}
