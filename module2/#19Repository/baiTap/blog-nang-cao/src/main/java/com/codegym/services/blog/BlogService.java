package com.codegym.services.blog;


import com.codegym.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog findById(Integer id);
    void save(Blog blog);
    void remove(Integer id);
}
