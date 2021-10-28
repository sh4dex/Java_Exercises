class LitDeclarTablas{
    public static void main(String args[]) {
        String grupo [][]= { 
        {"Pepe","Madrid", "coordina"},
        {"Ana", "Sevilla", "colabora"},
        {"Luis", "Lugo", "escribe"}
        };
            for(String[] persona : grupo){
                for (String dato: persona){
                    System.out.print(dato + "\t\t");
                }
                 System.out.print("\n");
            }
    }
}