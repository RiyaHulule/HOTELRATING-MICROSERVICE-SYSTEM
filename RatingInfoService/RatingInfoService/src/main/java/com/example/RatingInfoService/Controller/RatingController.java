package com.example.RatingInfoService.Controller;

import com.example.RatingInfoService.Entity.RatingEntity;
import com.example.RatingInfoService.ServiceImple.RatingServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    RatingServiceImple ratingServiceImple;

    @PostMapping("/addRating")
    public RatingEntity save(@RequestBody RatingEntity rate) {
        return ratingServiceImple.add(rate);
    }
    @GetMapping("/page")
    public String page() {
        return "RATING-INFO-SERVICE";
    }
    @GetMapping("/getRating")
    public List<RatingEntity> get() {
        return ratingServiceImple.getall();
    }
    @GetMapping("/GetByIdRating")
    public Optional<RatingEntity> getById(@RequestParam String id) {
        return ratingServiceImple.getByid(id);
    }
    @PutMapping("/updateRating")
    public Optional<RatingEntity> update(@RequestBody RatingEntity rate) {
        return ratingServiceImple.update(rate);
    }
    @DeleteMapping("/deleteRating")
    public void deleteUser(@RequestParam String id) {
        ratingServiceImple.delete(id);
    }
    @GetMapping("/GetInfoRating")
    public List<RatingEntity> getRatingByUser(@RequestParam String userId) {
        return ratingServiceImple.getByUserId(userId);  // fetch by userId
    }

}
