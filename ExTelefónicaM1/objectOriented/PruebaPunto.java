package ExTelefónicaM1.objectOriented;

import java.util.Random;

import ExTelefónicaM1.objectOriented.*;

public class PruebaPunto {
   public static void main(String args[]){
      Punto punto1 = new Punto();
      punto1.Punto(30, 20);
      System.out.print("1-El punto en x = "+punto1.getX());
      System.out.println("y tiene en y = " +punto1.getY());

      Punto punto2 = new Punto();
      punto2.Punto(punto1);
      System.out.print("2-El punto en x = "+(punto2.getX()+2));
      System.out.println("y tiene en y = " +(punto2.getY()+5));

      Punto punto3 = new Punto();
      punto2.Punto();
      System.out.print("3-El punto en x = "+punto3.getX());
      System.out.println("y tiene en y = " +punto3.getY());
      /*
      Printing the 3 Objects
      System.out.println(punto1);
      System.out.println(punto2);
      System.out.println(punto3);
      /*
      
      int num=(new Random()).nextInt(20);
      Punto [] arrPuntos = new Punto[num];
      System.out.println("Puntos del arreglo: ");
      for(int i = 0; i<num; i++){
         int x =(new Random()).nextInt(20);
         int y =(new Random()).nextInt(20);
         arrPuntos[i]= new Punto(x,y);
      }
      for(int i = 0; i<arrPuntos.length; i++){
         System.out.println("Coordenada x = " + arrPuntos[i].setX + "Cordenada y = " y)
      }*/
   }
}
