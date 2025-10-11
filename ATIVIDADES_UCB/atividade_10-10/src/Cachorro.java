public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void estaDormindo() {
        System.out.printf("""
                //===========================\\\\
                ||
                ||\tO Cachorro %s
                ||\tEsta dormindo!
                """, nome);
    }

    @Override
    public void som() {
        System.out.printf("""
                ||
                || Au Au Au
                \\\\==============================//
                
                """);
    }
}
