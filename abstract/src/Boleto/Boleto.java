package Boleto;

import modelo.Produto;

public interface Boleto {
    public void emitirBoleto(Produto produto, double imposto);
}
