package com.example.AWS_RestAPI.service;

//import com.example.AWS_RestAPI.repository.UserRepository;
import com.example.AWS_RestAPI.security.JwtUtil;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public String generateToken(String username) {
        String token = JwtUtil.generateToken(username);
        return token;
    }

    public String extractUsername(String token) {
        String username = JwtUtil.extractUsername(token);
        return username;

    }

//    public String extractEmail(String token) {
//        String email = JwtUtil.extractEmail(token);
//        return email;
//    }

}