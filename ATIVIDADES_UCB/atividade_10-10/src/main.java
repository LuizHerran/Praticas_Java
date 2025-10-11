/*
    //Sistema de animais crie uma classe abstrata chamada de ANIMAL com :
    Atributo protegido String nome
    Construtor que recebe o nome

    Metodo concreto sem retorno que imprima o 'animal' está dormindo.
    Metodo abstrato sem retorno fazerSom (som do animal).

    Crie duas sub calsses:
    Cachorro - fazerSom
    Gato - fazerSom

    Na classe main crie uma lista de animais usando arraylist, com dois dogs e dois cats, use o loop forEaht, para
    chamar domir e fazer som.
    */

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        /*
        List<CLASSE> variavel = new ArrayList<>();
        variavel.add();

        for(CLASSE_MÃE SUBCLASSE : VARIAVEL_ARRAYLIST){}
         */

        ArrayList<Animal> listaAnimal = new ArrayList<>();
        listaAnimal.add(new Cachorro("Clebin"));
        listaAnimal.add(new Cachorro("Caramelo"));
        listaAnimal.add(new Cachorro("Neguin"));
        listaAnimal.add(new Gato("Fumaça"));
        listaAnimal.add(new Gato("Rajado"));
        listaAnimal.add(new Gato("Tom"));

        for(Animal bixo : listaAnimal){
            bixo.estaDormindo();
            bixo.som();

        }

    }
}
