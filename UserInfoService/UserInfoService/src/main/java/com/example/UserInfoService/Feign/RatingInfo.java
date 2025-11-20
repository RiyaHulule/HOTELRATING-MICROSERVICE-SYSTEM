package com.example.UserInfoService.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "RatingInfoService")
public interface RatingInfo {
    @GetMapping("/rating/GetInfoRating")
    List<Map<String, Object>> getRatingByUser(@RequestParam("userId") String userId);
}

