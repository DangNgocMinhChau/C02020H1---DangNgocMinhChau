package com.codegym.repository;


import com.codegym.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Integer> {

}
