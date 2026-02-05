package br.com.projetofiap.sus_microsservicos_core.controller.dto;

import java.util.UUID;

public record BuscarEnderecoDTO(
        UUID id,
        String rua,
        String numero,
        String bairro,
        String cidade,
        String estado,
        String cep) {
}
