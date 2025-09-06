public class Ebook extends Livro {
    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    Ebook(String waterMarks){
        super();
        waterMark = waterMarks;
    }

    void dadosEbook(){
        System.out.printf("""
                ||
                ||\t%s
                ||
                """,waterMark);
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 15){
            System.out.printf("Não é possivel dar desconto maior que 15%!");
            return false;
        }
        return super.aplicarDescontoDe(porcentagem);
    }

    public String getWaterMark() {
        return waterMark;
    }
    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }
}
