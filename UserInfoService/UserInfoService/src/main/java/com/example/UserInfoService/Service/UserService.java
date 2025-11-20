package com.example.UserInfoService.Service;

import com.example.UserInfoService.Entity.UserEntity;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public UserEntity add(UserEntity user);
    public List<UserEntity> getall();
    public Optional<UserEntity> getByid(String id);
    public Optional<UserEntity> update(UserEntity user);
    public void delete(String id);
}
