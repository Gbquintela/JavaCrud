package view;

import model.Produto;
import java.util.List;

public class produtoView {

    // Metodo para exibir os produtos cadastrados
    public void mostraProdutos(List<Produto> produtos){

        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");

        }else{
            // Exibe a mensagem inicial
            System.out.println("Produtos Cadastrados: ");

        // Itera sobre a lista de produtos e imprime cada um
        for(Produto produto : produtos){
            System.out.println(produto); // Chama o metodo toString() de Produto para exibir as informações
        }
        }



    }
}
