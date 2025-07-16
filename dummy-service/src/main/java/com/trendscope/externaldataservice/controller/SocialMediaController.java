package com.trendscope.externaldataservice.controller;

import com.trendscope.externaldataservice.model.SocialMediaTrend;
import com.trendscope.externaldataservice.service.SocialMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/external/social")
@CrossOrigin(origins = "*")
public class SocialMediaController {
    
    @Autowired
    private SocialMediaService socialMediaService;
    
    @GetMapping("/trends")
    public ResponseEntity<List<SocialMediaTrend>> getSocialMediaTrends() {
        List<SocialMediaTrend> trends = socialMediaService.getSocialMediaTrends();
        return ResponseEntity.ok(trends);
    }
} 
