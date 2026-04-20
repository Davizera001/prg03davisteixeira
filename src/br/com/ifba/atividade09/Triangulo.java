/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Declaração da classe Triangulo que herda de FormaBidimensional
public class Triangulo extends FormaBidimensional {

    // Atributo privado que armazena o valor da base do triângulo
    private double base;

    // Atributo privado que armazena o valor da altura do triângulo
    private double altura;

    // Construtor que inicializa os valores da base e da altura
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método getter que retorna o valor da base
    public double getBase() {
        return base;
    }

    // Método setter que define um novo valor para a base
    public void setBase(double base) {
        this.base = base;
    }

    // Método getter que retorna o valor da altura
    public double getAltura() {
        return altura;
    }

    // Método setter que define um novo valor para a altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Sobrescreve o método obterArea para calcular a área do triângulo
    @Override
    public double obterArea() {
        return (base * altura) / 2.0;
    }

    // Sobrescreve o método toString para retornar uma representação em String do objeto
    @Override
    public String toString() {
        return "Triangulo{base=" + base + ", altura=" + altura + "}";
    }
}
