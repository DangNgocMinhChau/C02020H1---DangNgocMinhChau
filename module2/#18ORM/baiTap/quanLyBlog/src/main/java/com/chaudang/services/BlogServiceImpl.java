package com.chaudang.services;

import com.chaudang.models.Blog;
import com.chaudang.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> finAll() {
        return blogRepository.finAll();
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void remove(Integer id) {
        blogRepository.remove(id);
    }
}
