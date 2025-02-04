package model;

import java.util.List;
import java.util.Scanner;

public class model_Create {

    // Metodo responsável pela criação de novos produtos
    public void create(List<Produto> produtos) {

        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos produtos deseja cadastrar: ");
        int quantidadeProdutos = scanner.nextInt();

        // Loop para cadastrar os produtos
        for (int i = 0; i < quantidadeProdutos; i++) {
            scanner.nextLine(); // Limpar buffer do scanner
            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a quantidade de produtos em estoque: ");
            int quantidadeEstoque = scanner.nextInt();
            System.out.println("Digite o valor do produto: ");
            double valor  = scanner.nextDouble();
            scanner.nextLine(); // Limpar buffer do scanner

            // Criação do produto
            Produto produto = new Produto(nome, quantidadeEstoque, valor);
            // Adiciona o produto na lista
            produtos.add(produto);

            System.out.println("Produto cadastrado com sucesso!");
        }

    }

}
