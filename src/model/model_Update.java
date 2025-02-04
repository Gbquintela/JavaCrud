package model;

import java.util.List;
import java.util.Scanner;

public class model_Update {

    // Metodo responsável pela atualização de um produto
    public void update(List<Produto> produtos){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Lista dos produtos:  ");
        for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println("Digite o id do produto que deseja editar: ");
        int idUpdate = scanner.nextInt();

        // Limpeza do buffer de entrada
        scanner.nextLine();

        Produto Update = null;

        // Busca pelo produto com o ID informado
        for(Produto produto : produtos){
            if(produto.getID() == idUpdate){
                Update = produto;
                break;
            }
        }

        // Se o produto não for encontrado
        if(Update == null){
            System.out.println("Produto não encontrado");
            return;
        }

        // Exibe os detalhes do produto encontrado
        System.out.println("Produto encontrado: " + Update);

        // Atualiza o nome do produto, se fornecido
        System.out.println("Digite o novo nome ou aperte enter para continuar o mesmo: ");
        String novoNome = scanner.nextLine();
        if(!novoNome.isEmpty()){
            Update.setNome(novoNome);
        }

        // Atualiza a quantidade do produto, se fornecida
        System.out.println("Digite a nova quantidade em estoque ou aperte enter para continuar o mesmo: ");
        String novaQuantidade = scanner.nextLine();
        if(!novaQuantidade.isEmpty()){
            int quantidadeUpdate = Integer.parseInt(novaQuantidade);
            Update.setQuantidadeEstoque(quantidadeUpdate);
        }

        // Atualiza o valor do produto, se fornecido
        System.out.println("Digite o novo valor ou aperte enter para continuar o mesmo: ");
        String novoValor = scanner.nextLine();
        if(!novoValor.isEmpty()){
            double valorUpdate = Double.parseDouble(novoValor);
            Update.setValor(valorUpdate);
        }

        // Confirmação da atualização
        System.out.println("Produto atualizado com sucesso!");

        // Exibe a lista atualizada de produtos
        System.out.println("Lista dos produtos atualizada: ");
        for(Produto produto : produtos){
            System.out.println(produto);
        }
    }
}
