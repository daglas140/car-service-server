package com.gawlas.CarServiceServer.controllers;

import com.gawlas.CarServiceServer.dao.apiModel.User;
import com.gawlas.CarServiceServer.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/login")
    public String login() {
        return "auth succesfully";
    }

    @GetMapping("/getUser")
    public @ResponseBody
    User getUser(@RequestParam String userName) {
        return userServices.getUser(userName);
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser (@RequestParam String userName, @RequestParam String email) {
        return userServices.addNewUser(userName, email);
    }
}
