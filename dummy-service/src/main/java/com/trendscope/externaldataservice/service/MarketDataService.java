package com.trendscope.externaldataservice.service;

import com.trendscope.externaldataservice.model.MarketData;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MarketDataService {
    
    private final Random random = new Random();
    private final String[] products = {"Vestido Floral", "Jeans Skinny", "Blusa Seda", "Chaqueta Cuero", "Falda Plisada"};
    private final String[] brands = {"Zara", "H&M", "Mango", "Uniqlo", "Pull&Bear"};
    private final String[] categories = {"Vestidos", "Pantalones", "Blusas", "Outerwear", "Faldas"};
    
    public List<MarketData> getMarketData() {
        List<MarketData> marketData = new ArrayList<>();
        
        for (int i = 0; i < 6; i++) {
            MarketData data = new MarketData(
                products[random.nextInt(products.length)],
                new BigDecimal(20 + random.nextInt(180)), // Price between $20-$200
                100 + random.nextInt(2000), // Sales between 100-2000
                brands[random.nextInt(brands.length)],
                categories[random.nextInt(categories.length)]
            );
            marketData.add(data);
        }
        
        return marketData;
    }
}