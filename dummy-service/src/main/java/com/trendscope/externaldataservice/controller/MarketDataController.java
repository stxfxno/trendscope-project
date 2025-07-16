package com.trendscope.externaldataservice.controller;

import com.trendscope.externaldataservice.model.MarketData;
import com.trendscope.externaldataservice.service.MarketDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/external/market")
@CrossOrigin(origins = "*")
public class MarketDataController {
    
    @Autowired
    private MarketDataService marketDataService;
    
    @GetMapping("/data")
    public ResponseEntity<List<MarketData>> getMarketData() {
        List<MarketData> marketData = marketDataService.getMarketData();
        return ResponseEntity.ok(marketData);
    }
}