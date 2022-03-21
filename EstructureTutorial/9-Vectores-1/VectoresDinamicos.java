import java.util.Scanner;

public class VectoresDinamicos{
  public static void main(String [] args){
  
  Scanner entrada = new Scanner(System.in);
  int longitud = 0;
  
  System.out.print("Por favor ingrese la cantidad de números que desea ingresar en su vector: ");
  longitud = entrada.nextInt();
  
  int numeros[] = new int[longitud];
  
  for(int i = 0; i < numeros.length; i++){
    System.out.println("Porfavor ingrese el valor número # " + (i + 1));
    numeros[i] = entrada.nextInt();
  }
  for(int i = 0; i < numeros.length; i++){
    System.out.print("[" + numeros[i] + "]");
  }
  System.out.println("");
 }
}
