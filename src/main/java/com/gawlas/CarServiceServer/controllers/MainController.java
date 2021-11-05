package com.gawlas.CarServiceServer.controllers;

import com.gawlas.CarServiceServer.entities.AuthRequest;
import com.gawlas.CarServiceServer.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private JwtUtils jwtUtils;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String home() {
        return "auth succesfully";
    }

    @PostMapping("/auth")
    public String authenticate(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("Niepoprawny użytkownik lub hasło");
        }
        return jwtUtils.generateToken(authRequest.getUserName());
    }
}
