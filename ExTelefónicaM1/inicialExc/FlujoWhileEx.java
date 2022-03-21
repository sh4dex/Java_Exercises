package ExTelefónicaM1.inicialExc;

import java.util.Random;
import java.util.Scanner;

public class FlujoWhileEx{
    public static void main(String[] args) {
        /*Genera un número aleatorio hasta que
        usuario responda NO con "s" o "S"*/
       Scanner teclado = new Scanner(System.in);
       Random aleatorio = new Random();
       int menor = 1, mayor = 49, numero = 0;
       boolean seguir = true;

       //La condición del While debe ser true para entrar en el bucle
       while(seguir){
            numero = aleatorio.nextInt(mayor - menor+1) + menor;
            System.out.println("Numero: " + numero);
            System.out.println("¿Quieres otro número?");
            String op = teclado.next();
            seguir = op.equals("s") || op.equals("S") ? true : false;    
       } 
       System.out.println("FIN");
    }
}