public class CarroEletrico implements Autonomo, Recarregavel{

    String modelo;

    public CarroEletrico(String modelo){
        this.modelo = modelo;
    }


    @Override
    public void dirigirAutonomo(String destino) {
        System.out.printf("Dirigir autonomamente para o destino %s\n", destino);
    }

    @Override
    public void recarregar(int tempoMinuto) {
        System.out.printf("RECARREGANDO POR %d MINUTOS\n", tempoMinuto);
    }
}
