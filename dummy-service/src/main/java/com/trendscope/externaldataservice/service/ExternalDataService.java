package com.trendscope.externaldataservice.service;

import com.trendscope.externaldataservice.model.ExternalTrendData;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ExternalDataService {
    
    private final Random random = new Random();
    private final String[] keywords = {"Vestido Vintage", "Pantalón Wide Leg", "Blusa Satinada", "Chaqueta Bomber", "Falda Midi"};
    private final String[] categories = {"Vestidos", "Pantalones", "Blusas", "Outerwear", "Faldas"};
    private final String[] regions = {"Europa", "Norte América", "Asia", "América Latina", "Oceanía"};
    private final String[] sources = {"Google Trends", "Fashion Week", "Instagram Analytics", "Twitter Trends", "Pinterest"};
    
    public List<ExternalTrendData> getTrendData() {
        List<ExternalTrendData> trends = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            ExternalTrendData trend = new ExternalTrendData(
                (long) i,
                keywords[random.nextInt(keywords.length)],
                new BigDecimal(50 + random.nextInt(50)), // Score between 50-100
                categories[random.nextInt(categories.length)],
                regions[random.nextInt(regions.length)],
                sources[random.nextInt(sources.length)]
            );
            trends.add(trend);
        }
        
        return trends;
    }
    
    public ExternalTrendData getTrendById(Long id) {
        return new ExternalTrendData(
            id,
            keywords[0],
            new BigDecimal(85.5),
            categories[0],
            regions[0],
            sources[0]
        );
    }
}