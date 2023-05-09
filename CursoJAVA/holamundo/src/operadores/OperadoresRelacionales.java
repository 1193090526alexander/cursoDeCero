package operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j =9;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean t = false;

        boolean res = i == j;
        System.out.println("res = " + res);

        boolean res2 = !res;
        System.out.println("res2 = " + res2);

        boolean res3 = i != j; //<>
        System.out.println("res3 = " + res3);

        boolean res4 = t == true;
        System.out.println("res4 = " + res4);

        boolean res5 = t != true;
        System.out.println("res5 = " + res5);

        boolean res6 = i>j;
        System.out.println("res6 = " + res6);

        boolean res7 = i<j;
        System.out.println("res7 = " + res7);

        boolean res8 = k>=l;
        System.out.println("res8 = " + res8);

        boolean res9 = k<=l;
        System.out.println("res9 = " + res9);
    }
}
