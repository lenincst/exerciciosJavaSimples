package maratonajava.introducao;

public class exercicioArrayForeach {
    public static void main(String[] args) {
        //exemplos de inicialização de arrays
        int[] numero = new int[3];
        int numero1[] = {1, 2, 3, 4, 5};
        int numero2[] = new int[]{1, 2, 3, 4, 5};

//        for (int i = 0; i < numero2.length; i++){
//            System.out.println(numero2[i]);
//        }

        //Outra forma de percorrer o Array
        for (int num : numero2) {
            System.out.println(num);
        }
    }
}
