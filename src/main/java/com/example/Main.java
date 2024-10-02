package com.example;

public class Main {
    public static void main(String[] args) {
        // Cria uma instância do UsuarioController
        UsuarioController controller = new UsuarioController();

        // Cria um novo usuário
        Usuario novoUsuario = new Usuario("","Sophia", 23, "Rua das Rosas");

        // Chama o método create para adicionar o novo usuário
        controller.create(novoUsuario);

        // Se você quiser ler a lista de usuários depois de criar
         controller.read(); // Descomente esta linha se quiser ler a lista após a criação
    }
}
