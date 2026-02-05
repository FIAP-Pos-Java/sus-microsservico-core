package br.com.projetofiap.sus_microsservicos_core.controller.dto;

import org.mapstruct.Mapper;

import java.util.UUID;

public record BuscarLoginDTO(
        UUID id,
        String userName,
        String password) {
}
