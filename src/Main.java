import controller.controller;
import model.Produto;
import model.model_Create;
import model.model_Delete;
import view.produtoView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto controller que gerencia a lógica de controle do sistema
         controller controllerPrincipal = new controller();
        // Criação de uma lista de produtos que será usada para armazenar os produtos cadastrados
        List<Produto> produtos = new ArrayList<>();
        // Chama o metodo controllerMain que executa as interações principais do programa
        controllerPrincipal.controllerMain();

    }
}
