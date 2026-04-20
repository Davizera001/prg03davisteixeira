/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Declaração da classe Circulo que herda de FormaBidimensional
public class Circulo extends FormaBidimensional {

    // Atributo privado que armazena o valor do raio do círculo
    private double raio;

    // Construtor que inicializa o raio do círculo
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método getter que retorna o valor do raio
    public double getRaio() {
        return raio;
    }

    // Método setter que define um novo valor para o raio
    public void setRaio(double raio) {
        this.raio = raio;
    }

    // Sobrescreve o método obterArea para calcular a área do círculo
    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    // Sobrescreve o método toString para retornar uma representação em String do objeto
    @Override
    public String toString() {
        return "Circulo{raio=" + raio + "}";
    }
}
