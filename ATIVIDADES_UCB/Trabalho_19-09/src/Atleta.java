public class Atleta extends Pessoa{

    public double CalculoIMC(){
        double IMC = super.CalculoIMC();
        IMC *= 0.95;
        return IMC;
    }
}
