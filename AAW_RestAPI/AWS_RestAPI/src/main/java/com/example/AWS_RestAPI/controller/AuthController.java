package com.example.AWS_RestAPI.controller;

import com.example.AWS_RestAPI.model.LoginRequest;
import com.example.AWS_RestAPI.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Scanner;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        String token = authService.generateToken(request.getUsername());
        return token;
    }

    @GetMapping("/username/{token}")
    public String extractUsername(@PathVariable String token) {
        String username = authService.extractUsername(token);
        return username;
    }

    @GetMapping("/user")
    public String getUser(Authentication authentication) {
        return "User: " + authentication.getName();
    }

    @Secured("ADMIN")
    @GetMapping("/admin")
    public String onlyAdmin(Authentication authentication) {
        return "Admin: " + authentication.getName();
    }

    @Secured("GESTOR")
    @GetMapping("/gestor")
    public String onlyGestor(Authentication authentication) {
        return "Gestor: " + authentication.getName();
    }


    @PostMapping("/admin/cadastrar")
    public String cadastraUsuario(Authentication authentication) {
        Scanner leitor = new Scanner(System.in);

        return "Cadastro de novo Usuário: " + authentication.getName();
    }

}