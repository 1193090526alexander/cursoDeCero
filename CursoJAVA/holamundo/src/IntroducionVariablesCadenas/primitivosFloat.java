package IntroducionVariablesCadenas;

public class primitivosFloat {
    static long floatDefecto;
    public static void main(String[] args) {
        float realFloat = 2.12e-5f;//212000f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float correspónde en byte a " + Float.BYTES );
        System.out.println("tipo float correspónde en bIte  a " + Float.SIZE );
        System.out.println("el valor maximo de un float " + Float.MAX_VALUE);
        System.out.println("el valor minimo de un float " + Float.MIN_VALUE);

        double realdouble = 3.4028235E38;
        System.out.println("realdouble = " + realdouble);
        System.out.println("tipo double correspónde en byte a " + Double.BYTES );
        System.out.println("tipo double correspónde en bites  a " + Double.SIZE );
        System.out.println("el valor maximo de un double " + Double.MAX_VALUE);
        System.out.println("el valor minimo de un double " + Double.MIN_VALUE);

        var varFlotante = 127l;
        System.out.println("varFlotante = " + varFlotante);
        //float floatDefecto = 0.0f;
        System.out.println("floatDefecto = " + floatDefecto);
    }
}
