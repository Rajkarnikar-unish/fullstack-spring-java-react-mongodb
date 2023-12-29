package com.rajkarnikarunish.movies.services;

import com.rajkarnikarunish.movies.api.repositories.UserRepository;
import com.rajkarnikarunish.movies.exceptions.EmailFailureException;
import com.rajkarnikarunish.movies.exceptions.UserAlreadyExistsException;
import com.rajkarnikarunish.movies.models.User;
import com.rajkarnikarunish.movies.models.UserRegistration;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(UserRegistration userRegistration) throws UserAlreadyExistsException,
            EmailFailureException {
        if (userRepository.findByEmailIgnoreCase(userRegistration.getEmail()).isPresent() ||
        userRepository.findByUsernameIgnoreCase(userRegistration.getUsername()).isPresent()) {
            throw new UserAlreadyExistsException();
        }
        System.out.println(userRegistration);
        User user = userRepository.insert(
                new User(
                        userRegistration.getUsername(),
                        userRegistration.getEmail(),
                        userRegistration.getPassword(),
                        userRegistration.getFirstName(),
                        userRegistration.getLastName()
                )
        );
        userRepository.save(user);
        return user;
    }
}