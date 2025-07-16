package com.trendscope.microservice.dto;

import com.trendscope.microservice.model.Role;

public class UserDTO {
    private String username;
    private String password;
    private String email;
    private Role role;
    
    // Constructors
    public UserDTO() {}
    
    public UserDTO(String username, String password, String email, Role role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
    
    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
} 
