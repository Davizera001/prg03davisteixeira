/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Declaração da classe Quadrado que herda de FormaBidimensional
public class Quadrado extends FormaBidimensional {

    // Atributo privado que armazena o valor do lado do quadrado
    private double lado;

    // Construtor que inicializa o valor do lado
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Método getter que retorna o valor do lado
    public double getLado() {
        return lado;
    }

    // Método setter que define um novo valor para o lado
    public void setLado(double lado) {
        this.lado = lado;
    }

    // Sobrescreve o método obterArea para calcular a área do quadrado
    @Override
    public double obterArea() {
        return lado * lado;
    }

    // Sobrescreve o método toString para retornar uma representação em String do objeto
    @Override
    public String toString() {
        return "Quadrado{lado=" + lado + "}";
    }
}
