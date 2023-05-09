package operadores;

import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {

        int j = 5;
        int x = 4;

        int suma = j + x;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (x + j));

        int resta = j -x;
        System.out.println("resta = " + resta);
        System.out.println("j-x= " + (j-x));

        int multi = j*x;
        System.out.println("multi = " + multi);

        int div = j/x;
        float div2 = (float)j/x;
        System.out.println("div2 = " + div2);
        System.out.println("div = " + div);
        
        int resto = j%x;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero%2==0){
            System.out.println("el numero es par" + numero);
        }else {
            System.out.println("el numero es impar" + numero);

        }

    }
}
