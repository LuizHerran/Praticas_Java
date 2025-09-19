public class Main {
    public static void main(String[] args) {

        Atleta atleta1 = new Atleta();
        atleta1.setNome("Maria");
        atleta1.setAltura(1.78);
        atleta1.setPeso(86.50);
        Atleta atleta2 = new Atleta();
        atleta2.setNome("Joao");
        atleta2.setAltura(1.78);
        atleta2.setPeso(86.50);
        atleta2.setPraticaEsportes(true);
        atleta2.setEsportePraticado("Parkuor");
        calculoFeito mostrar = new calculoFeito();

        mostrar.mostrarDados(atleta1);
        mostrar.mostrarDados(atleta2);
    }
}
