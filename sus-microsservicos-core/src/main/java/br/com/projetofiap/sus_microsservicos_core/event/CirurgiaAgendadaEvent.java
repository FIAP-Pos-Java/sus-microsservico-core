package br.com.projetofiap.sus_microsservicos_core.event;

import br.com.projetofiap.sus_microsservicos_core.model.enums.StatusCirurgia;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public record CirurgiaAgendadaEvent(
        UUID cirurgiaId,
        UUID pacienteId,
        UUID medicoId,
        LocalDate dataCirurgia,
        LocalTime horaCirurgia,
        String local,
        String descricao,
        StatusCirurgia status
) implements Serializable {
    
    public static CirurgiaAgendadaEvent criar(
            UUID pacienteId,
            UUID medicoId,
            LocalDate dataCirurgia,
            LocalTime horaCirurgia,
            String local,
            String descricao
    ) {
        return new CirurgiaAgendadaEvent(
                null,
                pacienteId,
                medicoId,
                dataCirurgia,
                horaCirurgia,
                local,
                descricao,
                StatusCirurgia.AGENDADA
        );
    }
    
    public static CirurgiaAgendadaEvent atualizar(
            UUID cirurgiaId,
            UUID pacienteId,
            UUID medicoId,
            LocalDate dataCirurgia,
            LocalTime horaCirurgia,
            String local,
            String descricao
    ) {
        return new CirurgiaAgendadaEvent(
                cirurgiaId,
                pacienteId,
                medicoId,
                dataCirurgia,
                horaCirurgia,
                local,
                descricao,
                StatusCirurgia.AGENDADA
        );
    }
    
    public static CirurgiaAgendadaEvent cancelar(UUID cirurgiaId) {
        return new CirurgiaAgendadaEvent(
                cirurgiaId,
                null,
                null,
                null,
                null,
                null,
                null,
                StatusCirurgia.CANCELADA
        );
    }
}
