/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Davi
 */
public class Sessao {
    
    // Identificador único da sessão (pode ser usado para controle no banco de dados)
    private Long id;

    // Objeto que representa o usuário associado a esta sessão
    private Usuario usuario;

    // Token de autenticação da sessão (geralmente usado para validar requisições)
    private String token;

    // Construtor vazio: permite criar uma sessão sem definir valores inicialmente
    public Sessao() {
    }

    // Construtor com parâmetros: permite instanciar a sessão já com seus dados principais
    public Sessao(Long id, Usuario usuario, String token) {
        // Define o identificador da sessão
        this.id = id;

        // Associa um usuário à sessão
        this.usuario = usuario;

        // Define o token de autenticação da sessão
        this.token = token;
    }

    // Retorna o identificador da sessão
    public Long getId() {
        return id;
    }

    // Define ou altera o identificador da sessão
    public void setId(Long id) {
        this.id = id;
    }

    // Retorna o usuário associado à sessão
    public Usuario getUsuario() {
        return usuario;
    }

    // Define ou altera o usuário associado à sessão
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Retorna o token de autenticação da sessão
    public String getToken() {
        return token;
    }

    // Define ou altera o token de autenticação da sessão
    public void setToken(String token) {
        this.token = token;
    }

    // Sobrescreve o método toString para fornecer uma representação textual da sessão
    @Override
    public String toString() {
        return "Sessao{" +
                // Exibe o id da sessão
                "id=" + id +
                // Exibe o nome do usuário, se existir; caso contrário, mostra "null" para evitar erro
                ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "null") +
                // Exibe o token da sessão entre aspas
                ", token='" + token + '\'' +
                '}';
    }
}
    

