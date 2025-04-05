package maratonajava.metodos.teste;

import maratonajava.metodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 5);
        System.out.println(result);
        System.out.println("\n-----------\n");
        calculadora.imprimeDivisao(20, 0);
    }

}
