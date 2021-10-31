import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class FlujoDoWhileEx{
    public static void main(String[] args) {
        /* Mismo bucle que con el Bucle While 
        Hasta que el usuario teclee algo distinto 
        a "S" o "s" se detiene las iteraciones*/
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int menor=1, mayor=49, numero=0;
        boolean seguir=false;

        //bucle do While
        do{
            numero= aleatorio.nextInt(mayor-menor+1) + menor;
            System.out.println("Numero: "+ numero);
            System.out.println("Quieres otro número?");
            String opcion= teclado.next();
            seguir = opcion.equals("s") || opcion.equals("S")? true : false;
        }while( seguir );
        System.out.println("FIN");   
    }
}