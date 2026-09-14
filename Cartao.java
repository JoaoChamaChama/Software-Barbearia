import java.time.LocalDate;

public class Cartao implements MetodoPagamento {

    private String numero;
    private LocalDate validade;
    private int cvc;

    public Cartao(String numero, LocalDate validade, int cvc) {
    }

    public String getNumero() {
        return "";
    }

    public LocalDate getValidade() {
        return null;
    }

    @Override
    public void pagar() {
    }
}
