package org.caletortiz.authlogin.user.dtos;

import lombok.Getter;

@Getter
public class RegisterRequest {
    private String email;
    private String password;
}
