package NFE;

import modelo.Produto;

import java.math.BigDecimal;

public class NFECeara implements NFE {
    @Override
    public Double calcularImposto(Produto produto) {
       Double imposto; = new Double("0.20");
       double valor = produto.valor;
       imposto = imposto * valor;

        return imposto;

    }
}
