public class Autor {

    private String nome;
    private String email;
    private String cpf;

    void dados_autor(){
        System.out.printf("""
                \n|/
                ||\tNome do Autor/a: %s
                ||\tE-mail: %s
                ||\tCPF: %s
                \\\\==============================//
                """,nome, email, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
