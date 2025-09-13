public class Livro_Fisico extends Livro{

        double txImpressao = 2.30;

    Livro_Fisico(double valor){
        this.txImpressao = valor;
    }

    public void dadosImpressao(){

        System.out.printf("""
                ||\tTaxa de impressão de R$%.2f
                """, txImpressao);
    }
}
