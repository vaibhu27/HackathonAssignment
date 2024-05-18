package com.interndemosss.hackathonassignment.login;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    @SerializedName("user_id")
    private int userId;
    @SerializedName("message")
    private String message;

    public LoginResponse(int userId, String message) {
        this.userId = userId;
        this.message = message;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
