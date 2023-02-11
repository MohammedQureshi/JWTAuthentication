package com.mqureshi.JWTAuthentication.demo;

import com.mqureshi.JWTAuthentication.user.User;
import com.mqureshi.JWTAuthentication.user.UserLoginDTO;
import com.mqureshi.JWTAuthentication.user.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/1.0.0/demo-controller")
public class DemoController {

    private final UserRepository repository;

    @GetMapping
    public UserLoginDTO sayHello(Principal principal) throws NoSuchAlgorithmException {
        String name = principal.getName();
        Optional<User> user = repository.findByEmail(name);

        if(user.isEmpty()) throw new UsernameNotFoundException("DANG YOU AINT AUTHORISED");

        return convertUserToUserLoginDTO(user.get());

    }

    public UserLoginDTO convertUserToUserLoginDTO(User user) throws NoSuchAlgorithmException {

        UserLoginDTO loggedInUser = new UserLoginDTO();
        loggedInUser.setFirstName(user.getFirstName());
        loggedInUser.setLastname(user.getLastname());
        loggedInUser.setEmail(user.getEmail());
        return loggedInUser;

    }

}
