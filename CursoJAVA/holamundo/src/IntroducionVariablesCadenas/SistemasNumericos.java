package IntroducionVariablesCadenas;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
             numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar numero entero");
            main(args);
            System.exit(0);
        }



        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de  = " + numeroDecimal + "  = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);
        int numeroBinario = 0b11110; // Si queremos representar un nu mero binario ponemos "0b" al inicio
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        int numeroOctal = 036; //Si queremos representar un numero octal ponemos "0" al inicio
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexadecimal = "numero hexadecimal de  = " + numeroDecimal+ " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexadecimal);
        int numerohex = 0x1E; //Si queremos representar un numero hexadecimal ponemos "0X" al inicio
        System.out.println("numerohex = " + numerohex);

        String mensaje = "\n"+mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
   
    }
}
