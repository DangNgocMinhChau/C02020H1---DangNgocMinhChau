package com.chaudang.repository;

import com.chaudang.models.Blog;

import java.util.List;

public interface BlogRepository {
    List<Blog> finAll();
    Blog findById(Integer id);
    void save(Blog blog);
    void remove(Integer id);
}
