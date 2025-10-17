public class Passaro implements Voavel {
    private String nome;

    public Passaro(String nome){
        this.nome = nome;
    }

    @Override
    public void voar() {
        IO.print("//=========================================================\\\\\n||\n");
        System.out.printf("||\t%s está voando %d metros a acima do solo.", nome, ALTITUDE_MAXIMA);
        IO.print("\n||\n\\\\=========================================================//\n");
    }
}
