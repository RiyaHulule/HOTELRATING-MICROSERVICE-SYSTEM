package com.example.RatingInfoService.ServiceImple;

import com.example.RatingInfoService.Entity.RatingEntity;
import com.example.RatingInfoService.Repository.RatingRepository;
import com.example.RatingInfoService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Service
public class RatingServiceImple implements RatingService {
    @Autowired
    RatingRepository ratingRepository;

    @Override
    public RatingEntity add(RatingEntity rate) {
        return ratingRepository.save(rate);
    }

    @Override
    public List<RatingEntity> getall() {
        return ratingRepository.findAll();
    }

    @Override
    public Optional<RatingEntity> getByid(String id) {
        return ratingRepository.findById(id);
    }

    @Override
    public Optional<RatingEntity> update(RatingEntity rate) {
        RatingEntity ratingEntity = ratingRepository.save(rate);
        return Optional.ofNullable(ratingEntity);
    }

    @Override
    public void delete(String id) {
        Optional o1 = ratingRepository.findById(id);
        if(o1.isPresent()){
            ratingRepository.deleteById(id);
        }
    }

    public List<RatingEntity> getByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }
}
