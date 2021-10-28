public class ArgsLineaComandos{
    /* Es necesario ejecutar con el comando:
    javac -cp . ArgsLineaComandos <argumentos>
    de lo contrario se obtendrá el output de la 
    linea 10 L10
    */
    public static void main(String[] args) {
     int nArgumentos = args.length; 
     if(nArgumentos == 0){
        System.out.println("Se ejecutó el programa sin argumentos");
      }else{
         int num=1;
         System.out.println("Se ejecutó el programa con los siguentes argumentos:");
         for(String argumento: args){
            //Bucle for-each para recorrer el array argumento
            System.out.print("Argumento" + num + ": ");
            System.out.println(argumento);
            num++;
         }
        }
    }
}