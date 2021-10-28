import java.util.Scanner;

public class DoWhile{
  public static void main(String args[]){
 
  Scanner num = new Scanner(System.in);
  int i = 0;
   
  System.out.println("Ingrese un numero mayor a 0: "); 
  i = num.nextInt();
   
  System.out.println("Su secuencia que decrece de a 200 es: ");
  do{
  System.out.print(i+",");
  i -=200;
  }while(i>=0);
   
  System.out.println("");
 }
}
