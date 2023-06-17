package sap;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    private String nomeCliente;
    private String endereco;
    ArrayList<Produto> carrinho;
    ArrayList<Pedido> pedidos;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String endereco, ArrayList<Produto> carrinho, ArrayList<Pedido> pedidos) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.carrinho = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void atualizarPerfil() {
        System.out.println("Informe o novo nome do Cliente: " + this.nomeCliente);
        System.out.println("Informe o novo endereço: " + this.endereco);
    }

    public String imprimirInfo() {
        return String.format("Nome Cliente: %s\n Endereço: %s", this.nomeCliente, this.endereco);
    }

    public String visualizarPedidos() {
        return String.format("Pedido: " + getPedidos());
    }

    public void visualizarProdutos(ArrayList<Produto> produtos) {
        System.out.println("Produtos disponíveis:");
        for (Produto produto : produtos) {
            System.out.println("-" + produto.getNome() + "R$" + produto.getValor());
        }
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void realizarPedido(ArrayList<Produto> produtos, String formaPagamento) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtosPedido = new ArrayList<>();
        String nomeProduto;
        do {
            System.out.print("Digite o nome do produto (ou 'fim' para finalizar o pedido): ");
            nomeProduto = scanner.nextLine();
            if (!nomeProduto.equalsIgnoreCase("fim")) {
                Produto produto = encontrarProduto(produtos, nomeProduto);
                if (produto != null) {
                    produtosPedido.add(produto);
                    System.out.println("Produto adicionado ao pedido.");
                } else {
                    System.out.println("Produto não encontrado!");
                }
            }
        } while (!nomeProduto.equalsIgnoreCase("fim"));
    }

    private Produto encontrarProduto(ArrayList<Produto> produtos, String nomeProduto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
