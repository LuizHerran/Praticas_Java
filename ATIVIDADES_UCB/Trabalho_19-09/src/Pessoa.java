public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private double imc;
    private Atleta atleta;

    public double calculoIMC(){
        return this.imc = this.peso/(this.altura*this.altura);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }

    public Atleta getAtleta() {
        return atleta;
    }
    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
}