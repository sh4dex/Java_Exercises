import java.util.Scanner;

public class MatricesDinamicas{
public static void main(String args[]){

  int filas = 0, columnas = 0, contador = 1;
  Scanner in = new Scanner(System.in);
  
  System.out.println("");
  System.out.println("Bienvenido Este es un programana que realiza matrices y las rellena en orden. ");
  System.out.println("");
  
  System.out.print("Por favor ingrese el numero de FILAS que deseas: ");
  filas = in.nextInt();
  System.out.print("Por favor ingrese el numero de COLUMNAS que deseas: ");
  columnas = in.nextInt();
  int numeros[][] = new int[filas][columnas];
  
  for(int j = 0; j < filas; j++){
    for(int i = 0; i < columnas; i++){
      numeros[j][i] = contador;
      contador++;
      System.out.print("[" + numeros[j][i] + "]");
    }
    
    System.out.println("");
    
  }
  
 }
}
