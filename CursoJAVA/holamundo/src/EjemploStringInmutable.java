public class EjemploStringInmutable {
    public static void main(String[] args) {
        String Curso = "Programacion Java";
        String profesor = "Helmer Alexander Patiño Quintero";

        String resultado= Curso.concat(profesor);
        System.out.println("Curso = " + Curso);
        System.out.println("resultado = " + resultado);
        System.out.println(Curso == resultado);

        String resultado3= resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);


    }
}
