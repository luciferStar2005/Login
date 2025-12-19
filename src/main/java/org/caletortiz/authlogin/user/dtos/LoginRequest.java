package org.caletortiz.authlogin.user.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class LoginRequest {
    private String email;
    private String password;
}
