package com.example.UserInfoService.ServiceImple;

import com.example.UserInfoService.Entity.UserEntity;
import com.example.UserInfoService.Repository.UserRepository;
import com.example.UserInfoService.Service.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImple implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity add(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> getall() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getByid(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Optional<UserEntity> update( UserEntity user) {
        UserEntity u1 = userRepository.save(user);
        return Optional.ofNullable(u1);
    }

    @Override
    public void delete(String id) {
        Optional o1 = userRepository.findById(id);
        if(o1.isPresent()){
            userRepository.deleteById(id);
        }
    }
}
