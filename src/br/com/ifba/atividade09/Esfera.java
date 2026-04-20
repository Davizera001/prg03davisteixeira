/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Declaração da classe Esfera que herda de FormaTridimensional
public class Esfera extends FormaTridimensional {

    // Atributo privado que armazena o valor do raio da esfera
    private double raio;

    // Construtor que inicializa o valor do raio
    public Esfera(double raio) {
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

    // Sobrescreve o método obterArea para calcular a área da superfície da esfera
    @Override
    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    // Sobrescreve o método obterVolume para calcular o volume da esfera
    @Override
    public double obterVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }

    // Sobrescreve o método toString para retornar uma representação em String do objeto
    @Override
    public String toString() {
        return "Esfera{raio=" + raio + "}";
    }
}
