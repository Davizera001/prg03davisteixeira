/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author Davi
 */
public class Main {
    
    /*
     * Método principal (ponto de entrada do programa)
     */
    public static void main(String[] args) {

        // ===== TESTE DA PRIMEIRA CONTA =====
        // Cria um objeto do tipo ContaBanco (conta 1)
        ContaBanco c1 = new ContaBanco();

        // Define o número da conta
        c1.setNumConta(1111);

        // Define o nome do dono da conta
        c1.setDono("Jubileu");

        // Abre a conta como conta corrente (cc)
        c1.abrirConta("cc");

        // Deposita 100 reais na conta
        c1.depositar(100);

        // Realiza um saque de 30 reais
        c1.sacar(30);

        // Cobra a mensalidade da conta
        c1.pagarMensal();

        // Exibe o estado atual da conta
        c1.estadoAtual();

        // ===== TESTE DA SEGUNDA CONTA =====

        // Cria um segundo objeto ContaBanco (conta 2)
        ContaBanco c2 = new ContaBanco();

        // Define o número da conta
        c2.setNumConta(2222);

        // Define o nome do dono
        c2.setDono("Creusa");

        // Abre a conta como poupança (cp)
        c2.abrirConta("cp");

        // Deposita 200 reais
        c2.depositar(200);

        // Realiza um saque de 50 reais
        c2.sacar(50);

        // Cobra a mensalidade
        c2.pagarMensal();

        // Mostra o estado final da conta
        c2.estadoAtual();
    }
}
