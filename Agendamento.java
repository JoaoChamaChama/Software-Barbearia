import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Agendamento {

    private String idAgendamento;
    private LocalDate data;
    private LocalTime hora;
    private String status;
    private Cliente cliente;
    private Barbeiro barbeiro;
    private Procedimento procedimento;

    public Agendamento(String idAgendamento, LocalDate data, LocalTime hora,
                        Cliente cliente, Barbeiro barbeiro, Procedimento procedimento) {
    }

    public BigDecimal calcularValorTotal() {
        return null;
    }

    public String getIdAgendamento() {
        return "";
    }

    public LocalDate getData() {
        return null;
    }

    public LocalTime getHora() {
        return null;
    }

    public String getStatus() {
        return "";
    }

    public void setStatus(String status) {
    }

    public Cliente getCliente() {
        return null;
    }

    public Barbeiro getBarbeiro() {
        return null;
    }

    public Procedimento getProcedimento() {
        return null;
    }
}
