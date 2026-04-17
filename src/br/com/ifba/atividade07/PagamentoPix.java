/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author Davi
 */
public class PagamentoPix implements Pagamento {
    
    
    // Variável que armazena o valor original da compra
    private double valor;

    // Variável que armazena o texto do recibo gerado
    private String recibo;

    // Construtor da classe
    // Recebe o valor da compra como parâmetro ao criar o objeto
    public PagamentoPix(double valor) {
        this.valor = valor;   // Define o valor da compra
        this.recibo = "";     // Inicializa o recibo vazio (será preenchido depois)
    }

    // Método responsável por calcular o valor final da compra
    // Neste caso, é aplicado um cashback de 2% (desconto indireto)
    @Override
    public double calcularTotal() {
        // Subtrai 2% do valor original (equivalente ao cashback)
        return valor - (valor * 0.02);
    }

    // Método que gera o recibo do pagamento
    // Monta uma string com todas as informações relevantes
    @Override
    public void imprimirRecibo() {
        recibo = "Pagamento via pix\n" // Tipo de pagamento
                + "Valor original: R$ " + String.format("%.2f", valor) + "\n" // Valor antes do cashback
                + "Cashback: 2%\n" // Percentual de cashback aplicado
                + "Valor final: R$ " + String.format("%.2f", calcularTotal()); // Valor final após cashback
    }

    // Método getter para retornar o recibo gerado
    public String getRecibo() {
        return recibo; // Retorna o conteúdo do recibo
    }
    
}
