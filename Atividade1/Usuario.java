package Atividade1;
// Caio Cruz RA 15.01580-7

public class Usuario {
    private static String nome;
    private static String senha;
    private static String email;

    public Usuario(String nome, String senha,String email){
        Usuario.nome = nome;
        Usuario.senha = senha;
        Usuario.email = email;
    }
    public boolean aprovarsenha(String senha){
        return senha.equals(senha);
    }

    public String getNome() {
        return nome;
    }
}
