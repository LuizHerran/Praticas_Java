public class Main {
    public static void main(String[] args) {
        //Deve mostrar caracteristicas do carro como marca e ano, alem de informações do motor como potencia e tipo
        //de combustivel

        Carro carro = new Carro();
        carro.Marca = "Fiat";
        carro.ano = 1984;
        Motor motor = new Motor();
        motor.combustivel = "Se bota até alcool 70 ele anda";
        motor.potencia = 52;
        carro.motor = motor;

        carro.dados_Carro();
    }
}
