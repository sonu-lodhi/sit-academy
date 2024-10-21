package com.sit.academy.Service;

import com.sit.academy.Dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}