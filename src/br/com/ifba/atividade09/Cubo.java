/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Declaração da classe Cubo que herda de FormaTridimensional
public class Cubo extends FormaTridimensional {

    // Atributo privado que armazena o valor do lado do cubo
    private double lado;

    // Construtor que inicializa o valor do lado
    public Cubo(double lado) {
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

    // Sobrescreve o método obterArea para calcular a área total do cubo
    @Override
    public double obterArea() {
        return 6 * lado * lado;
    }

    // Sobrescreve o método obterVolume para calcular o volume do cubo
    @Override
    public double obterVolume() {
        return lado * lado * lado;
    }

    // Sobrescreve o método toString para retornar uma representação em String do objeto
    @Override
    public String toString() {
        return "Cubo{lado=" + lado + "}";
    }
}