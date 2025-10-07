public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    private boolean praticaEsportes = false;

    public double CalculoIMC(){
        double IMC = peso/(altura*altura);
        return IMC;
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

    public boolean isPraticaEsportes() {
        return praticaEsportes;
    }
    public void setPraticaEsportes(boolean praticaEsportes) {
        this.praticaEsportes = praticaEsportes;
    }
}
