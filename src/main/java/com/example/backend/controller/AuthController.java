package com.example.backend.controller;

import com.example.backend.business.UserService;
import com.example.backend.business.UserServiceImpl;
import com.example.backend.entities.UserInformation;
import com.example.backend.entities.UserRequest;
import com.example.backend.security.JwtTokenProvider;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.UsesJava7;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.reflect.Modifier.PROTECTED;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private AuthenticationManager authenticationManager;
    private JwtTokenProvider jwtTokenProvider;
    private UserService userService;

    private PasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, UserService userService, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public String login(@RequestBody UserRequest loginRequest) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginRequest.getUserName(), loginRequest.getPassword());
        System.out.println(authenticationToken);
        authenticationToken.setAuthenticated(true);
        Authentication authentication = authenticationManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwtToken = jwtTokenProvider.generateJwtToken(authentication);

        System.out.println(jwtToken);
        return "Bearer" + jwtToken;
    }
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserRequest registerRequest) {
        if (userService.getOneByUsereMail(registerRequest.getUserName()) != null)
            return new ResponseEntity<>("username already in use", HttpStatus.BAD_REQUEST);
        UserInformation userInformation = new UserInformation();
        userInformation.setEMail(registerRequest.getUserName());
        userInformation.setPassword(registerRequest.getPassword());
        System.out.println(registerRequest.getPassword());
        userService.saveOneUser(userInformation);
        return new ResponseEntity<>("User Succesfully registered", HttpStatus.CREATED);
    }
}
