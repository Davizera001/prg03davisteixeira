/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author Davi
 */
public class PagamentoDinheiro implements Pagamento {
    
    // Variável que guarda o valor original da compra (sem desconto)
    private double valor;

    // Variável que armazena o texto do recibo após ser gerado
    private String recibo;

    // Construtor da classe
    // É chamado quando um objeto PagamentoDinheiro é criado
    // Recebe o valor da compra como parâmetro
    public PagamentoDinheiro(double valor) {
        // Atribui o valor recebido à variável da classe
        this.valor = valor;

        // Inicializa o recibo como uma string vazia
        // Ele será preenchido posteriormente no método imprimirRecibo()
        this.recibo = "";
    }

    // Método que calcula o valor total da compra com desconto
    // @Override indica que este método está implementando
    // um método definido na interface Pagamento
    @Override
    public double calcularTotal() {
        // Calcula o valor do desconto (10% do valor original)
        double desconto = valor * 0.10;

        // Subtrai o desconto do valor original e retorna o resultado final
        return valor - desconto;
    }

    // Método responsável por gerar o recibo do pagamento
    // O recibo é montado como uma única string com várias linhas
    @Override
    public void imprimirRecibo() {
        // Constrói o texto do recibo com informações detalhadas
        recibo = "Pagamento em dinheiro\n" // Indica o tipo de pagamento
                + "Valor original: R$ " + String.format("%.2f", valor) + "\n" // Mostra o valor antes do desconto
                + "Desconto: 10%\n" // Mostra a porcentagem de desconto aplicada
                + "Valor final: R$ " + String.format("%.2f", calcularTotal()); // Mostra o valor final já com desconto
    }

    // Método getter que permite acessar o recibo fora da classe
    public String getRecibo() {
        // Retorna a string contendo o recibo gerado
        return recibo;
    }
    
}
