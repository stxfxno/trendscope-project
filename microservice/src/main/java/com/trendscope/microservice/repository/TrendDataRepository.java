package com.trendscope.microservice.repository;

import com.trendscope.microservice.model.TrendData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TrendDataRepository extends JpaRepository<TrendData, Long> {
    List<TrendData> findByCategory(String category);
    List<TrendData> findByRegion(String region);
    List<TrendData> findByKeywordContainingIgnoreCase(String keyword);
} 
