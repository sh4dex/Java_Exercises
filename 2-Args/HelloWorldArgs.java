public class HelloWorldArgs{
  public static void main (String[] args){
      System.out.println("Hola mundo,"+args[0]);
      /*Here we doesn't have the case to execute the program
      without parameters (that would be a error, use:
      "java -cp . HelloWorldArgs 'Paremeter to the array args in position 0'"
      */
 }
}
