package com.scaler.userservicenovttseve.dtos;

import com.scaler.userservicenovttseve.models.SessionStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidatetokenResponseDto {
    private UserDto userDto;
    private SessionStatus sessionStatus;
}
