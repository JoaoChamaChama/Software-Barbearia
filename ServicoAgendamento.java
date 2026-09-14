import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ServicoAgendamento {

    private List<Agendamento> agendamentos;

    public Agendamento criarAgendamento(String idAgendamento, LocalDate data, LocalTime hora,
                                         Cliente cliente, Barbeiro barbeiro, Procedimento procedimento) {
        return null;
    }

    public void cancelarAgendamento(Agendamento agendamento) {
    }

    public List<Agendamento> listarPorDia(LocalDate data) {
        return List.of();
    }

    public List<Agendamento> listarPorBarbeiro(Barbeiro barbeiro) {
        return List.of();
    }

    public List<Agendamento> listarPorStatusPagamento(String status) {
        return List.of();
    }
}
