package com.codegym.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String content;
    private String author;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "class_blog_id")
    private Category categoryClass;

    public Blog() {
    }

    public Blog(Integer id, String title, String content, String author, Date date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return categoryClass;
    }

    public void setCategory(Category category) {
        this.categoryClass = category;
    }
}