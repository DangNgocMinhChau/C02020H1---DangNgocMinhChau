package com.chaudang.services;

import com.chaudang.models.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> finAll();
    Blog findById(Integer id);
    void save(Blog blog);
    void remove(Integer id);
}
