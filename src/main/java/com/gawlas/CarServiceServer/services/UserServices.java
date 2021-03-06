package com.gawlas.CarServiceServer.services;

import com.gawlas.CarServiceServer.common.constants.AccountTypes;
import com.gawlas.CarServiceServer.entities.User;
import com.gawlas.CarServiceServer.repository.UserRepository;
import org.modelmapper.ValidationException;
import org.modelmapper.spi.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServices implements UserDetailsService {
    @Autowired
    public UserRepository userRepository;

    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
    }

    /**
     * Get user object by userName
     * @param username
     * @return
     */
    public User getUser(String username) {
        return userRepository.findByUserName(username);
    }

    /**
     * Add new user of account type guest before accept by administrator
     * @param userName
     * @param password
     * @param email
     * @return
     */
    public User registerNewUser(String userName, String password, String email) {
        return addNewUser(userName,password, email, AccountTypes.GUEST);
    }

    /**
     * Add new user by type USER - for administrator used
     * @param userName
     * @param password
     * @param email
     * @return
     */
    public User addNewUser(String userName, String password, String email) {
        return addNewUser(userName, password, email, AccountTypes.USER);
    }

    /**
     * Add new user entity to database
     * @param userName
     * @param password
     * @param email
     * @param type
     * @return
     */
    public User addNewUser(String userName, String password, String email, AccountTypes type) {
        User user = new User();
        user.setPassword(passwordEncoder.encode(password));
        user.setUserName(userName);
        user.setEmail(email);
        user.setType(type.name());
        user.setCreatedDate(new Date());
        userRepository.save(user);
        return userRepository.findByUserName(userName);
    }

    /**
     * Method used to change user password
     * @param userName
     * @param oldPassword
     * @param newPassword
     */
    public void changePassword(String userName, String oldPassword, String newPassword) throws Exception {
        User user = userRepository.findByUserName(userName);
        if (passwordEncoder.matches(oldPassword, user.getPassword())) {
            user.setPassword(passwordEncoder.encode(newPassword));
            userRepository.save(user);
        } else {
            List<ErrorMessage> errorMessages = new ArrayList<>();
            errorMessages.add(new ErrorMessage("B????d! Stare has??o nie jest zgodne"));
            throw new ValidationException(errorMessages);
        }
    }

    /**
     * Method used to change account type of user
     * @param userName
     * @param type
     */
    public void changeUserType(String userName, String type) {
        User user = userRepository.findByUserName(userName);
        user.setType(AccountTypes.valueOf(type).name());
    }
}
