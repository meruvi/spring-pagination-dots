package com.meruvia.paginationdots.posts.control.dao;

import com.meruvia.paginationdots.posts.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAO extends JpaRepository<Post, Long> {
}