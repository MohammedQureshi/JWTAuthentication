package com.mqureshi.JWTAuthentication.user;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class UserLoginDTO {

    private String firstName;
    private String lastname;
    private String email;

}
