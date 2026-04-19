/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;


// Importa a classe LocalDateTime da biblioteca padrão do Java,
// utilizada para representar data e hora (sem fuso horário),
// permitindo registrar com precisão o momento em que eventos ocorrem
import java.time.LocalDateTime;

/**
 *
 * @author Davi
 */

// Classe responsável por registrar eventos importantes do sistema para auditoria
public class LogAuditoria {
    
    // Identificador único do log de auditoria (pode ser usado como chave no banco de dados)
    private Long id;

    // Usuário responsável pela ação registrada no log
    private Usuario usuario;

    // Descrição da ação realizada (ex: "LOGIN", "ALTERAÇÃO DE DADOS", etc.)
    private String acao;

    // Data e hora exatas em que a ação ocorreu
    private LocalDateTime dataHora;

    // Endereço IP de onde a ação foi executada (útil para rastreamento e segurança)
    private String ip;

    // Construtor vazio: permite instanciar o objeto sem valores iniciais
    public LogAuditoria() {
    }

    // Construtor com parâmetros: permite criar o log já com todas as informações preenchidas
    public LogAuditoria(Long id, Usuario usuario, String acao, LocalDateTime dataHora, String ip) {
        // Define o identificador do log
        this.id = id;

        // Associa o usuário responsável pela ação
        this.usuario = usuario;

        // Define a ação realizada
        this.acao = acao;

        // Define a data e hora da ação
        this.dataHora = dataHora;

        // Define o IP de origem da ação
        this.ip = ip;
    }

    // Retorna o identificador do log
    public Long getId() {
        return id;
    }

    // Define ou altera o identificador do log
    public void setId(Long id) {
        this.id = id;
    }

    // Retorna o usuário associado a este log
    public Usuario getUsuario() {
        return usuario;
    }

    // Define ou altera o usuário associado ao log
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Retorna a descrição da ação registrada
    public String getAcao() {
        return acao;
    }

    // Define ou altera a descrição da ação
    public void setAcao(String acao) {
        this.acao = acao;
    }

    // Retorna a data e hora em que a ação ocorreu
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    // Define ou altera a data e hora da ação
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Retorna o endereço IP associado ao log
    public String getIp() {
        return ip;
    }

    // Define ou altera o endereço IP
    public void setIp(String ip) {
        this.ip = ip;
    }

    // Sobrescreve o método toString para gerar uma representação textual detalhada do log
    @Override
    public String toString() {
        return "LogAuditoria{" +
                // Exibe o id do log
                "id=" + id +
                // Exibe o nome do usuário, se existir; evita erro caso seja nulo
                ", usuario=" + (usuario != null ? usuario.getNomeUsuario() : "null") +
                // Exibe a ação realizada entre aspas
                ", acao='" + acao + '\'' +
                // Exibe a data e hora da ação
                ", dataHora=" + dataHora +
                // Exibe o IP de origem entre aspas
                ", ip='" + ip + '\'' +
                '}';
    }
}
