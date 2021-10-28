import java.util.Scanner;

public class InicioSesión{
  public static void main(String[] args){
  
  Scanner login = new Scanner(System.in);
  String user = "", password = "";
  
  System.out.println("*************************");
  System.out.println("* Bienvenido a FACEBOOK *");
  System.out.println("*************************");
  System.out.println("");
  
  System.out.print("Ingrese su usuario de inicio de sesión: ");
  user = login.nextLine();
  
  System.out.print("Ingrese su contraseña: ");
  password = login.nextLine();
  	
  if(user.equals("Thomas Sorza") && password.equals("SLIMSHADY0941")){
   System.out.println("Inicio de sesión correcto.");
  }else {
   System.out.println("Nombre de Usuario o Contraseña incorrectos:");
  } 
 }
}
