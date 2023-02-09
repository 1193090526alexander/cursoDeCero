public class PrimirivosCaracteres {
    public static void main(String[] args) {
        var caracter = '\u0040';
        var decimal = 65;
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = caracter:  " +( decimal == caracter));

        var simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter:  " +( simbolo == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabular   = '\t';
        char nuevalivea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde \ten byte " +System.lineSeparator() +tabular +  espacio + Character.BYTES);
        System.out.println("char corresponde en bites  " + Character.SIZE);
        System.out.println("char corresponde.MIN_VALUE " + Character.MIN_VALUE);
        System.out.println("char corresponde MAX-VALUE  " + Character.MAX_VALUE);



    }
}
