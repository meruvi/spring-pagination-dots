package com.meruvia.paginationdots.posts.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "POSTS")
@NoArgsConstructor
@Setter
@Getter
public class Post {

    @Id
    private Long id;

    private String title;
    private String body;
}