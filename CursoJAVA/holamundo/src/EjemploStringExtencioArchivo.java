public class EjemploStringExtencioArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-3) = " + archivo.substring(i+1));
    }
}