
package sap;

public class CartaoCredito {
    private String numero;
    private String titular;
    private String dtValidade;
    private String ccv;
    
    public String imprimirInfo(){
        return String.format("Numero: %s\n Titular: %s\n Data de Validade: %s\n CCV: %s",
                this.numero, this.titular, this.dtValidade, this.ccv);
    }
}
