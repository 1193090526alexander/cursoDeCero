package IntroducionVariablesCadenas;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        String Nombre = "Helmer Alexander Patiño Quintero";

        System.out.println("Nombre.length() = " + Nombre.length());
        System.out.println("Nombre.toUpperCase() = " + Nombre.toUpperCase());
        System.out.println("Nombre.toLowerCase() = " + Nombre.toLowerCase());
        System.out.println("Nombre.equals(\"Helmer Alexander Patiño Quintero\") = " + Nombre.equals("Helmer Alexander Patiño Quintero"));
        System.out.println("Nombre.equals(\"helmer Alexander Patiño Quintero\") = " + Nombre.equals("helmer Alexander Patiño Quintero"));
        System.out.println("Nombre.equalsIgnoreCase(\"helmer Alexander Patiño Quintero\") = " + Nombre.equalsIgnoreCase("helmer Alexander Patiño Quintero"));
        System.out.println("Nombre.compareTo(\"Helmer Alexander Patiño Quintero\") = " + Nombre.compareTo("Helmer Alexander Patiño Quintero"));
        System.out.println("Nombre.compareTo(\"heimer\") = " + Nombre.compareTo("heimer"));
        System.out.println("Nombre.charAt(0) = " + Nombre.charAt(0));
        System.out.println("Nombre.charAt(12) = " + Nombre.charAt(12));;
        System.out.println("Nombre.charAt(Nombre.length()-1) = " + Nombre.charAt(Nombre.length()-1));

        System.out.println("Nombre.substring(6) = " + Nombre.substring(6));
        System.out.println("Nombre.substring(1, 8) = " + Nombre.substring(1, 8));

        String Trabalenguas = "Trabalenguas";
        System.out.println("Trabalenguas.replace(\"a\", \".\") = " + Trabalenguas.replace("a", "."));
        System.out.println("Trabalenguas.indexOf(\"len\") = " + Trabalenguas.indexOf("a"));//busca la primera ocurrencia
        System.out.println("Trabalenguas.lastIndexOf(\"u\") = " + Trabalenguas.lastIndexOf("u"));//Buaca la ultima ocurrencia
        System.out.println("Trabalenguas.lastIndexOf(\"z\") = " + Trabalenguas.lastIndexOf("z"));//arroja valores negativos por que no encuentra el caracter en el string
        System.out.println("Trabalenguas.contains(\"T\") = " + Trabalenguas.contains("T"));
        System.out.println("Trabalenguas.startsWith(\"Traba\") = " + Trabalenguas.startsWith("Traba"));//valida si un frase si comieza por lo que buscamos y retorna True Or False
        System.out.println("Trabalenguas.endsWith(\"ass\") = " + Trabalenguas.endsWith("ass"));
        System.out.println("  Trabalenguas ");
        System.out.println("  Trabalenguas ".trim() );
    }
}
