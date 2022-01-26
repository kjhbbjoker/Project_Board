package com.example.ProjectBoard.dto;


import com.example.ProjectBoard.domain.Board;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Builder
@NoArgsConstructor//파라미터가 없는 기본 생성자를 생성 디폴트 생성자
@AllArgsConstructor//모든 필드 값을 파라미터로 받는 생성자를 만듬 즉 클래스에 존재하는 모든 필드에 대한 생성자를 자동으로 생성해줍니다.
public class BoardDto {


    private String title;
    private String username;
    private String content;
    private LocalDateTime createdAt;



    public Board toEntity(){ //엔티티로 변환 , DTO를 DB데이터로 변환


        return  Board.builder()
                .title(this.title)
                .username(this.username)
                .content(this.content)
                .build();
    }



}


