public abstract class Animal {
    protected String nome;
    protected String som;

    public Animal(String nome){
        this.nome = nome;
    }

    public abstract void estaDormindo();
    public abstract void som();
}
