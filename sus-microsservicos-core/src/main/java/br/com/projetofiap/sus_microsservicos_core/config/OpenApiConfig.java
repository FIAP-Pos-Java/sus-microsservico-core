package br.com.projetofiap.sus_microsservicos_core.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "SusTech API - Sistema de Agendamento SUS",
        version = "1.0",
        description = "API REST para agendamento e notificação de cirurgias no SUS com assistência social integrada"
    )
)
public class OpenApiConfig {
}
