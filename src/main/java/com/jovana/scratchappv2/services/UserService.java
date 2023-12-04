package com.jovana.scratchappv2.services;

import com.jovana.scratchappv2.dto.LoginRequest;
import com.jovana.scratchappv2.dto.RegisterRequest;
import com.jovana.scratchappv2.entities.User;

/**
 * Created by jovana on 04.12.2023
 */
public interface UserService {

    User register(RegisterRequest registerRequest);

    User login(LoginRequest loginRequest);

}
