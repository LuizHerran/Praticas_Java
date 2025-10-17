public class Pato implements Nadavel, Voavel{

    private String nome;
    public Pato(String nome){
        this.nome = nome;
    }

    public void nadar(){
        System.out.printf("O pato está nadando a %.2f km/h\n", VELOCIDADE_MAXIMA);
    }
    public void voar(){
        System.out.printf("O pato esta voando a %d metros do chão.\n", ALTITUDE_MAXIMA);
    }

}
