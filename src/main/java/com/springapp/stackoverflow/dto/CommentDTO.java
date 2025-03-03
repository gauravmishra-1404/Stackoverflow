package com.springapp.stackoverflow.dto;

import com.springapp.stackoverflow.model.Answer;
import com.springapp.stackoverflow.model.Question;
import com.springapp.stackoverflow.model.User;

import java.time.LocalDateTime;

public class CommentDTO {

    private Long id;
    private String body;
    private LocalDateTime createdAt;
    private User user;
    private Question question;
    private Answer answer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

}
