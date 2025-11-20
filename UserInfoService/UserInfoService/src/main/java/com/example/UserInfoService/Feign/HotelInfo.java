package com.example.UserInfoService.Feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "HOTELINFOSERVICE")
public interface HotelInfo {
    @GetMapping("/hotel/GetInfoHotel")
    public Map<String, Object> getHotelById(@RequestParam String hotelId);
}
