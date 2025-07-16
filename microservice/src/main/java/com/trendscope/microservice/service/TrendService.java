package com.trendscope.microservice.service;

import com.trendscope.microservice.model.TrendData;
import com.trendscope.microservice.repository.TrendDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrendService {
    
    @Autowired
    private TrendDataRepository trendDataRepository;
    
    public List<TrendData> getAllTrends() {
        return trendDataRepository.findAll();
    }
    
    public List<TrendData> getTrendsByCategory(String category) {
        return trendDataRepository.findByCategory(category);
    }
    
    public List<TrendData> getTrendsByRegion(String region) {
        return trendDataRepository.findByRegion(region);
    }
    
    public List<TrendData> searchTrends(String keyword) {
        return trendDataRepository.findByKeywordContainingIgnoreCase(keyword);
    }
    
    public TrendData saveTrend(TrendData trendData) {
        return trendDataRepository.save(trendData);
    }
} 
