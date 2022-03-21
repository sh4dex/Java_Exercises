package ExTelefónicaM1.inicialExc;

import java.util.Scanner;

public class OperadorTernario{
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----Ejemplo 1:-----");
        //Ejemplo 1
        int resultado = 0, divisor = 3, dividendo= 9;
        //Se impide la división por cero. 
        resultado = divisor == 0 ? 0 : dividendo / divisor;
        System.out.println("divisor = " + divisor);
        System.out.println("dividendo = " + dividendo);
        System.out.println("resultado = " + resultado);

        System.out.println("------Ejemplo 2-----:");
        //Ejemplo 2
        int menor = 0, num1 = 5, num2 =7;
        menor = num1 < num2 ? num1 :num2;
        System.out.println("Número 1 = " + num1);
        System.out.println("Número 2 = " + num2);
        System.out.println("Número Menor = " + menor);

        System.out.println("------Ejemplo 3-----:");
        //Ejemplo 3
        int edad = 0;
        boolean es_mayor = true;
        System.out.println("Por favor Ingrese su edad: ");
        edad = teclado.nextInt();
        /*Función para determinar si la persona es 
        mayor o menor de edad*/
        es_mayor = edad>=18 ? true : false;
        System.out.println("Su edad es: " + edad);
        System.out.println("Es mayor de edad: " + es_mayor);
    }
}