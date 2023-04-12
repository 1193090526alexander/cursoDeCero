public class EjemploStringConcatenar {
    public static void main(String[] args) {
        String Curso = "Programacion Java";
        String Curso2 = new String("programacion Java");
        boolean esIgual = Curso ==Curso2;
        System.out.println("Curso ==Curso2 = " + esIgual);

        esIgual= Curso.equalsIgnoreCase(Curso2);
        System.out.println("Curso.equalsIgnoreCase(Curso2)= " + esIgual);

        String Curso3 = "Programacion Java";
        esIgual = Curso ==Curso3;
        System.out.println("Curso ==Curso3= " + esIgual);


        //Concatenacion en java
        String concatenacion = "Programacion java";
        String nombre = "Helmer Alexander Patiño Quintero";

        String detalle = concatenacion + " Instructo "+ nombre;
        System.out.println(detalle);

        int numero= 10;
        int numeroA = 5;
        System.out.println(detalle +" "+ (numero + numeroA));
        System.out.println(numero+numeroA+" "+detalle);
        String detalle2 = concatenacion.concat(" ".concat(nombre));
        System.out.println("detalle2 = " + detalle2);

    }
}
