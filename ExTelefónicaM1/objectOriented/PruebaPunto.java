package ExTelefónicaM1.objectOriented;

import java.util.Random;

import ExTelefónicaM1.objectOriented.*;

public class PruebaPunto {
   public static void main(String args[]){
      Punto punto1 = new Punto();
      punto1.Punto(30, 20);
      punto1.pintar(punto1);

      Punto punto2 = new Punto();
      punto2.Punto(punto1);
      punto1.pintar(punto2);

      Punto punto3 = new Punto();
      punto2.Punto();
      punto1.pintar(punto3);
      
      
      /*
      Printing the 3 Objects
      prints the memory directoion of the object
      System.out.println(punto1); 
      System.out.println(punto2);
      System.out.println(punto3);
      */
      
      int num=(new Random()).nextInt(20);
      Punto [] arrPuntos = new Punto[num];
      System.out.println("Puntos del arreglo: ");
      for(int i = 0; i<num; i++){
         int x =(new Random()).nextInt(20);
         int y =(new Random()).nextInt(20);
         arrPuntos[i]= new Punto();
         arrPuntos[i].Punto(x,y);
      }
      for(int i = 0; i<arrPuntos.length; i++){
        System.out.println("punto: " + i + " Coordenada x = " + arrPuntos[i].getX() + " Cordenada y = " + arrPuntos[i].getY());         
      }
   }
}
