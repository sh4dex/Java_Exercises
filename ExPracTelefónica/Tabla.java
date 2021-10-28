import java.util.Random;

class Tabla{
    //Programa de puestas
    public static void main(String args[]){
        Random aleatorio = new Random();
        int apuestas = aleatorio.nextInt(10) + 1;
        /*Creación Array dos dimenciones 
        [numero de columnas: var apuestas] [6 columnas]*/
        int [][] numeros = new int[apuestas][6];
        /*Se recorre la tabla almacenando un valor en 
        cada posición (Valores aleatorios) */
        System.out.println("Número de Apuestas: " + numeros.length);
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                numeros [i][j] = aleatorio.nextInt(49) + 1;
            }
        }
        // se recorre la matriz accediendo a cada posición
        for(int[] apuesta : numeros){
            for(int numero : apuesta){
                System.out.print(numero + "\t");
            }
            System.out.println();
        }
    }
}