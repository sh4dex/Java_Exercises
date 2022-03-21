import java.util.Scanner;

public class ScannerFibonacci{
  public static void main(String args[]){
  
  Scanner cont = new Scanner(System.in);
  int a = 0, b = 1, c = 0, x = 0;
  
  System.out.println("Ingrese cuantos numeros desea en la serie: ");
  x = cont.nextInt();
  
  System.out.println("Serie con for: ");
  for(int i = 0; i < x; i++){
   if(i < x-1){
    System.out.print(a + ",");
    c = a + b;
    a = b;
    b = c;
    } else{
    System.out.print(a);
    }
   }
  System.out.println("");
  a = 0;
  b = 1;
  c = 0;
  int i = 0;
  
  System.out.println("Serie con while: ");
  while(i < x){
   if(i < x-1){
   System.out.print(a + ",");
   c = a+b;
   a = b;
   b = c;
   } else{
   System.out.print(a);
   }
  i++;
  } 
  System.out.println("");
  a = 0;
  b = 1;
  c = 0;
  i = 0;
  
  System.out.println("Serie con do-while: ");
  do{
   if(i < x-1){
   System.out.print(a + ",");
   c = a + b;
   a = b;
   b = c;
   } else{
   System.out.print(a);
   }
   i++;
  }while (i < x);
  System.out.println("");
 }
}
