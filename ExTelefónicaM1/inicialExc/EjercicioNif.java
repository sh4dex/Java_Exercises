import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioNif{
    public static void main(String args[]) {
      /*El NIF tiene que tener los 8 números de DNI
      junto con una letra (dada por el arreglo letrasnif)
      */
        char [] letrasnif = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner teclado = new Scanner(System.in);     
        int lengthOfDni = -1, dni = 0;
        
        //DNI tiene que ser un número de 8 carácteres.
        while (lengthOfDni != 8) {
            try {
                System.out.println("Por favor ingrese un número de DNI válido");
                System.out.println("El DNI debe estar compuesto de 8 números.");
                dni = teclado.nextInt();
                lengthOfDni = String.valueOf(dni).length();
            } catch (InputMismatchException ex) {
                System.out.println(ex);
                teclado.next();
            }
        }  
        //EL ususario ingresó un DNI válido

        int nif = dni % 23;
        //Imprimir NIF
        System.out.println("Su NIF generado es: " + dni + letrasnif[nif]);
        teclado.close();
    }
}