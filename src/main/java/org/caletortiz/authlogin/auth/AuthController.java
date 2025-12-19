package org.caletortiz.authlogin.auth;

import lombok.RequiredArgsConstructor;
import org.caletortiz.authlogin.auth.service.JwtUtil;
import org.caletortiz.authlogin.user.dtos.LoginRequest;
import org.caletortiz.authlogin.user.dtos.RegisterRequest;
import org.caletortiz.authlogin.user.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
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
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}
