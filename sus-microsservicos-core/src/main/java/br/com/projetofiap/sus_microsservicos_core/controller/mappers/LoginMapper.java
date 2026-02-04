package br.com.projetofiap.sus_microsservicos_core.controller.mappers;

import br.com.projetofiap.sus_microsservicos_core.controller.dto.BuscarLoginDTO;
import br.com.projetofiap.sus_microsservicos_core.controller.dto.LoginDTO;
import br.com.projetofiap.sus_microsservicos_core.model.Login;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoginMapper {
    Login toEntity(LoginDTO dto);
    BuscarLoginDTO toDTO(Login login);
}
