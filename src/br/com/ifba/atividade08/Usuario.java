/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

// Importa a classe LocalDateTime para manipulação de data e hora,
// permitindo registrar momentos como o último login do usuário
import java.time.LocalDateTime;

// Importa a classe ArrayList, utilizada como implementação de lista dinâmica
// para armazenar sessões e logs do usuário
import java.util.ArrayList;

// Importa a interface List, que define uma coleção ordenada de elementos
// permitindo trabalhar de forma mais flexível com diferentes implementações
import java.util.List;

// Importa a classe UUID, utilizada para gerar identificadores únicos,
// ideal para criação de tokens de sessão seguros
import java.util.UUID;

/**
 *
 * @author Davi
 */

// Classe que representa um usuário do sistema, incluindo dados pessoais,
// autenticação, sessões e registros de auditoria
public class Usuario {
    
    // Identificador único do usuário (geralmente usado como chave no banco de dados)
    private Long id;

    // Perfil associado ao usuário (define permissões e nível de acesso)
    private PerfilUsuario perfil;

    // Nome de usuário utilizado para login no sistema
    private String nomeUsuario;

    // Endereço de e-mail do usuário
    private String email;

    // Senha do usuário (em um sistema real, deveria estar criptografada)
    private String senha;

    // Data e hora do último login realizado pelo usuário
    private LocalDateTime ultimoLogin;

    // Indica se o usuário está ativo no sistema (true = ativo, false = inativo)
    private Boolean ativo;

    // Lista de sessões associadas ao usuário (cada login pode gerar uma sessão)
    private List<Sessao> sessoes;

    // Lista de logs de auditoria relacionados às ações do usuário
    private List<LogAuditoria> logs;

    // Construtor vazio: inicializa listas para evitar NullPointerException ao adicionar elementos
    public Usuario() {
        this.sessoes = new ArrayList<>();
        this.logs = new ArrayList<>();
    }

    // Construtor com parâmetros: permite criar um usuário já com dados definidos
    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, LocalDateTime ultimoLogin, Boolean ativo) {
        // Define o identificador do usuário
        this.id = id;

        // Associa um perfil ao usuário
        this.perfil = perfil;

        // Define o nome de usuário
        this.nomeUsuario = nomeUsuario;

        // Define o e-mail do usuário
        this.email = email;

        // Define a senha do usuário
        this.senha = senha;

        // Define o último login
        this.ultimoLogin = ultimoLogin;

        // Define se o usuário está ativo
        this.ativo = ativo;

        // Inicializa a lista de sessões
        this.sessoes = new ArrayList<>();

        // Inicializa a lista de logs
        this.logs = new ArrayList<>();
    }

    // Retorna o identificador do usuário
    public Long getId() {
        return id;
    }

    // Define ou altera o identificador do usuário
    public void setId(Long id) {
        this.id = id;
    }

    // Retorna o perfil do usuário
    public PerfilUsuario getPerfil() {
        return perfil;
    }

    // Define ou altera o perfil do usuário
    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    // Retorna o nome de usuário
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    // Define ou altera o nome de usuário
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    // Retorna o e-mail do usuário
    public String getEmail() {
        return email;
    }

    // Define ou altera o e-mail do usuário
    public void setEmail(String email) {
        this.email = email;
    }

    // Retorna a senha do usuário
    public String getSenha() {
        return senha;
    }

    // Define ou altera a senha do usuário
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Retorna a data do último login
    public LocalDateTime getUltimoLogin() {
        return ultimoLogin;
    }

    // Define ou altera a data do último login
    public void setUltimoLogin(LocalDateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    // Retorna o status de atividade do usuário
    public Boolean getAtivo() {
        return ativo;
    }

    // Define ou altera o status de atividade do usuário
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    // Retorna a lista de sessões do usuário
    public List<Sessao> getSessoes() {
        return sessoes;
    }

    // Define ou substitui a lista de sessões
    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    // Retorna a lista de logs de auditoria
    public List<LogAuditoria> getLogs() {
        return logs;
    }

    // Define ou substitui a lista de logs
    public void setLogs(List<LogAuditoria> logs) {
        this.logs = logs;
    }

    // Método responsável por simular o processo de login do usuário
    public void logar(String senhaInformada) {

        // Verifica se a senha informada é igual à senha cadastrada
        if (this.senha.equals(senhaInformada)) {
            // Atualiza o momento do último login para o horário atual
            this.ultimoLogin = LocalDateTime.now();

            // Cria um novo registro de log de auditoria para login bem-sucedido
            LogAuditoria log = new LogAuditoria();
            log.setId((long) (this.logs.size() + 1));
            log.setUsuario(this);
            log.setAcao("Login realizado com sucesso");
            log.setDataHora(LocalDateTime.now());
            log.setIp("127.0.0.1");

            // Adiciona o log à lista de logs do usuário
            this.logs.add(log);

            // Exibe mensagem de sucesso no console
            System.out.println("Login realizado com sucesso.");
        } else {
            // Cria um log registrando tentativa de login com senha incorreta
            LogAuditoria log = new LogAuditoria();
            log.setId((long) (this.logs.size() + 1));
            log.setUsuario(this);
            log.setAcao("Tentativa de login com senha incorreta");
            log.setDataHora(LocalDateTime.now());
            log.setIp("127.0.0.1");

            // Adiciona o log à lista de logs
            this.logs.add(log);

            // Exibe mensagem de erro no console
            System.out.println("Senha incorreta.");
        }
    }

    // Método responsável por criar uma nova sessão para o usuário
    public Sessao criarSessao() {
        // Instancia uma nova sessão
        Sessao sessao = new Sessao();

        // Define um identificador simples baseado na quantidade de sessões existentes
        sessao.setId((long) (this.sessoes.size() + 1));

        // Associa o usuário atual à sessão
        sessao.setUsuario(this);

        // Gera um token único para a sessão utilizando UUID
        sessao.setToken(UUID.randomUUID().toString());

        // Adiciona a sessão à lista de sessões do usuário
        this.sessoes.add(sessao);

        // Retorna a sessão criada
        return sessao;
    }

    // Sobrescreve o método toString para fornecer uma representação resumida do usuário
    @Override
    public String toString() {
        return "Usuario{" +
                // Exibe o id do usuário
                "id=" + id +
                // Exibe a descrição do perfil, se existir
                ", perfil=" + (perfil != null ? perfil.getDescricao() : "null") +
                // Exibe o nome de usuário
                ", nomeUsuario='" + nomeUsuario + '\'' +
                // Exibe o e-mail
                ", email='" + email + '\'' +
                // Exibe o último login
                ", ultimoLogin=" + ultimoLogin +
                // Exibe o status de atividade
                ", ativo=" + ativo +
                '}';
    }
    
}
