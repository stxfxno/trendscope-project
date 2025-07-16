package com.trendscope.externaldataservice.model;

public class SocialMediaTrend {
    private String platform;
    private String hashtag;
    private int mentions;
    private double sentiment;
    private String region;
    
    public SocialMediaTrend() {}
    
    public SocialMediaTrend(String platform, String hashtag, int mentions, double sentiment, String region) {
        this.platform = platform;
        this.hashtag = hashtag;
        this.mentions = mentions;
        this.sentiment = sentiment;
        this.region = region;
    }
    
    // Getters and Setters
    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }
    
    public String getHashtag() { return hashtag; }
    public void setHashtag(String hashtag) { this.hashtag = hashtag; }
    
    public int getMentions() { return mentions; }
    public void setMentions(int mentions) { this.mentions = mentions; }
    
    public double getSentiment() { return sentiment; }
    public void setSentiment(double sentiment) { this.sentiment = sentiment; }
    
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
}