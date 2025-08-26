public class Carro {
    String Marca;
    int ano;
    Motor motor;

    void dados_Carro(){
        System.out.printf("""
                //==================================\\\\
                ||\tMarca: %s
                ||\tAno: %d
                |\\
                """,Marca,ano);
                motor.dados_motor();
    }
}
