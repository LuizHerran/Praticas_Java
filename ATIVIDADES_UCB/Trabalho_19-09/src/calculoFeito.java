public class calculoFeito {

    public void mostrarDados(Pessoa p){
        System.out.printf("""
            //=====================================\\\\
            ||
            ||\tNome: %s
            ||\tPeso: %.2f
            ||\tAltura: %.2f
            ||\tIMC: %.2f
            ||
            \\\\=================================//
            """, p.getNome(), p.getPeso(), p.getAltura(), p.CalculoIMC());
    }
}
