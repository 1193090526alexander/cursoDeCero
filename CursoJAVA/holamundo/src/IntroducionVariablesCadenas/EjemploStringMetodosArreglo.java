package IntroducionVariablesCadenas;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String Trabalenguas = "Trabalenguas";
        System.out.println("Trabalenguas.toCharArray() = " + Trabalenguas.toCharArray());
        char[] arreglo =Trabalenguas.toCharArray();
        for (int i = 0; i<arreglo.length; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }
        System.out.println("Trabalenguas = " + Trabalenguas.split("a"));
        String []arreglo2 = Trabalenguas.split("a");
        for (int j = 0; j<arreglo2.length; j++){
            System.out.println( arreglo2[j]);
        }

        String archivo = "alguna.imagen.jpg";
        String[]archivoArr = archivo.split("\\.");//[.]
        for (int i = 0; i<archivoArr.length; i++){
            System.out.println(archivoArr[i]);
        }


    }
}
