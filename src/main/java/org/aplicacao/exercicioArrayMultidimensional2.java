package org.aplicacao;

public class exercicioArrayMultidimensional2 {
    public static void main(String[] args) {
        int [] array = new int []{1,2,3,4,5,6}; //Posso especificar o valor antes e depois só buscar ele
        int [][] arrayInt = new int[3][];


        arrayInt[0] = new int[2];
        arrayInt[1] = new int [] {1,2,3}; //aqui eu já coloquei dentro do array de 3 posições os valores 1,2 e 3
        arrayInt[2] = array; // aqui eu estou buscando os valores que já foram definidos lá em cima


        for (int [] arrayBase : arrayInt){
            System.out.println("\n----");
            for (int resul :arrayBase){
                System.out.println(resul + " ");
            }
        }
    }
}
