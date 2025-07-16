package com.trendscope.microservice.service;

import com.trendscope.microservice.dto.LoginRequest;
import com.trendscope.microservice.dto.LoginResponse;
import com.trendscope.microservice.dto.UserDTO;
import com.trendscope.microservice.model.User;
import com.trendscope.microservice.repository.UserRepository;
import com.trendscope.microservice.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private JwtUtil jwtUtil;
    
    public User register(UserDTO userDTO) {
        if (userRepository.existsByUsername(userDTO.getUsername())) {
            throw new RuntimeException("Username already exists");
        }
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        
        User user = new User(
            userDTO.getUsername(),
            passwordEncoder.encode(userDTO.getPassword()),
            userDTO.getEmail(),
            userDTO.getRole()
        );
        
        return userRepository.save(user);
    }
    
    public LoginResponse login(LoginRequest loginRequest) {
        User user = userRepository.findByUsername(loginRequest.getUsername())
            .orElseThrow(() -> new RuntimeException("User not found"));
        
        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }
        
        String token = jwtUtil.generateToken(user.getUsername());
        
        return new LoginResponse(token, user.getUsername(), user.getRole().toString());
    }
} 
