package com.example.UserInfoService.Controller;

import com.example.UserInfoService.Entity.UserEntity;
import com.example.UserInfoService.ServiceImple.UserFullInfo;
import com.example.UserInfoService.ServiceImple.UserServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImple userServiceImple;

    @Autowired
    UserFullInfo userFullInfo;

    @PostMapping("/addUser")
    public UserEntity save(@RequestBody UserEntity user) {
        return userServiceImple.add(user);
    }
    @GetMapping("/page")
    public String show(){
        return "USER-INFO-SERVICE";
    }
    @GetMapping("/getUser")
    public List<UserEntity> get() {
        return userServiceImple.getall();
    }
    @GetMapping("/GetByIdUser")
    public Optional<UserEntity> getById(@RequestParam String id) {
        return userServiceImple.getByid(id);
    }
    @PutMapping("/updateUser")
    public Optional<UserEntity> update(@RequestBody UserEntity user) {
        return userServiceImple.update(user);
    }
    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestParam String id) {
        userServiceImple.delete(id);
    }
    @GetMapping("/FullInfo")
    public Map<String, Object> getFullInfo(@RequestParam("userId") String userId) {
        return userFullInfo.getFullInfo(userId);
    }
}
