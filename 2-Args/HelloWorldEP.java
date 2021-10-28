public class HelloWorldEP{
  public static void main(String args[]){
      if(args.length == 0){
	  System.out.println("Hello World"); //If args is null, It would be only print "Hello World"
      }else{
	  System.out.println("Hello World, " + args[0]);
      }
 }
}
