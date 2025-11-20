package com.example.RatingInfoService.Service;

import com.example.RatingInfoService.Entity.RatingEntity;

import java.util.List;
import java.util.Optional;

public interface RatingService {
    public RatingEntity add(RatingEntity rate);
    public List<RatingEntity> getall();
    public Optional<RatingEntity> getByid(String id);
    public Optional<RatingEntity> update(RatingEntity rate);
    public void delete(String id);
    List<RatingEntity> getByUserId(String userId);
}
