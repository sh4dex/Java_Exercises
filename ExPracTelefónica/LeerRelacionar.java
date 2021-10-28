import java.util.Scanner;

public class LeerRelacionar{
    public static void main(String args[]){
	Scanner teclado = new Scanner(System.in);
	int a, b;
	float c;
	String cadena1, cadena2;
	
	System.out.print("Por favor ingrese un entero:");
	a = teclado.nextInt();
	System.out.print("Por favor ingrese otro entero:");
	b = teclado.nextInt();
	System.out.print("Por favor ingrese un número decimal:");
	c = teclado.nextFloat();
	System.out.print("Por favor ingrese una cadena de caracteres:");
	cadena1 = teclado.next();
	System.out.print("Por favor ingrese otra cadena de caracteres:");
	cadena2 = teclado.next();

	//Se suman los tres números y se muestran en pantalla.
	float sum = 0;
	float fa = a; //Se necesita operar con float.
	float fb = b;
	sum = fa+fb+c;
	//Suma de los 3 números a+b+c
	System.out.println("El resultado de la suma de los dos enteros y el decimal es: " + sum);
	System.out.println("Primer entero: " + a + " Segundo entero: " + b + " Número decimal: " + c);

	//Mostrar entero más grande
	if(a > b){
	    System.out.println("El entero más grande es: " + a);
	} if(b > a){
	    System.out.println("El entero más grande es: " + b);
	} if (a == b){
	    System.out.println("Los dos números enteros son iguales.");
	}

	/*Mostrar resultado de la división del float
	  con el resto de la división de los dos enteros.*/
	int modint = 0;
	modint = a % b;
	float div = 0;
	div = c/modint;
	System.out.println("El resultado de la división del decimal entre el módulo de los enteros :" + div);

	//Mostrar la concatenación de las 2 cadenas leidas.
	System.out.println("Concatenación de las cadenas de caracteres: " + cadena1 + cadena2);
    }
}
