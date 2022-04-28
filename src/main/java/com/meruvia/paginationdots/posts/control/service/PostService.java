package com.meruvia.paginationdots.posts.control.service;

import com.meruvia.paginationdots.posts.control.dao.PostDAO;
import com.meruvia.paginationdots.posts.entity.Post;
import com.meruvia.paginationdots.posts.entity.paging.Paged;
import com.meruvia.paginationdots.posts.entity.paging.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostDAO postDAO;

    @Autowired
    public PostService(PostDAO postDAO) {
        this.postDAO = postDAO;
    }

    public Paged<Post> getPage(int pageNumber, int size) {
        PageRequest request = PageRequest.of(pageNumber - 1, size, Sort.by(Sort.Direction.ASC, "id"));
        Page<Post> postPage = postDAO.findAll(request);
        return new Paged<>(postPage, Paging.of(postPage.getTotalPages(), pageNumber, size));
    }
}