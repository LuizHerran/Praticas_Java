public class Atleta extends Pessoa{

    private String esportePraticado = "Não pratica esportes!";


    @Override
    public double calculoIMC(boolean praticaEsportes){
        double imc = super.calculoIMC(praticaEsportes);
        if(praticaEsportes){
            imc *= 0.95;
        }
        return imc;
    }


    public String getEsportePraticado() {
        return esportePraticado;
    }
    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}
