package com.rest.api.repo.board;

import com.rest.api.entity.board.Board;
import com.rest.api.entity.board.Post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostJpaRepo extends JpaRepository<Post, Long> {
	
    Page<Post> findByBoardOrderByPostIdDesc(Board board, Pageable pageable);
    Page<Post> findByBoardAndTitleIsContainingOrderByPostIdDesc(Board board, String title, Pageable pageable);
    Page<Post> findByBoardAndContentIsContainingOrderByPostIdDesc(Board board, String content, Pageable pageable);
    Page<Post> findByBoardAndAuthorIsContainingOrderByPostIdDesc(Board board, String author, Pageable pageable);
}