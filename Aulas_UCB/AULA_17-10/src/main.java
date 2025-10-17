public class main {
    public static void main(String[] args) {

        Passaro passaro = new Passaro("Papagaio");
        passaro.voar();
        System.out.println("<<<<<=================>>>>>");
        Voavel voa = passaro;
        voa.voar();

        Pato pato = new Pato("Pato");
        pato.nadar();
        pato.voar();
        System.out.println("<<<<<=================>>>>>");
        Voavel nada = pato;
        nada.voar();

    }
}