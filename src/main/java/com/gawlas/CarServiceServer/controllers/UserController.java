package com.gawlas.CarServiceServer.controllers;

import com.gawlas.CarServiceServer.dao.apiModel.User;
import com.gawlas.CarServiceServer.dao.converters.UserConverter;
import com.gawlas.CarServiceServer.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserServices userServices;

    @GetMapping("/getUser")
    public @ResponseBody
    User getUser(@RequestParam String userName) {
        return new UserConverter().convertToApi(userServices.getUser(userName));
    }

    @PostMapping(path="/add")
    public @ResponseBody
    User addNewUser (@RequestParam String userName, @RequestParam String email) {
        return new UserConverter().convertToApi(userServices.addNewUser(userName, userName, email));
    }

    @PostMapping(path="/changePassword")
    public @ResponseBody
    void changePassword (@RequestParam String userName, @RequestParam String oldPassword, @RequestParam String newPassword) throws Exception {
        userServices.changePassword(userName, oldPassword, newPassword);
    }
}
