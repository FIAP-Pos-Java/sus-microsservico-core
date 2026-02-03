package br.com.projetofiap.sus_microsservicos_core.service;

import br.com.projetofiap.sus_microsservicos_core.controller.dto.BuscarLoginDTO;
import br.com.projetofiap.sus_microsservicos_core.controller.mappers.LoginMapper;
import br.com.projetofiap.sus_microsservicos_core.model.Login;
import br.com.projetofiap.sus_microsservicos_core.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginMapper loginMapper;
    private final LoginRepository loginRepository;

    public Page<BuscarLoginDTO> buscarTodosLogins(int page, int size){
        Pageable pageable = PageRequest.of(page, size);
        Page<Login> logins = loginRepository.findAll(pageable);
        Page<BuscarLoginDTO> buscarLoginsDTO = logins.map(loginMapper::toDTO);
        return buscarLoginsDTO;
    }
}
