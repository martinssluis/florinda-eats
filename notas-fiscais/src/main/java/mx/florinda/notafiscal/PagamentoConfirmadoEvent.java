package mx.florinda.notafiscal;

import java.math.BigDecimal;

public class PagamentoConfirmadoEvent {

    public long pagamentoId;
    public long pedidoId;
    public BigDecimal valor;

    @Override
    public String toString() {
        return "PagamentoConfimadoEvent{" +
                "pagamentoId=" + pagamentoId +
                ", pedidoId=" + pedidoId +
                ", valor=" + valor +
                '}';
    }
}
