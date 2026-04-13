/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05Fatorial;

/**
 *
 * @author Davi
 */
public class Fatorial {
    
    // Guarda o valor informado pelo usuário
    private int valor;

    // Guarda o resultado do fatorial
    private int fatorial;

    // Guarda a fórmula do cálculo
    private String formula;

    // Método para receber o valor e calcular o fatorial
    public void setValor(int n) {

        // Armazena o valor recebido
        valor = n;

        // Variável auxiliar para o resultado
        int fat = 1;

        // Variável auxiliar para a fórmula
        String f = "";

        // Calcula o fatorial e monta a fórmula
        for (int i = n; i >= 1; i--) {
            fat = fat * i;

            if (i == n) {
                f = "" + i;
            } else {
                f = f + " x " + i;
            }
        }

        // Caso o valor seja 0
        if (n == 0) {
            fat = 1;
            f = "1";
        }

        // Guarda os resultados
        fatorial = fat;
        formula = f;
    }

    // Retorna o valor do fatorial
    public int getFatorial() {
        return fatorial;
    }

    // Retorna a fórmula
    public String getFormula() {
        return formula;
    }
    
}
