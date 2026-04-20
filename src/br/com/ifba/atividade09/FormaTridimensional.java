/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Davi
 */
// Declaração de uma classe abstrata chamada FormaTridimensional que herda de Forma
public abstract class FormaTridimensional extends Forma {

    // Declaração de um método abstrato que retorna um valor double representando a área da forma
    public abstract double obterArea();

    // Declaração de um método abstrato que retorna um valor double representando o volume da forma
    public abstract double obterVolume();
}
