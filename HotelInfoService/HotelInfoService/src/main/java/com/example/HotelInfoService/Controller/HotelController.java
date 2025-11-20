package com.example.HotelInfoService.Controller;

import com.example.HotelInfoService.Entity.HotelEntity;
import com.example.HotelInfoService.ServiceImple.HotelServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    HotelServiceImple hotelServiceImple;

    @PostMapping("/addHotel")
    public HotelEntity save(@RequestBody HotelEntity hotel) {
        return hotelServiceImple.add(hotel);
    }
    @GetMapping("/page")
    public String show(){
        return "HOTEL-INFO-SERVICE";
    }
    @GetMapping("/getHotel")
    public List<HotelEntity> get() {
        return hotelServiceImple.getall();
    }
    @GetMapping("/GetByIdHotel")
    public Optional<HotelEntity> getById(@RequestParam String id) {
        return hotelServiceImple.getByid(id);
    }
    @PutMapping("/updateHotel")
    public Optional<HotelEntity> update(@RequestBody HotelEntity hotel) {
        return hotelServiceImple.update(hotel);
    }
    @DeleteMapping("/deleteHotel")
    public void deleteUser(@RequestParam String id) {
        hotelServiceImple.delete(id);
    }
@GetMapping("/GetInfoHotel")
public HotelEntity getHotelById(@RequestParam String hotelId) {
    return hotelServiceImple.getByid(hotelId).orElse(null);
}


}
