package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {


        int j = 6;
        int x = j + 3;

        System.out.println("j = " + j);
        System.out.println("x = " + x);

        j+=2; //j = j+2
        System.out.println("j = " + j);

        x-=2; //j = j-2
        System.out.println("x = " + x);

        j*=2; //j = j*2
        System.out.println("j = " + j);

        String sqlString= "select * from clientes as c ";
        sqlString += "where c.nombre='Andres'";
        System.out.println("sqlString = " + sqlString);
    }
}
