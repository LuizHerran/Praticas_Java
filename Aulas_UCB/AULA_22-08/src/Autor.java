public class Autor {
    
    String nome;
    String email;
    String cpf;

    void dados_autor(){
        System.out.printf("""
                |/
                ||\tNome do Autor/a: %s
                ||\tE-mail: %s
                ||\tCPF: %s
                \\\\==============================//
                """,nome, email, cpf);
    }
}
