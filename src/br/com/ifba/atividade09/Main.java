/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Classe principal do programa
public class Main {

    // Método principal que executa o programa
    public static void main(String[] args) {

        // Cria um array de Forma com capacidade para 6 objetos
        Forma[] formas = new Forma[6];

        // Instancia e armazena diferentes tipos de formas no array
        formas[0] = new Circulo(3);          // Circulo com raio 3
        formas[1] = new Quadrado(4);         // Quadrado com lado 4
        formas[2] = new Triangulo(6, 5);     // Triângulo com base 6 e altura 5
        formas[3] = new Esfera(2);           // Esfera com raio 2
        formas[4] = new Cubo(3);            // Cubo com lado 3
        formas[5] = new Piramide(4, 6, 5);   // Pirâmide com ladoBase 4, altura 6 e apótema 5

        // Percorre todas as formas armazenadas no array
        for (Forma forma : formas) {

            // Imprime uma linha separadora
            System.out.println("-----------------------------------");

            // Imprime a representação textual da forma (toString)
            System.out.println(forma.toString());

            // Verifica se a forma é bidimensional
            if (forma instanceof FormaBidimensional) {

                // Faz o cast para FormaBidimensional
                FormaBidimensional forma2D = (FormaBidimensional) forma;

                // Exibe o tipo da forma
                System.out.println("Tipo: Forma Bidimensional");

                // Exibe a área formatada com 2 casas decimais
                System.out.println("Area: " + String.format("%.2f", forma2D.obterArea()));
            }

            // Verifica se a forma é tridimensional
            if (forma instanceof FormaTridimensional) {

                // Faz o cast para FormaTridimensional
                FormaTridimensional forma3D = (FormaTridimensional) forma;

                // Exibe o tipo da forma
                System.out.println("Tipo: Forma Tridimensional");

                // Exibe a área formatada com 2 casas decimais
                System.out.println("Area: " + String.format("%.2f", forma3D.obterArea()));

                // Exibe o volume formatado com 2 casas decimais
                System.out.println("Volume: " + String.format("%.2f", forma3D.obterVolume()));
            }
        }
    }
}
