public class Atleta extends Pessoa{
    private String esportePraticado;

    public double CalculoIMC(){
        double IMC = super.CalculoIMC();
        IMC *= 0.95;
        return IMC;
    }
}
