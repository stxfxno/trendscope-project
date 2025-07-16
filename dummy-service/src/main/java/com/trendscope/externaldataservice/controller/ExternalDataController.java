package com.trendscope.externaldataservice.controller;

import com.trendscope.externaldataservice.model.ExternalTrendData;
import com.trendscope.externaldataservice.service.ExternalDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/external")
@CrossOrigin(origins = "*")
public class ExternalDataController {
    
    @Autowired
    private ExternalDataService externalDataService;
    
    @GetMapping("/trends")
    public ResponseEntity<List<ExternalTrendData>> getTrends() {
        List<ExternalTrendData> trends = externalDataService.getTrendData();
        return ResponseEntity.ok(trends);
    }
    
    @GetMapping("/trends/{id}")
    public ResponseEntity<ExternalTrendData> getTrendById(@PathVariable Long id) {
        ExternalTrendData trend = externalDataService.getTrendById(id);
        return ResponseEntity.ok(trend);
    }
    
    @GetMapping("/health")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("External Data Service is running!");
    }
}