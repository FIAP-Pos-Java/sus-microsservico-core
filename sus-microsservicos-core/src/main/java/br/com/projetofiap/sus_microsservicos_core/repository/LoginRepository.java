package br.com.projetofiap.sus_microsservicos_core.repository;

import br.com.projetofiap.sus_microsservicos_core.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoginRepository extends JpaRepository<Login, UUID> {
}
