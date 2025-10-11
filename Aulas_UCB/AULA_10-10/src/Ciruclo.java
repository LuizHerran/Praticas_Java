public class Ciruclo extends FormaGeometrica {
    private Double raio;

    //Construtor obrigatoriamente erdado.
    public Ciruclo(String cor, Double raio) {
        super(cor);
        this.raio = raio;

    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    /*Metodo especifico da subclasse
    public void calcularArea(){
        double area = Math.PI * raio *raio;

        System.out.printf("""
                //===========================\\\\
                ||
                ||\tA area do ciruclo é: %.2f
                ||
                \\\\========================//
                """, area);
    }*/


}
