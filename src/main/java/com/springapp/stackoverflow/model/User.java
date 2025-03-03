package com.springapp.stackoverflow.model;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column(nullable = true)
    private String password;

    private String profilePic;
    private String bio;

    @Column(name="role")
    private String role;

    @ElementCollection
    private List<String> interestedTopics;

    @ManyToMany
    @JoinTable(
            name = "user_saved_questions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private List<Question> savedQuestions;

    private String badges;
    private int reputations;

    private LocalDateTime createdAt;  // Will be set manually in the service layer

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getInterestedTopics() {
        return interestedTopics;
    }

    public void setInterestedTopics(List<String> interestedTopics) {
        this.interestedTopics = interestedTopics;
    }

    public List<Question> getSavedQuestions() {
        return savedQuestions;
    }

    public void setSavedQuestions(List<Question> savedQuestions) {
        this.savedQuestions = savedQuestions;
    }

    public String getBadges() {
        return badges;
    }

    public void setBadges(String badges) {
        this.badges = badges;
    }

    public int getReputations() {
        return reputations;
    }

    public void setReputations(int reputations) {
        this.reputations = reputations;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
