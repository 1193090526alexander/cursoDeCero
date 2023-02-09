public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte correspónde en byte  a " + Byte.BYTES );
        System.out.println("tipo byte correspónde en bIte  a " + Byte.SIZE );
        System.out.println("el valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("el valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short correspónde en byte  a " + Short.BYTES );
        System.out.println("tipo short correspónde en bIte  a " + Short.SIZE );
        System.out.println("el valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("el valor minimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int correspónde en byte a " + Integer.BYTES );
        System.out.println("tipo int correspónde en bIte  a " + Integer.SIZE );
        System.out.println("el valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("el valor minimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 2922337203685477580L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long correspónde en byte a " + Long.BYTES );
        System.out.println("tipo long correspónde en bIte  a " + Long.SIZE );
        System.out.println("el valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("el valor minimo de un long " + Long.MIN_VALUE);

        var numeroVar = 234530329234234D;

    }
}
