public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean datologico = false;
        System.out.println("datologico = " + datologico);

        double d = 34823.8e-3; //34.823
        float f = 1.2345e2f;   //123.45
        System.out.println("f = " + f);
        System.out.println("d = " + d);

        datologico = (f>d);
        System.out.println("datologico = " + datologico);

        boolean esIgual = (3-1==4);
        System.out.println("esIgual = " + esIgual);
    }
}
