package Venda;

import Boleto.Boleto;
import NFE.NFE;

public interface VendaAbstract {
    public NFE criarNFE();
    public Boleto emitirBoleto();

}
