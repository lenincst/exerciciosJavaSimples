package org.introducao;

public class exercicioBreak {
    public static void main(String[] args) {
        double car = 35000;
        double pay = 0;

        for (double payment = 1; payment <= 1000; payment++) {

            pay = car / payment;

            if (pay >= 1000) {
                System.out.println("Pagando em " + (int) payment + " parcelas, cada parcela vai ser de R$" + (int) pay);
            } else {
                break;
            }
        }
    }
}
