package IntroducionVariablesCadenas;

import java.util.Scanner;

public class numerosPrimos {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            boolean esPrimo = true;
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(numero + " es un número primo");
            } else {
                System.out.println(numero + " no es un número primo");
            }
        }


}
