package maratonajava.classes.teste;

import maratonajava.classes.model.Carro;

public class Carros {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.Ano = 2012;
        carro01.Modelo = "Fiat";
        carro01.Nome = "FastBack";

        carro02.Ano = 2025;
        carro02.Modelo = "Audi";
        carro02.Nome = "Q5";

        System.out.println("Nome: "+carro01.Nome+"\nModelo: "+carro01.Modelo+"\nAno: "+carro01.Ano+"\n");
        System.out.println("Nome: "+carro02.Nome+"\nModelo: "+carro02.Modelo+"\nAno: "+carro02.Ano);



    }
}
