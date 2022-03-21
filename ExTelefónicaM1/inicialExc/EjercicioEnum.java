package ExTelefónicaM1.inicialExc;

import java.util.Random;

public class EjercicioEnum{
    //enum EstadoCivil (SOLTERO, CASADO, VIUDO, SEPARADO, DIVORCIADO)
    enum EstadoCivil{
        SOLTERO, CASADO, VIUDO, SEPARADO, DIVORCIADO
    }
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(9)+1;

        //Inprimir el número de Variables tipo enum tenemos
        //En este caso del enum EstadoCivil
        int posición= 0;
        EstadoCivil [] valores_enumeracion = EstadoCivil.values();
        for(EstadoCivil estado : valores_enumeracion){
            posición = estado.ordinal();
            System.out.println("La constante número " + posición + " es " + estado.toString());
        }
        //LLenar el arreglo estados con longitud num
        EstadoCivil [] estados = new EstadoCivil[num];
        int nestados = EstadoCivil.values().length;
        for(int i=0; i<num; i++){
            estados[i]=valores_enumeracion[aleatorio.nextInt(nestados)];
        }
        //imprimir la info
        posición=0;
        for(EstadoCivil estado: estados){
            System.out.println("estados["+ posición + "]: " + estado);
            posición++;
        }
    }
}