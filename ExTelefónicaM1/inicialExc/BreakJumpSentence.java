package ExTelefónicaM1.inicialExc;

import java.util.Random;

public class BreakJumpSentence{
    public static void main(String[] args) {
        /*El programa continua su ejecución hasta
        que de forma aleatoria se genere el número cero
        para las variables num1 o num2*/
        Random aleatorio = new Random();
        int num1 =0, num2=0;
        for( ; ; ){
            num1= aleatorio.nextInt(50);
                if (num1 == 0) break;
            num2= aleatorio.nextInt(1000);
                if (num2 == 0) break;
            System.out.print("num2: " + num2 + " num1: " + num1 );
            System.out.print(" num2/num1 = " + num2 / num1);
            System.out.println(" num2%num1 = " + num2 % num1);
        }
    }
}