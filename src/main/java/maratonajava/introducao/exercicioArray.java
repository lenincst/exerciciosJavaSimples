package maratonajava.introducao;

public class exercicioArray {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Maria";
        names[1] = "João";
        names[2] = "Julia";
        names[3] = "Lucia";

        for (int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
