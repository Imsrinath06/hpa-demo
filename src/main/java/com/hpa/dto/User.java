package com.hpa.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    private String userId;
    private String userName;
    private String email;
    private String mobile;
}
