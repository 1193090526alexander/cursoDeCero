import java.util.Locale;

public class HolaMundo {
    public static  void main(String[] args){

        String saludar = "Hola Soy Helmer Alexander Patiño ";
        System.out.println(saludar.toUpperCase());
        
        int numero = 13;
        System.out.println("numero = " + numero);
        boolean valor = true;
        var numero2 = 13;
        if (valor == true){
            numero2 = 1;
            System.out.println(numero2);
        }
        String nombre;
        nombre = "lolita";
        if (numero>12){
            nombre = "Manuela";
        }
        System.out.println(nombre);
    }
}
