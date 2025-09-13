public class Atleta extends Pessoa{

    private String esportePraticado = "Não pratica esportes!";
    private boolean praticaEsportes = false;

    @Override
    public double calculoIMC(){
        double imc = getPeso()/(getAltura() * getAltura());
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

    public boolean getPraticaEsportes() {
        return praticaEsportes;
    }
    public void setPraticaEsportes(boolean praticaEsportes) {
        this.praticaEsportes = praticaEsportes;
    }
}
