package controller;

import model.Produto;
import model.model_Create;
import model.model_Delete;
import model.model_Update;
import view.produtoView;
import view.telaPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controller {

    public void controllerMain(){
        // Inicializa o scanner para leitura de entradas
        Scanner scanner = new Scanner(System.in);

        // Criação de objetos necessários
        List<Produto> produtos = new ArrayList<>();
        model_Delete delete = new model_Delete();
        model_Create create = new model_Create();
        produtoView view = new produtoView();
        model_Update update = new model_Update();
        telaPrincipal telaView = new telaPrincipal();

        // Loop principal para o menu de opções
        boolean sair = false;
        while(!sair){
            // Exibe o menu
            telaView.menuPrincipal();
            int opcao = scanner.nextInt();
            // Lê a opção escolhida
            switch (opcao){
                case 1 :
                    // Chama a criação de produtos
                    create.create(produtos);
                    break;

                case 2 :
                    // Exibe os produtos cadastrados
                    view.mostraProdutos(produtos);
                    break;

                case 3 :
                    // Chama a atualização de produtos
                    update.update(produtos);
                    break;

                case 4 :
                    // Chama a exclusão de produtos
                    delete.delete(produtos);
                    break;

                case 0 :
                    // Sai do programa
                    sair = true;
                    System.out.println("Saindo...");
                    break;

                default:
                    // Caso a opção seja inválida, continua o loop
                    continue;
            }
        }
    }
}
