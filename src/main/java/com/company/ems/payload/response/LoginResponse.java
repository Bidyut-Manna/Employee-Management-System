package com.company.ems.payload.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private String accessToken;
    private String role;
    private Long employeeId;
}
