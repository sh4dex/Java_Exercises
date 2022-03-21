import java.util.Random;
public class ClaseRandom{
    public static void main(String[] args) {
        Random claseRandom = new Random();
        int intrandom = 1 + claseRandom.nextInt(21-1); //Numero para el bucle (genera un número del 1 al 20).
        System.out.println("Numeros aleatorios generados (iteraciones en el bucle):" + intrandom);
        for(int i = 1; i <= intrandom; i++){ 
            //El bucle genera números aleatorios (entre  18 y 64)  
            int numrandom = 18 + claseRandom.nextInt(65-18);
            System.out.println(i + "-" + numrandom);
        }
    }
}