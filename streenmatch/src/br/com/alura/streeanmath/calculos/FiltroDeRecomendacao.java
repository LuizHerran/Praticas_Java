package br.com.alura.streeanmath.calculos;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel calssificavel){
        if(calssificavel.getClassificacao()>=4){
            System.out.println("Está entre os preferiveis do momento!");
        }else if(calssificavel.getClassificacao()>=2){
            System.out.printf("Muito bem avaliado no momento!");
        }else {
            System.out.printf("Coloque na sua lista para assistir depois!");
        }
    }
}
