package com.example.UserInfoService.ServiceImple;

import com.example.UserInfoService.Entity.UserEntity;
import com.example.UserInfoService.Feign.HotelInfo;
import com.example.UserInfoService.Feign.RatingInfo;
import com.example.UserInfoService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserFullInfo {
    @Autowired
    HotelInfo hotelInfo;

    @Autowired
    RatingInfo ratingInfo;

    @Autowired
    UserRepository userRepository;

    public Map<String, Object> getFullInfo(String userId) {

        Map<String, Object> response = new HashMap<>();

        UserEntity user = userRepository.findById(userId).orElse(null);
        response.put("user", user);

        List<Map<String, Object>> ratings = ratingInfo.getRatingByUser(userId);

        for (Map<String, Object> rating : ratings) {
            String hotelId = rating.get("hotelId").toString();
            Map<String, Object> hotel = hotelInfo.getHotelById(hotelId);
            rating.put("hotelDetails", hotel);
        }
        response.put("ratings", ratings);

        return response;
    }

}
