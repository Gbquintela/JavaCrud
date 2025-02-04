package model;

public class Produto {
    private int Id; // ID do produto
    private String Nome; // Nome do produto
    private int QuantidadeEstoque; // Quantidade disponível em estoque
    private double Valor; // Preço do produto

    // Construtor do produto
    public Produto(String Nome, int QuantidadeEstoque, double Valor) {
        this.Nome = Nome;
        this.QuantidadeEstoque = QuantidadeEstoque;
        this.Valor = Valor;
        this.Id = gerarId(); // Gera um ID único para o produto
    }

    private static int contadorID = 1; // Contador para gerar IDs únicos

    // Metodo estático para gerar um ID único
    private static int gerarId(){
        return contadorID++; // Incrementa o contador e retorna o valor
    }

    // Getters e setters
    public int getID(){
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public int getQuantideEstoque() {
        return QuantidadeEstoque;
    }

    public double getValor() {
        return Valor;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        QuantidadeEstoque = quantidadeEstoque;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    // Sobrescreve o metodo toString para exibir uma descrição do produto
    @Override
    public String toString(){
        return "ID: " + Id + " Nome do produto: " + Nome + " Quantidade em Estoque: " + QuantidadeEstoque + " Valor do produto: " + Valor;
    }
}
