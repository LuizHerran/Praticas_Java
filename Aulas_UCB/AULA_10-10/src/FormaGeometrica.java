public abstract class FormaGeometrica {
    //protected só pode ser usado nas subclasses
    protected String cor;

    public FormaGeometrica(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    //metodo concreto
    public void exibircor() {
        System.out.printf("""
                //============================\\\\
                ||
                ||\tA cor da forma é: %s
                ||
                \\\\============================//
                """, cor);
    }

        public abstract double calcularArea();

        public void exibirDetalhes(){
            System.out.printf("""
                    //====================================\\
                    ||
                    ||\tA cor da forma é: %s
                    ||
                    \\\\================================//
                    """, cor);
            System.out.println(calcularArea());
        }

}
