package operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        //pre incremento
        int j = 2;
        int i = ++j; // j = j + 1;

        System.out.println("pre incremento i = " + i);
        System.out.println("pre incremento j = " + j);

        //post incremnto

        i = 2;
        j = i++;

        System.out.println("post incremntoi = " + i);
        System.out.println("post incremnto j = " + j);

        //pre decremento
        j = 5;
        i = --j; // j = j - 1;

        System.out.println("pre decremento i = " + i);
        System.out.println("pre decremento j = " + j);

        //post decremento
        j = 5;
        i = j--; // j = j - 1;

        System.out.println("post decremento j = " + j);
        System.out.println("post decremento i = " + i);

        System.out.println("(++i) = " + (++i));
        System.out.println("(++i) = " + (i++));
        System.out.println("i = " + i);




    }
}
