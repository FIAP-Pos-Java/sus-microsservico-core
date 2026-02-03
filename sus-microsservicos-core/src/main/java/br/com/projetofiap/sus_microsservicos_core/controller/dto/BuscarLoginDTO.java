package br.com.projetofiap.sus_microsservicos_core.controller.dto;

import org.mapstruct.Mapper;

public record BuscarLoginDTO(String userName, String password) {
}
