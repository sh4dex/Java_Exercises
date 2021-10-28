import java.util.Scanner;

public class Matrices2{
    public static void main(String args[]){

	Scanner entrada = new Scanner(System.in);
	int filas = 0, columnas = 0, contador = 10;
	
	System.out.println("Ingrese el número de filas: ");
	filas = entrada.nextInt();
	System.out.println("Ingrese el número de columnas: ");
	columnas = entrada.nextInt();

	int numeros [][] = new int [filas][columnas];
	
	for(int j = 0; j < columnas; j++){
	    for( int i = 0; i < filas; i++){
		numeros [j][i] = contador;
		contador = contador + 10;
		System.out.print("[" + numeros [j][i] + "]");
	    }
	    System.out.println("");
	}
 }
}
