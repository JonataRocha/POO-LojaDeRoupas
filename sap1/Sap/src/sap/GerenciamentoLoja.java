package sap;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoLoja {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Usuario cliente = new Usuario("Cliente", "123");
        Usuario admin = new Usuario("Admin", "456");
        Admin a = new Admin();
        Cliente c = new Cliente();
        ArrayList<Produto> produtos = new ArrayList<>();
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("==== BEM VINDO MARISA BEACH ======");
            System.out.println("1. Para logar como Administrador");
            System.out.println("2. Para logar como Cliente");
            System.out.println("3. Para Sair...");
            System.out.println("Escolha uma opção");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("===== TELA DE LOGIN =====");
                    System.out.println("Entre com Login do Administrador: ");
                    String login = scan.next();
                    System.out.println("Informe a senha do Administrador: ");
                    String senha = scan.next();
                    //user.verificarLogin(login, senha);
                    if (admin.getLogin().equals(login) && admin.getSenha().equals(senha)) {
                        System.out.println("Usuário e Senha OK!");
                        System.out.println("===== MENU ADMINISTRADOR =====");
                        System.out.println("1. para Cadastrar Produto");
                        System.out.println("2. para Atualizar");
                        int opcao2 = scan.nextInt();
                        if (opcao2 == 1) {
                            System.out.println("Quantos Produtos deseja cadastrar: ");
                            int qtd = scan.nextInt();
                            for (int i = 0; i < qtd; i++) {
                                System.out.println("Informe o Nome do produto:");
                                String nome = scan.next();
                                System.out.println("Informe o Valor: ");
                                double valor = scan.nextDouble();
                                a.cadastrarProduto(produtos, nome, valor);
                                //a.cadastrarProduto(produtos);
                            }
                        } else if (opcao2 == 2) {
                            a.visualizarProdutos(produtos);
                            System.out.println("Informe o número que deseja atualizar o Produto:");
                            int atualizacao = scan.nextInt();
                            System.out.println("Informe o novo Nome");
                            String nome = scan.next();
                            System.out.println("Informe o novo Preço");
                            double preco = scan.nextDouble();
                            a.atualizarProduto(atualizacao, nome, preco);
                        } else {
                            System.out.println("número Inválido!");
                        }
                    } else {
                        System.out.println("Login ou senha Inválida!");
                    }
                    break;
                case 2:
                    System.out.println("===== TELA DE LOGIN =====");
                    System.out.println("Entre com Login do Cliente: ");
                    String login2 = scan.next();
                    System.out.println("Informe a senha do Cliente: ");
                    String senha2 = scan.next();
                    if (cliente.getLogin().equals(login2) && cliente.getSenha().equals(senha2)) {
                        System.out.println("Usuário e Senha OK!");
                        System.out.println("===== MENU CLIENTE =====");
                        System.out.println("1. Visualizar Produtos");
                        System.out.println("2. Realizar Pedido");
                        System.out.println("3. Visualizar Pedidos");
                        int opcao3 = scan.nextInt();
                        if (opcao3 == 1) {
                            c.visualizarProdutos(produtos);
                        } else if (opcao3 == 2) {
                            System.out.println("Forma de pagamento: ");
                            System.out.println("1. PIX");
                            System.out.println("2. Cartão de Credito(2x)");
                            System.out.println("selecione a forma de pagamento");
                            int formaPagamento = scan.nextInt();
                            if (formaPagamento == 1) {
                                c.realizarPedido(produtos, "PIX");
                            } else if (formaPagamento == 2) {
                                c.realizarPedido(produtos, "Cartão de Crédito (2x)");
                            } else {
                                System.out.println("Forma de pagamento inválida!");
                            }
                        } else if (opcao == 3) {
                            c.visualizarPedidos();
                        } else {
                            System.out.println("Numero Inválido!");
                        }
                    } else {
                        System.out.println("Login ou senha Inválida!");
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        }
    }
}
