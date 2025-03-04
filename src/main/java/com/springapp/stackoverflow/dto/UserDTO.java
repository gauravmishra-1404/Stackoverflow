package com.springapp.stackoverflow.dto;

import java.util.List;

public class UserDTO {

    public static class SignupRequest {

        private String name;
        private String username;
        private String email;
        private String password;
        private String role;
        private List<String> interestedTopics;

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

    }

    public static class LoginRequest {

        private String usernameOrEmail;
        private String password;

        public String getUsernameOrEmail() {
            return usernameOrEmail;
        }

        public void setUsernameOrEmail(String usernameOrEmail) {
            this.usernameOrEmail = usernameOrEmail;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    }

    public static class UserUpdateRequest {

        private String name;
        private String bio;
        private String profilePic;
        private String role;
        private List<String> interestedTopics;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getProfilePic() {
            return profilePic;
        }

        public void setProfilePic(String profilePic) {
            this.profilePic = profilePic;
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

    }

    public static class PasswordUpdateRequest {

        private String currentPassword;
        private String newPassword;

        public String getCurrentPassword() {
            return currentPassword;
        }

        public void setCurrentPassword(String currentPassword) {
            this.currentPassword = currentPassword;
        }

        public String getNewPassword() {
            return newPassword;
        }

        public void setNewPassword(String newPassword) {
            this.newPassword = newPassword;
        }

    }

}