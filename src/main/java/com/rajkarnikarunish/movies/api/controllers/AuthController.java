package com.rajkarnikarunish.movies.api.controllers;

import com.rajkarnikarunish.movies.api.models.LoginBody;
import com.rajkarnikarunish.movies.api.models.LoginResponse;
import com.rajkarnikarunish.movies.api.repositories.UserRepository;
import com.rajkarnikarunish.movies.exceptions.EmailFailureException;
import com.rajkarnikarunish.movies.exceptions.UserAlreadyExistsException;
import com.rajkarnikarunish.movies.models.User;
import com.rajkarnikarunish.movies.models.UserRegistration;
import com.rajkarnikarunish.movies.services.UserService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @Autowired
    private UserService userService;

//    public AuthController(UserService userService) {
//        this.userService = userService;
//    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@Valid @RequestBody UserRegistration userRegistration)
            throws EmailFailureException, UserAlreadyExistsException {
        return new ResponseEntity<User>(userService.registerUser(userRegistration), HttpStatus.CREATED);
//        try {
//            userService.registerUser(userRegistration);
//            return ResponseEntity.ok().build();
//        } catch (UserAlreadyExistsException e) {
//            return ResponseEntity.status(HttpStatus.CONFLICT).build();
//        } catch (EmailFailureException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@Valid @RequestBody LoginBody loginBody) {

        LoginResponse response = new LoginResponse();
        response.setSuccess(true);
        return ResponseEntity.ok(response);
    }
}
