package org.caletortiz.authlogin.auth;

import lombok.RequiredArgsConstructor;
import org.caletortiz.authlogin.user.dtos.LoginRequest;
import org.caletortiz.authlogin.user.dtos.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequest request) {
        authService.register(request);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestBody LoginRequest request) {
        authService.login(request);
        return ResponseEntity.ok().build();
    }
}
