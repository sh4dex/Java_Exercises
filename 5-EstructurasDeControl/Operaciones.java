import java.util.Scanner;

public class Operaciones{
 public static void main(String args[] ){
   
   Scanner numeros = new Scanner(System.in);
   int num_uno = 0, num_dos = 0, resultado = 0, parametro = 0;
   
   System.out.println("Hola, ingresa el primer número: ");
   num_uno = numeros.nextInt();
   
   System.out.println("Ahora, ingresa el segundo número: ");
   num_dos = numeros.nextInt();
   
   System.out.println("Ingresa el número de la operación");
   System.out.println("");
   
   System.out.println("suma = 1.");
   System.out.println("resta = 2.");
   System.out.println("multiplicación = 3.");
   System.out.println("división = 4.");
   parametro = numeros.nextInt();
   
   switch(parametro){
   
     case 1: resultado = num_uno + num_dos;
             System.out.println("El resultado de la suma es: " + resultado);
             break;
             
     case 2: resultado = num_uno - num_dos;
             System.out.println("El resultado de la resta es: " + resultado);
             break;     
             
     case 3: resultado = num_uno * num_dos;
             System.out.println("El resultado de la multiplicación es: " + resultado);
             break;
             
     case 4: resultado = num_uno / num_dos;
             System.out.println("El resultado de la división es: " + resultado);
             break;
              
     default: System.out.println("Error la opción no existe");
              break;         
   }
 }  
}
