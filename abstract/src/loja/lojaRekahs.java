package loja;

import Boleto.Boleto;
import NFE.NFE;
import Venda.VendaAbstract;
import modelo.Produto;

public class lojaRekahs implements VendaAbstract {
    @Override
    public NFE criarNFE() {
        NFE nfe = new NFECeara;
        return nfe;
    }

    @Override
    public Boleto emitirBoleto(Produto produto, double imposto) {

    }
}
