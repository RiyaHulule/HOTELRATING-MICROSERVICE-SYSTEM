package com.example.HotelInfoService.Service;

import com.example.HotelInfoService.Entity.HotelEntity;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    public HotelEntity add(HotelEntity hotel);
    public List<HotelEntity> getall();
    public Optional<HotelEntity> getByid(String id);
    public Optional<HotelEntity> update(HotelEntity hotel);
    public void delete(String id);
}
