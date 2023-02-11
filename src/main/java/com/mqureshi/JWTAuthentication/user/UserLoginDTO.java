package com.mqureshi.JWTAuthentication.user;

import lombok.Data;

@Data
public class UserLoginDTO {

    private String firstName;
    private String lastname;
    private String email;

}
