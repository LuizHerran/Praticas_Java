public class calculoFeito {

    private double valorIMC;

    public void mostrarDados(Pessoa p) {

        valorIMC = p.calculoIMC(p.getPraticaEsportes());

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
                p.getNome(), p.getAltura(), p.getPeso(), valorIMC,
                (p instanceof Atleta a) ? "||\tPratica: " + ((a.getPraticaEsportes() ? "Sim" : "Não") + "\n||\tEsporte: " + a.getEsportePraticado()) : "");
    }

}
