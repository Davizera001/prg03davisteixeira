/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 */
package br.com.ifba.atividade06;
/*
 * Classe ContaBanco
 * Representa uma conta bancária com seus atributos e comportamentos
 */
public class ContaBanco{

    
    //===== ATRIBUTOS =====

    // Número da conta
    private int numConta;

    // Tipo da conta (cc = conta corrente / cp = conta poupança)
    private String tipo;

    // Nome do dono da conta
    private String dono;

    // Saldo atual da conta
    private float saldo;

    // Status da conta (true = aberta / false = fechada)
    private boolean status;
    
    // ===== CONSTRUTOR =====

    /*
     * Construtor da classe
     * Inicializa a conta como fechada e com saldo 0
     */
    public ContaBanco(){
        
        // Conta começa fechada
        this.status = false;

        // Conta começa com saldo zero
        this.saldo = 0;
    }

    // ===== MÉTODOS =====

    /*
     * Método para abrir a conta
     * Recebe o tipo da conta (cc ou cp)
     */
    public void abrirConta(String tipo){

    // Verifica se o tipo informado é válido
    if ("cc".equals(tipo) || "cp".equals(tipo)) {

        // Define o tipo da conta
        this.setTipo(tipo);

        // Abre a conta
        this.setStatus(true);

        // Se for conta corrente
        if ("cc".equals(tipo)) {
            this.setSaldo(50);
        }

        // Se for conta poupança
        else if ("cp".equals(tipo)) {
            this.setSaldo(150);
        }
        // Mensagem informando conta aberta 
        System.out.println("Conta aberta com sucesso!");

    } else {

        // Mensagem caso o tipo seja inválido
        System.out.println("Tipo de conta invalido! Use apenas cc ou cp");
    }
    }

    /*
     * Método para fechar a conta
     */
    public void fecharConta() {
        // Se ainda tem dinheiro na conta
        if (this.getSaldo() > 0) {

            // Não pode fechar
            System.out.println("A conta nao pode ser fechada pois ainda tem dinheiro nela");
        }

        // Se a conta estiver negativa
        else if (this.getSaldo() < 0) {

            // Também não pode fechar
            System.out.println("A conta não pode ser fechada porque está em débito");
        }

        // Se saldo for zero
        else {

            // Fecha a conta
            this.setStatus(false);

            // Mensagem de sucesso
            System.out.println("Conta fechada com sucesso!!");
        }
    }

    /*
     * Método para depositar dinheiro
     */
    public void depositar(float valor){
        
        // Verifica se a conta está aberta
        if (this.isStatus()) {

            // Soma o valor ao saldo atual
            this.setSaldo(this.getSaldo() + valor);

            // Mensagem de sucesso
            System.out.println("Deposito realizado com sucesso!!");
        } 
        
        // Se a conta estiver fechada
        else {

            // Não pode depositar
            System.out.println("Nao e possível depositar em uma conta fechada");
        }
    }

    /*
     * Método para sacar dinheiro
     */
    public void sacar(float valor) {

        // Verifica se a conta está aberta
        if (this.isStatus()) {

            // Verifica se tem saldo suficiente
            if (this.getSaldo() >= valor) {

                // Subtrai o valor do saldo
                this.setSaldo(this.getSaldo() - valor);

                // Mensagem de sucesso
                System.out.println("Saque realizado com sucesso");
            } 
            
            // Se não tiver saldo suficiente
            else {

                // Mensagem de erro
                System.out.println("Saldo insuficiente para saque");
            }
        } 
        
        // Se a conta estiver fechada
        else {

            // Não pode sacar
            System.out.println("Não é possível sacar de uma conta fechada");
        }
    }

    /*
     * Método para cobrar a mensalidade da conta
     */
    public void pagarMensal() {

        // Variável que guarda o valor da mensalidade
    int valorMensal = 0;

    // Se for conta corrente
    if ("cc".equals(this.getTipo())) {

        // Mensalidade de 12 reais
        valorMensal = 12;
    } 
    
    // Se for conta poupança
    else if ("cp".equals(this.getTipo())) {

        // Mensalidade de 20 reais
        valorMensal = 20;
    }

    // Verifica se a conta está aberta
    if (this.isStatus()) {

        // Verifica se tem saldo suficiente
        if (this.getSaldo() >= valorMensal) {

            // Desconta a mensalidade do saldo
            this.setSaldo(this.getSaldo() - valorMensal);

            // Mensagem de sucesso
            System.out.println("Mensalidade paga com sucesso!!");
        } 
        
        // Se não tiver saldo suficiente
        else {

            // Mensagem de erro
            System.out.println("Saldo insuficiente para pagar a mensalidade");
        }
    } 
    
    // Se a conta estiver fechada
    else {

        // Não pode cobrar mensalidade
        System.out.println("Conta fechada, não foi possível cobrar mensalidade");
    }
    }

    // ===== GETTERS E SETTERS =====

    // Retorna o número da conta
    public int getNumConta() {
        return numConta;
    }

    // Define o número da conta
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    // Retorna o tipo da conta
    public String getTipo(){
        return tipo;
    }

    // Define o tipo da conta
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    // Retorna o nome do dono
    public String getDono() {
        return dono;
    }

    // Define o nome do dono
    public void setDono(String dono) {
        this.dono = dono;
    }

    // Retorna o saldo
    public float getSaldo() {
        return saldo;
    }

    // Define o saldo
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Retorna o status da conta
    public boolean isStatus() {
        return status;
    }

    // Define o status da conta
    public void setStatus(boolean status) {
        this.status = status;
    }

    /*
     * Método para exibir todas as informações da conta
     */
    public void estadoAtual() {

        // Mostra número da conta
        System.out.println("Número da Conta: " + this.getNumConta());

        // Mostra tipo
        System.out.println("Tipo: " + this.getTipo());

        // Mostra dono
        System.out.println("Dono: " + this.getDono());

        // Mostra saldo
        System.out.println("Saldo: " + this.getSaldo());

        // Mostra status (true ou false)
        System.out.println("Status: " + this.isStatus());

        // Linha separadora
        System.out.println("---------------------------");
    }
}
