package ExTelefónicaM1.inicialExc;

public class ExampleContinueSentence{
    public static void main(String args []) {
        /*Ejercicio para determinar como funciona
        la sentencia continue*/
        int i = 0;
        while(i++<10){
        if (++i%3!=0) continue;
        System.out.print ("El numero es "+i);
        //Output: El número es 6
        }
    }
}
