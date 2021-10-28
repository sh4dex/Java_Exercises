import java.util.Scanner;

public class CicloWhile{
 public static void main(String args[]){

   Scanner numero = new Scanner(System.in);
   int i = 0;
   
   System.out.println("Ingrese un número menor a 10: ");
   i = numero.nextInt();
   
   System.out.println("Su secuencia de 2 en 2 es: ");
   
   while(i < 10){
    System.out.print(i+", ");
    i+=2;
   }
   
   System.out.println("");
   
 }
}
