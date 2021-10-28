import java.util.Scanner;
public class Sentences{
  public static void main(String args []){ //main method
      Scanner teclado = new Scanner(System.in);
      System.out.println("Asignaciones"); //This is a sentence or Instruction
      int i=0; //Creating variable Sentence
      System.out.println("Por favor ingrese un número:");
      i=teclado.nextInt(); //Asignation
      boolean esPar = i % 2 == 0 ? true : false; //Asignation sentence 
      if(esPar == true){ // decision sentence
	  System.out.println("Se ha tecleado un número par.");
      }else {
	  System.out.println("Se ha tecleado un número impar.");
      }
 } 
}
