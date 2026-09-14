import java.math.BigDecimal;

public class Pagamento {

    private String idPagamento;
    private BigDecimal valor;
    private String formaPagamento;
    private String statusPagamento;
    private MetodoPagamento metodoPagamento;

    public Pagamento(String idPagamento, BigDecimal valor, String formaPagamento, MetodoPagamento metodoPagamento) {
    }

    public void processarPagamento() {
    }

    public String getIdPagamento() {
        return "";
    }

    public BigDecimal getValor() {
        return null;
    }

    public String getFormaPagamento() {
        return "";
    }

    public String getStatusPagamento() {
        return "";
    }
}
