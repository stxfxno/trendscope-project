package com.trendscope.externaldataservice.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ExternalTrendData {
    private Long id;
    private String keyword;
    private BigDecimal score;
    private String category;
    private String region;
    private String source;
    private LocalDateTime timestamp;
    
    public ExternalTrendData() {}
    
    public ExternalTrendData(Long id, String keyword, BigDecimal score, String category, String region, String source) {
        this.id = id;
        this.keyword = keyword;
        this.score = score;
        this.category = category;
        this.region = region;
        this.source = source;
        this.timestamp = LocalDateTime.now();
    }
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) { this.keyword = keyword; }
    
    public BigDecimal getScore() { return score; }
    public void setScore(BigDecimal score) { this.score = score; }
    
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
    
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    
    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}