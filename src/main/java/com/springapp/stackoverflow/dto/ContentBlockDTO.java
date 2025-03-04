package com.springapp.stackoverflow.dto;

import org.springframework.web.multipart.MultipartFile;

public class ContentBlockDTO {

    private String type; // "text" or "image"
    private String text;
    private MultipartFile image;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}