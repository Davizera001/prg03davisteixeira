/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

// Importa a classe ArrayList, utilizada para criar listas dinâmicas de permissões
import java.util.ArrayList;

// Importa a interface List, que permite trabalhar com coleções de forma flexível
import java.util.List;

/**
 *
 * @author Davi
 */

// Classe principal responsável por executar o programa
public class Main {
    
    // Método principal: ponto de entrada da aplicação Java
    public static void main(String[] args) {

        // ===== Criando permissões =====

        // Cria uma lista de permissões para o perfil de administrador
        List<String> permissoesAdmin = new ArrayList<>();

        // Adiciona permissões administrativas relacionadas ao gerenciamento de usuários
        permissoesAdmin.add("CRIAR_USUARIO");
        permissoesAdmin.add("EDITAR_USUARIO");
        permissoesAdmin.add("EXCLUIR_USUARIO");

        // Cria uma lista de permissões para um usuário comum
        List<String> permissoesComum = new ArrayList<>();

        // Adiciona permissões básicas para interação com o próprio perfil
        permissoesComum.add("VISUALIZAR_PERFIL");
        permissoesComum.add("EDITAR_PROPRIO_PERFIL");

        // ===== Criando perfis =====

        // Instancia um perfil de administrador com suas permissões específicas
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", permissoesAdmin);

        // Instancia um perfil de usuário comum com permissões limitadas
        PerfilUsuario perfilComum = new PerfilUsuario(2L, "Usuário Comum", permissoesComum);

        // ===== Criando usuários =====

        // Cria o primeiro usuário utilizando o construtor vazio
        Usuario usuario1 = new Usuario();

        // Define os dados básicos do usuário administrador
        usuario1.setId(1L);
        usuario1.setPerfil(perfilAdmin);
        usuario1.setNomeUsuario("davi");
        usuario1.setEmail("davi@email.com");
        usuario1.setSenha("123");
        usuario1.setAtivo(true);

        // Cria o segundo usuário com perfil comum
        Usuario usuario2 = new Usuario();

        // Define os dados básicos do usuário comum
        usuario2.setId(2L);
        usuario2.setPerfil(perfilComum);
        usuario2.setNomeUsuario("creusa");
        usuario2.setEmail("creusa@email.com");
        usuario2.setSenha("456");
        usuario2.setAtivo(true);

        // ===== Testando login =====

        // Realiza tentativa de login com senha correta (deve ter sucesso)
        usuario1.logar("123");

        // Realiza tentativa de login com senha incorreta (deve falhar e gerar log)
        usuario2.logar("000");

        // ===== Criando sessões =====

        // Cria duas sessões para o primeiro usuário (simulando múltiplos acessos)
        Sessao sessao1 = usuario1.criarSessao();
        Sessao sessao2 = usuario1.criarSessao();

        // Cria uma sessão para o segundo usuário
        Sessao sessao3 = usuario2.criarSessao();

        // ===== Exibindo dados =====

        // Exibe os perfis cadastrados no sistema
        System.out.println("===== PERFIS =====");
        System.out.println(perfilAdmin);
        System.out.println(perfilComum);

        // Exibe os dados dos usuários
        System.out.println("\n===== USUÁRIOS =====");
        System.out.println(usuario1);
        System.out.println(usuario2);

        // Exibe as sessões criadas
        System.out.println("\n===== SESSÕES =====");
        System.out.println(sessao1);
        System.out.println(sessao2);
        System.out.println(sessao3);

        // Exibe os logs de auditoria do primeiro usuário
        System.out.println("\n===== LOGS DO USUÁRIO 1 =====");

        // Percorre a lista de logs e imprime cada registro
        for (LogAuditoria log : usuario1.getLogs()) {
            System.out.println(log);
        }

        // Exibe os logs de auditoria do segundo usuário
        System.out.println("\n===== LOGS DO USUÁRIO 2 =====");

        // Percorre a lista de logs e imprime cada registro
        for (LogAuditoria log : usuario2.getLogs()) {
            System.out.println(log);
        }
    }
    
}
