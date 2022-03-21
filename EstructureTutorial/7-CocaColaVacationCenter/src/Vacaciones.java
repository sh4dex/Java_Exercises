import java.util.Scanner;

public class Vacaciones{
 public static void main(String args []){
 
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;
   
   System.out.println("¡Bienvenido al sistema de gestión vacacional de Coca-Cola Company!");
   
   System.out.println("¿Cuál es tu nombre?");
   nombre = in.nextLine();
   
   System.out.println("Escribe tu clave de departamento (1 - 3):");
   clave = in.nextInt();
   
   System.out.println("Escribe tus años de antiguedad en la compañia:");
   antiguedad = in.nextInt();
   
     if (clave == 1 ){
     if (antiguedad == 1){
      System.out.println(nombre + ", tienes derecho a 6 días de vacaciones."); 
    } else if (antiguedad >= 2 && antiguedad <= 6){
      System.out.println(nombre + ", tienes derecho a 14 días de vacaciones.");
    } else if (antiguedad >= 7){
      System.out.println(nombre + ", tienes derecho a 20 días de vacaciones.");
    } else {
      System.out.println(nombre + ", aún no tienes derecho a vacaciones.");
    }
   }
   
     if (clave == 2 ){
     if (antiguedad == 1){
      System.out.println(nombre + ", tienes derecho a 7 días de vacaciones.");
    } else if (antiguedad >= 2 && antiguedad <=6){
      System.out.println(nombre + ", tienes derecho a 15 días de vacaciones.");
    } else if (antiguedad >= 7) {
      System.out.println(nombre + ", tienes derecho a 22 días de vacaciones.");
    } else {
      System.out.println(nombre + ", aún no tienes derecho a vacaciones.");
    }
   }
   
    if (clave == 3 ){
     if (antiguedad == 1){
      System.out.println(nombre + ", tienes derecho a 10 días de vacaciones.");
    } else if (antiguedad >= 2 && antiguedad <=6){
      System.out.println(nombre + ", tienes derecho a 20 días de vacaciones.");
    } else if (antiguedad >= 7) {
      System.out.println(nombre + ", tienes derecho a 30 días de vacaciones.");
    } else {
      System.out.println(nombre + ", aún no tienes derecho a vacaciones.");
    } 
   }
 }
}
