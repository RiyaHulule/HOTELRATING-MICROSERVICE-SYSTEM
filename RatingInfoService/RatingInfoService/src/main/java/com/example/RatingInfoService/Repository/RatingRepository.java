package com.example.RatingInfoService.Repository;

import com.example.RatingInfoService.Entity.RatingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<RatingEntity,String> {
    List<RatingEntity> findByUserId(String userId);

}
