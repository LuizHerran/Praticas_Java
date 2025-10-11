public class Gato extends Animal{
    public Gato(String nome){
        super(nome);
    }

    @Override
    public void estaDormindo() {
        System.out.printf("""
                //==========================\\\\
                ||
                ||\tO gato %s
                ||\tEsta dormindo!
                """, nome);
    }

    @Override
    public void som() {
        System.out.printf("""
                ||
                ||\tMiau Miiiaau
                ||
                \\\\=========================//
                
                """);
    }
}
