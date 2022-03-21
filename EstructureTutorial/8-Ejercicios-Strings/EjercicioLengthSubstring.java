import java.util.Scanner;

public class EjercicioLengthSubstring{
  public static void main(String args []){
  
  Scanner in = new Scanner(System.in);
  String cadena_original = "", cadena_substraccion = "";
  int num_caracteres = 0, desde = 0, hasta = 0;

  System.out.print("Ingrese una cadena de caracteres: ");
  cadena_original = in.nextLine();

  num_caracteres = cadena_original.length();

  System.out.println("la cadena de caracteres: " + cadena_original + " posee " +
                     num_caracteres + " caracteres.");

  System.out.print("¿Desde que caracter deseas obtener la nueva cadena?: ");
  desde = in.nextInt();
  System.out.print("¿Hasta que caracter deseas obtener la nueva cadena?: ");
  hasta = in.nextInt();
  
  cadena_substraccion = cadena_original.substring(desde, hasta);
  System.out.println("Tu nueva cadena es: " + cadena_substraccion);
 }
}