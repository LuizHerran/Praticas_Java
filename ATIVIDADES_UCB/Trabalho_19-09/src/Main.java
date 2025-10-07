void main(){

    Pessoa pessoa = new Pessoa();
    pessoa.setNome("Ana");
    pessoa.setPeso(86.50);
    pessoa.setAltura(1.78);

    Atleta atleta = new Atleta();
    atleta.setNome("Paulo");
    atleta.setPeso(86.50);
    atleta.setAltura(1.78);
    atleta.setPraticaEsportes(true);

    calculoFeito calculo = new Calculo();
    calculo.mostrarDados(pessoa);
    calculo.mostrarDados(atleta);

}