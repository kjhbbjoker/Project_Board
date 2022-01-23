package com.example.ProjectBoard.domain;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;


@Entity
@EnableJpaAuditing
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@AllArgsConstructor(access =  AccessLevel.PROTECTED)
@Getter
public class Board {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name ="board_id" )
    private Integer id;

    @Column(nullable = false, columnDefinition = "varchar(20)")
    private  String title;

    @Column(name = "user_name", nullable = false, columnDefinition = "varchar(20)" )
    private  String username;

    @Column(nullable = false, columnDefinition = "varchar(100)" )
    private  String content;

    @Builder
    public Board(String title, String username, String content){
        this.title = title;
        this.username = username;
        this.content = content;
    }



}