/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author Davi
 */
// Interface que define um contrato para diferentes tipos de pagamento
// Qualquer classe que implementar esta interface deve obrigatoriamente
// fornecer a implementação dos métodos declarados abaixo
public interface Pagamento {
    
    // Método responsável por calcular o valor final do pagamento
    // Pode incluir taxas (cartão), descontos (dinheiro) ou cashback (pix)
    // Não recebe parâmetros e retorna um valor do tipo double
    public double calcularTotal();

    // Método responsável por gerar ou imprimir o recibo do pagamento
    // Cada classe implementa esse método de acordo com seu tipo de pagamento
    // Não retorna valor (void), pois apenas executa uma ação
    public void imprimirRecibo();
    
}
