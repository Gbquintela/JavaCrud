package model;

import java.util.List;
import java.util.Scanner;

public class model_Delete {

    // Metodo responsável pela exclusão de produtos
    public void delete(List<Produto> produtos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o id do produto que deseja excluir: ");
        int idDelete = scanner.nextInt();
        Produto produtoDelete = null;

        // Busca pelo produto com o ID informado
        for(Produto produto : produtos){
            if(produto.getID() == idDelete){
                produtoDelete = produto;
                break;
            }
        }

        // Se o produto for encontrado, ele é removido da lista
        if(produtoDelete != null){
            produtos.remove(produtoDelete);
            System.out.println("Produto deletado com sucesso!");

            // Exibe a lista de produtos atualizada
            System.out.println("Lista dos produtos atualizada: ");
            for(Produto produto : produtos){
                System.out.println(produto);
            }
        } else {
            // Caso o produto não seja encontrado
            System.out.println("Id do produto nao encontrado.");
        }
    }
    
}
