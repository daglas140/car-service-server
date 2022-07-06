package com.gawlas.CarServiceServer.controllers;

import com.gawlas.CarServiceServer.dao.apiModel.User;
import com.gawlas.CarServiceServer.dao.converters.UserConverter;
import com.gawlas.CarServiceServer.entities.AuthRequest;
import com.gawlas.CarServiceServer.security.JwtUtils;
import com.gawlas.CarServiceServer.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class MainController {

    @Autowired
    private JwtUtils jwtUtils;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public String home() {
        return "auth succesfully";
    }

    @PostMapping("/auth")
    public ResponseEntity<?> authenticate(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("Niepoprawny użytkownik lub hasło", ex);
        }
        return ResponseEntity.ok(jwtUtils.generateToken(authRequest.getUserName()));
    }

    @PostMapping(path="/register")
    public @ResponseBody
    User registerNewUserAcount (@RequestBody User user) {
        return new UserConverter().convertToApi(userServices.addNewUser(user.getUserName(), user.getPassword(), user.getEmail()));
    }
}
