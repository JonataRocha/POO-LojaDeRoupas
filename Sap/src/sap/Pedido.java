package sap;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private String numPedido;
    private Date dataCriacao;
    private String formaPagamento;
    ArrayList<Produto> produtos;

    public Pedido() {
    }

    public Pedido(String numPedido, Date dataCriacao, String formaPagamento, ArrayList<Produto> produtos) {
        this.numPedido = numPedido;
        this.dataCriacao = new Date();
        this.formaPagamento = formaPagamento;
        this.produtos = new ArrayList();
    }

    public String imprimirInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Número do Pedido: ").append(numPedido).append("\n");
        info.append("Data de Criação: ").append(dataCriacao).append("\n");
        info.append("Produtos do Pedido:\n");
        for (Produto produto : produtos) {
            info.append("- ").append(produto.getNome()).append("\n");
        }
        info.append("Forma de Pagamento: ").append(formaPagamento).append("\n");
        return info.toString();
    }

    public double calcularPreco() {
        double precoTotal = 0.0;
        for (Produto produto : produtos) {
            precoTotal += produto.getValor();
        }
        return precoTotal;
    }
}
