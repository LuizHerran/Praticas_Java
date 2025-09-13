public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta();
        atleta1.setNome("Maria");
        atleta1.setAltura(1.54);
        atleta1.setPeso(61.30);
        Atleta atleta2 = new Atleta();
        atleta2.setNome("Joao");
        atleta2.setAltura(1.78);
        atleta2.setPeso(86.50);
        atleta2.setPraticaEsportes(true);
        atleta2.setEsportePraticado("Parkuor");

        mostrarDados(atleta1);
        mostrarDados(atleta2);

    }
    public static void mostrarDados(Pessoa p) {
        System.out.printf("""
                //======================================\\\\
                ||
                ||\tNome: %s
                ||\tAltura: %.2f
                ||\tPeso: %.2f Kg
                ||\tIMC: %.2f
                %s
                \\\\=========================================//
                """,
                p.getNome(), p.getAltura(), p.getPeso(), p.calculoIMC(),
                (p instanceof Atleta a) ? "||\tPratica: " + ((a.getPraticaEsportes() ? "Sim" : "Não") + "\n||\tEsporte: " + a.getEsportePraticado()) : "");
    }
}
