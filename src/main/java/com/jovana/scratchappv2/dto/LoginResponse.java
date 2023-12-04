package com.jovana.scratchappv2.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Created by jovana on 04.12.2023
 */
@Builder
@Data
public class LoginResponse {

    private String token;

    private long expiresIn;

}
