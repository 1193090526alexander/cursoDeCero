package operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int j = -5;

        int i = +j; // i = (1)*j => -5
        System.out.println("i = " + i);

        int k = - j; //k = (-1)*j =>5
        System.out.println("k = " + k);

        j= 6;
        i = +j;
        System.out.println("i = " + i);

        k= -j;
        System.out.println("k = " + k);
    }
}
