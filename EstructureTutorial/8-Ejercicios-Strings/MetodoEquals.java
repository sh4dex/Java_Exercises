import java.util.Scanner;

public class MetodoEquals{
  public static void main(String[] args){
  
  Scanner nombres = new Scanner(System.in);
  String nombre_uno = "", nombre_dos = "";
  
  System.out.print("Ingrese el primer nombre: ");
  nombre_uno = nombres.nextLine();
  System.out.print("Ingrese el segundo nombre: ");
  nombre_dos = nombres.nextLine();
  
  if(nombre_uno.equalsIgnoreCase(nombre_dos)){
   System.out.println("Los nombres son iguales.");
  } else {
   System.out.println("Los nombres son diferentes.");
  }
 }
}
