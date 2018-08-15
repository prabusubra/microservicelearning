package com.example.blogmanagement.beans;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Topic {

    @PrimaryKey
    private String topicid;
    private String name;
    private String content;
    private String author;
    private String category;

    public String getTopicid() {
        return topicid;
    }

    public void setTopicid(String topicid) {
        this.topicid = topicid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
