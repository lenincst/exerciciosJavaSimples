package org.introducao;

public class exercicioContinue {
    public static void main(String[] args) {
        double car = 35000;
        for (int payment = (int) car; payment >= 1; payment--) {
            double pay = car / payment;
            if (pay < 1000) {
                continue;
            }
            System.out.println("Pagando em " + payment + " parcelas, cada parcela vai ser de R$" + (int) pay);
        }
    }
}
