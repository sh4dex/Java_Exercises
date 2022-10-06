package POO;

public class Main {
    public static void main(String[] args){
        Auto audi =new Auto("patente1", "audi", 31230, "red");
        Auto mercedez = new Auto("pmercedez", "mercedez", 0, "green");
        Auto cadillac = new Auto("cadillac", "cadillac", 0, "green");
        Auto mazeratii = new Auto("mazeratii", "mazeratii", 0, "green");

        System.out.println(audi.precioPromocional());
        System.out.println(mercedez.precioPromocional());
        System.out.println(cadillac.precioPromocional());
        System.out.println(mazeratii.precioPromocional());
    }
}
