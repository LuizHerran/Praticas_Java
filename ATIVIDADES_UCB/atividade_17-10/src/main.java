public class main {
    /*
        Desafio: Veiculos eletricos
        1 - Cire duas interfaces:
        A primeria vai ser RECARREGAVEL - metodo abstrato void recarregar(int tempoMinutos);
        imprima algo como RECARREGANDO POR X MINUTOS. - int TEMPOMAXIMO = 30;

        A segunda interface AUTONOMO - metodo abstrato void dirigirAutonomo(String destino);
        imprima algo como Dirigir autonomamente para o destino  - Boolean suporteGPS = true;

        2 - Crei uma classe
        CarroEletrico que implemente ambas a interfaces, adicione um atributo String modelo no construtro
        nas implementações use o modelo O MODELO X ESTA RECARREGANDO.

        3 - Na calsse Main
        Crie um objeto carroEletrico chame os metodos via referencias das interfaces "polimorfismo" e use as constantes.
         */
    public static void main(String[] args) {

        CarroEletrico carroEletrico = new CarroEletrico("Tesla");
        Autonomo auto = carroEletrico;
        Recarregavel recarrega = carroEletrico;
        auto.dirigirAutonomo("Barcelona");
        recarrega.recarregar(32);
    }
}
