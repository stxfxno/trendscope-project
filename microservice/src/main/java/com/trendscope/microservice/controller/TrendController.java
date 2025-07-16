package com.trendscope.microservice.controller;

import com.trendscope.microservice.model.TrendData;
import com.trendscope.microservice.service.TrendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trends")
@CrossOrigin(origins = "*")
public class TrendController {
    
    @Autowired
    private TrendService trendService;
    
    @GetMapping
    public ResponseEntity<List<TrendData>> getAllTrends() {
        List<TrendData> trends = trendService.getAllTrends();
        return ResponseEntity.ok(trends);
    }
    
    @GetMapping("/category/{category}")
    public ResponseEntity<List<TrendData>> getTrendsByCategory(@PathVariable String category) {
        List<TrendData> trends = trendService.getTrendsByCategory(category);
        return ResponseEntity.ok(trends);
    }
    
    @GetMapping("/region/{region}")
    public ResponseEntity<List<TrendData>> getTrendsByRegion(@PathVariable String region) {
        List<TrendData> trends = trendService.getTrendsByRegion(region);
        return ResponseEntity.ok(trends);
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<TrendData>> searchTrends(@RequestParam String keyword) {
        List<TrendData> trends = trendService.searchTrends(keyword);
        return ResponseEntity.ok(trends);
    }
    
    @PostMapping
    public ResponseEntity<TrendData> createTrend(@RequestBody TrendData trendData) {
        TrendData savedTrend = trendService.saveTrend(trendData);
        return ResponseEntity.ok(savedTrend);
    }
} 
