package com.example.milestone.Controller;

import com.example.milestone.Entities.AuthRequest;
import com.example.milestone.Entities.User;
import com.example.milestone.Respiratory.UserRepository;
import com.example.milestone.Services.UserService;
import com.example.milestone.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;
import com.example.milestone.filter.JwtFilter;
@RestController
@RequestMapping("/users")
public class UserCintroller {
    private final UserService userService;

    @Autowired
    public UserCintroller(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;


    @GetMapping("/")
    public String welcome() {
        return "Welcome to Railway Booking ";
    }

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception{
        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(),authRequest.getPassword()
                    ));
        }
        catch (Exception e) {
            throw  new Exception("Invalid username/password");
        }

        return jwtUtil.generateToken(authRequest.getUserName());

    }



    @GetMapping("/{username}")
    public User getUserByUsername(@RequestParam String username) {
        User user = userService.getUserByUsername(username);

        return user;

    }

}

