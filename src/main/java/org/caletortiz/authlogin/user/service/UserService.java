package org.caletortiz.authlogin.user.service;

import lombok.RequiredArgsConstructor;
import org.caletortiz.authlogin.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;


}
