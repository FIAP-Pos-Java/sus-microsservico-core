package br.com.projetofiap.sus_microsservicos_core.controller.dto;

import jakarta.validation.constraints.NotBlank;
import org.mapstruct.Mapper;

public record LoginDTO(
        @NotBlank
        String userName,

        @NotBlank
        String password
) {
}
