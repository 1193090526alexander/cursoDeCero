import java.util.Locale;

public class EjemploStringVlidar {
    public static void main(String[] args) {
        String Curso = null;
        boolean esNulo = Curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            Curso = " ";//"Aprendiendo java";
            System.out.println(Curso.toUpperCase());
        }
        boolean esvacio = Curso.length() == 0;
        System.out.println("esvacio = " + esvacio);

        boolean esvacio2 = Curso.isEmpty();
        System.out.println("esvacio2 = " + esvacio2);

        boolean esBlanco = Curso.isBlank();
        if (!esBlanco) {
            System.out.println(Curso.concat(" ").concat("curso de cero"));
            System.out.println("Bienvenidos al curso ".concat(Curso));
            System.out.println("Bienvenidos al curso " + Curso);
            System.out.println();
        }

        if (!esvacio) {
            System.out.println(Curso.concat(" ").concat("curso de cero"));
            System.out.println("Bienvenidos al curso ".concat(Curso));
            System.out.println("Bienvenidos al curso " + Curso);
            System.out.println();
        }
        if (!(Curso.length() == 0)) {
            System.out.println(Curso.concat(" ").concat("curso de cero"));
            System.out.println("Bienvenidos al curso ".concat(Curso));
            System.out.println("Bienvenidos al curso " + Curso);
        }
    }
}
