package com.example.HotelInfoService.ServiceImple;

import com.example.HotelInfoService.Entity.HotelEntity;
import com.example.HotelInfoService.Repository.HotelRepository;
import com.example.HotelInfoService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImple implements HotelService {
    @Autowired
    HotelRepository hotelRepository;

    @Override
    public HotelEntity add(HotelEntity hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<HotelEntity> getall() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<HotelEntity> getByid(String id) {
        return hotelRepository.findById(id);
    }

    @Override
    public Optional<HotelEntity> update(HotelEntity hotel) {
        HotelEntity hotelEntity = hotelRepository.save(hotel);
        return Optional.ofNullable(hotelEntity);
    }

    @Override
    public void delete(String id) {
        Optional o1 = hotelRepository.findById(id);
        if(o1.isPresent()) {
            hotelRepository.deleteById(id);
        }
    }
}
