package br.com.projetofiap.sus_microsservicos_core.controller.dto;

import jakarta.validation.constraints.NotBlank;

public record EnderecoDTO(
        @NotBlank
        String rua,

        @NotBlank
        String numero,

        @NotBlank
        String bairro,

        String cidade,

        String estado,

        @NotBlank
        String cep
) {
}
