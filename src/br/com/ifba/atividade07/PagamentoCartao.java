/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author Davi
 */
public class PagamentoCartao implements Pagamento {
    
    // Armazena o valor original da compra (antes da taxa)
    private double valor;

    // Armazena o texto formatado do recibo gerado após o pagamento
    private String recibo;

    // Construtor da classe
    // Recebe o valor da compra e inicializa o recibo como vazio
    public PagamentoCartao(double valor) {
        this.valor = valor;   // Define o valor da compra
        this.recibo = "";     // Inicializa o recibo sem conteúdo
    }

    // Método responsável por calcular o valor total da compra
    // Aplica uma taxa de 5% sobre o valor original
    @Override
    public double calcularTotal() {
        return valor + (valor * 0.05); // Soma o valor com 5% de taxa
    }

    // Método que gera o texto do recibo do pagamento
    // Inclui valor original, taxa aplicada e valor final
    @Override
    public void imprimirRecibo() {
        recibo = "Pagamento em cartao\n" // Tipo de pagamento
                + "Valor original: R$ " + String.format("%.2f", valor) + "\n" // Valor antes da taxa
                + "Taxa: 5%\n" // Percentual da taxa aplicada
                + "Valor final: R$ " + String.format("%.2f", calcularTotal()); // Valor após a taxa
    }

    // Método getter para retornar o recibo gerado
    public String getRecibo() {
        return recibo; // Retorna o conteúdo do recibo
    }
    
}
