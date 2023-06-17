package sap;

import java.util.ArrayList;

public class Admin {

    private String nomeAdmin;
    private ArrayList<Produto> produtos;

    public Admin() {
    }

    public Admin(String nomeAdmin, ArrayList<Produto> produtos) {
        this.nomeAdmin = nomeAdmin;
        this.produtos = new ArrayList<>();
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    //Método criado pois não estava no diagrama
    public void cadastrarProduto(ArrayList<Produto> produtos, String nome, double preco ) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
        System.out.println("Produto Cadastrado com Sucesso!");
    }

    public void atualizarProduto(int indice, String nome, double preco) {
        if(indice > 0 && indice < produtos.size()){
            Produto produto = new Produto(nome, preco);
            produtos.set(indice, produto);
            System.out.println("Produto atualizado com Sucesso!");
        }else{
            System.out.println("Índice Inválido!");
        }
    }
        public void visualizarProdutos(ArrayList<Produto> produtos) {
        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println(i + ". " + produto.getNome() + " - R$" + produto.getValor());
        }
    }
}
