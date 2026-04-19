/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

// Importa a classe ArrayList, uma implementação concreta da interface List.
// É uma lista dinâmica baseada em array, muito usada quando precisamos
// de acesso rápido por índice e inserções no final da lista.
import java.util.ArrayList;

// Importa a interface List, que define o comportamento de uma coleção ordenada.
// Usar a interface ao invés da implementação (ArrayList) é uma boa prática,
// pois permite trocar facilmente a implementação no futuro (ex: LinkedList),
// sem alterar o restante do código.
import java.util.List;


/**
 *  * Classe que representa um perfil de usuário dentro do sistema.
 * Um perfil agrupa um conjunto de permissões que podem ser atribuídas a usuários.
 * Exemplo: ADMIN, CLIENTE, MODERADOR, etc.
 * 
 * @author Davi
 */
public class PerfilUsuario {
    
    // Identificador único do perfil de usuário (pode representar a chave no banco de dados)
    private Long id;

    // Descrição textual do perfil (ex: "Administrador", "Usuário comum", etc.)
    private String descricao;

    // Lista de permissões associadas ao perfil (cada item representa uma permissão específica)
    private List<String> permissoes;

    // Construtor vazio: inicializa a lista de permissões para evitar NullPointerException ao adicionar itens
    public PerfilUsuario() {
        this.permissoes = new ArrayList<>();
    }

    // Construtor com parâmetros: permite criar o objeto já com valores definidos
    public PerfilUsuario(Long id, String descricao, List<String> permissoes) {
        // Atribui o valor do identificador ao atributo da classe
        this.id = id;

        // Define a descrição do perfil
        this.descricao = descricao;

        // Define a lista de permissões já existente (deve ser previamente inicializada)
        this.permissoes = permissoes;
    }

    // Retorna o identificador do perfil
    public Long getId() {
        return id;
    }

    // Define ou altera o identificador do perfil
    public void setId(Long id) {
        this.id = id;
    }

    // Retorna a descrição do perfil
    public String getDescricao() {
        return descricao;
    }

    // Define ou altera a descrição do perfil
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Retorna a lista de permissões associadas ao perfil
    public List<String> getPermissoes() {
        return permissoes;
    }

    // Define ou substitui completamente a lista de permissões do perfil
    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    // Adiciona uma nova permissão à lista existente
    public void adicionarPermissao(String permissao) {
        // Insere a permissão informada na lista de permissões
        this.permissoes.add(permissao);
    }

    // Sobrescreve o método toString para fornecer uma representação legível do objeto
    @Override
    public String toString() {
        return "PerfilUsuario{" +
                // Inclui o id na representação textual
                "id=" + id +
                // Inclui a descrição entre aspas para melhor visualização
                ", descricao='" + descricao + '\'' +
                // Exibe a lista de permissões associadas
                ", permissoes=" + permissoes +
                '}';
    }
    
}
