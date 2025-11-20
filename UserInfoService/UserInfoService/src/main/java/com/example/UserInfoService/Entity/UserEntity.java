package com.example.UserInfoService.Entity;

import com.netflix.discovery.converters.Auto;
import jakarta.persistence.*;

@Entity
@Table(name = "UserMicroservice")
public class UserEntity {
    @Id
    private String userId;
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
