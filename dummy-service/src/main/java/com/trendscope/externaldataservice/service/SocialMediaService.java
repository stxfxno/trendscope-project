package com.trendscope.externaldataservice.service;

import com.trendscope.externaldataservice.model.SocialMediaTrend;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SocialMediaService {
    
    private final Random random = new Random();
    private final String[] platforms = {"Instagram", "TikTok", "Twitter", "Pinterest", "Facebook"};
    private final String[] hashtags = {"#OOTD", "#Fashion", "#Style", "#Vintage", "#Streetwear", "#Sustainable"};
    private final String[] regions = {"Global", "USA", "Europe", "Asia", "LATAM"};
    
    public List<SocialMediaTrend> getSocialMediaTrends() {
        List<SocialMediaTrend> trends = new ArrayList<>();
        
        for (int i = 0; i < 8; i++) {
            SocialMediaTrend trend = new SocialMediaTrend(
                platforms[random.nextInt(platforms.length)],
                hashtags[random.nextInt(hashtags.length)],
                1000 + random.nextInt(50000), // Mentions between 1K-50K
                -1.0 + random.nextDouble() * 2.0, // Sentiment between -1.0 and 1.0
                regions[random.nextInt(regions.length)]
            );
            trends.add(trend);
        }
        
        return trends;
    }
} 
