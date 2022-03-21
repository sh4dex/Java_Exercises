package ExTelefónicaM1.inicialExc;

import java.util.Random;
import java.util.Scanner;

public class FlujoIfElse{
    public static void main(String args[]) {
        Random aleatorio =  new Random();
        Scanner teclado = new Scanner(System.in);
        String marcha = "";
        String categoria = "";
        int i = aleatorio.nextInt(3)+1;

        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();

        //If anidados Marcha
        if(i<2) marcha = "frenar";
        else if(i==2) marcha = "continuar";
        else marcha = "acelerar";
        //Se imprime marcha
        System.out.println("Marcha =" +marcha);

        //Flujo If anidados edad
        if(edad > 55) categoria = "veterano C";
        else if (edad > 45 ) categoria = "veterano B";
        else if (edad > 35 ) categoria = "veterano A";
        else if (edad > 19 ) categoria = "senior";
        else if (edad > 16 ) categoria = "junior";
        else categoria = "no puede participar";
        //Se imprime categoria
        System.out.println("Su categoría es: " + categoria);
    }
}