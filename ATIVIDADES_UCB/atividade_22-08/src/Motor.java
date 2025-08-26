public class Motor {
    String combustivel;
    int potencia;

    void dados_motor(){
        System.out.printf("""
                |/
                ||\tCombustivel do motor: %s.
                ||\tPotencia: %d Cavalos.
                \\\\==============================//
                """,combustivel,potencia);
    }
}
