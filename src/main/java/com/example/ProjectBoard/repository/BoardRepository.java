package com.example.ProjectBoard.repository;

import com.example.ProjectBoard.domain.Board;
import com.example.ProjectBoard.dto.BoardDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Integer> {

    List<BoardDto> findAllByOrderByModifiedAtDesc();
}
