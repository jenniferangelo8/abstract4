package Venda;

import Boleto.Boleto;
import NFE.NFE;
import modelo.Produto;

import java.math.BigDecimal;

//atributos
public class Venda {
    private NFE notaFiscal;
    private Boleto boleto;
    public Venda(VendaAbstract vendaAbstract){
        this.notaFiscal = vendaAbstract.criarNFE();
        this.boleto = vendaAbstract.emitirBoleto();

    }
    public void realizarVenda(Produto produto){
        BigDecimal imposto = BigDecimal.valueOf(notaFiscal.calcularImposto(produto));
        boleto.emitirBoleto(produto, imposto);
    }
}
