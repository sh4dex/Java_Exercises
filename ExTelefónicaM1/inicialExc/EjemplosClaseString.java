package ExTelefónicaM1.inicialExc;

import java.util.Scanner;

public class EjemplosClaseString{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, teclea dos palabras: "); //String palabras
        String palabras = teclado.nextLine();
        System.out.println("String palabras: " + palabras); //Imprime el String normal
        System.out.println("String palabras (Mayúsculas): " + palabras.toUpperCase()); //Imprime el String en Mayúscula
        palabras = palabras.toLowerCase(); //Pasa el String a minuscula
        System.out.println("String palabras (Minúsculas): " + palabras);
        palabras = "           "+palabras; //Se concatena espacios en blanco a palabras
        System.out.println("String palabras Tabulado: " + palabras);
        palabras = palabras.trim(); //Método trim para quitar espacios
        System.out.println("String palabras Sin espacios (método trim()): " + palabras);
        String str1 = palabras.substring(4,9); //de la posición 4 a 9
        System.out.println("String 1 (caracteres 4 al 9): " + str1);
        long num = 9_876_534_211L;
        String str2 = String.valueOf(num); //el valor del número como string
        System.out.println("Valor de la variable num: " + str2);
        str2 = str2.replace('1', '0'); //cambia el 1 por ceros en la variable str2
        System.out.println("Cambiados los valores 1 por 0 (usando método replace()): " + str2);
        teclado.close();
    }
}
