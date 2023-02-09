import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura");
        String nombreFactura = scanner1.nextLine();

        System.out.println("Ingrese un precio ");
        double precio = scanner1.nextDouble();

        System.out.println("Ingrese un nuevo precio ");
        double precio2 = scanner1.nextDouble();

        double preciototal = (precio+precio2);
        double impuesto = preciototal*0.19;
        double total = preciototal + impuesto;

        String mensaje = "La factura " + nombreFactura + " de oficina tiene un total bruto de" + preciototal + " con un impuesto de "
                +impuesto + " y el monto después de impuesto es de " + total;

        System.out.println( mensaje);

    }
}
