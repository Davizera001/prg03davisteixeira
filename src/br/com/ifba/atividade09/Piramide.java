/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Declaração da classe Piramide que herda de FormaTridimensional
public class Piramide extends FormaTridimensional {

    // Atributo privado que armazena o valor do lado da base da pirâmide
    private double ladoBase;

    // Atributo privado que armazena a altura da pirâmide
    private double altura;

    // Atributo privado que armazena o valor do apótema (altura inclinada da face)
    private double apotema;

    // Construtor que inicializa os valores do lado da base, altura e apótema
    public Piramide(double ladoBase, double altura, double apotema) {
        this.ladoBase = ladoBase;
        this.altura = altura;
        this.apotema = apotema;
    }

    // Método getter que retorna o valor do lado da base
    public double getLadoBase() {
        return ladoBase;
    }

    // Método setter que define um novo valor para o lado da base
    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    // Método getter que retorna o valor da altura
    public double getAltura() {
        return altura;
    }

    // Método setter que define um novo valor para a altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método getter que retorna o valor do apótema
    public double getApotema() {
        return apotema;
    }

    // Método setter que define um novo valor para o apótema
    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    // Sobrescreve o método obterArea para calcular a área total da pirâmide
    @Override
    public double obterArea() {
        return (ladoBase * ladoBase) + (2 * ladoBase * apotema);
    }

    // Sobrescreve o método obterVolume para calcular o volume da pirâmide
    @Override
    public double obterVolume() {
        return (ladoBase * ladoBase * altura) / 3.0;
    }

    // Sobrescreve o método toString para retornar uma representação em String do objeto
    @Override
    public String toString() {
        return "Piramide{ladoBase=" + ladoBase + ", altura=" + altura + ", apotema=" + apotema + "}";
    }
}