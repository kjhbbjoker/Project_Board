package com.example.ProjectBoard.repository;

import com.example.ProjectBoard.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board,Integer> {

    List<Board> findAllByOrderByModifiedAtDesc();
}
