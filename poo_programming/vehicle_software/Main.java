package POO;

public class Main {
    public static void main(String[] args){
        Auto audi =new Auto("patente1", "audi", 31230, "red");
        Auto mercedez = new Auto("pmercedez", "mercedez",9786, "green");
        Auto cadillac = new Auto("cadillac", "cadillac", 123, "green");
        Auto mazeratii = new Auto("mazeratii", "mazeratii", 4567, "green");

        System.out.println(audi.precioPromocional());
        System.out.println(mercedez.precioPromocional());
        System.out.println(cadillac.precioPromocional());
        System.out.println(mazeratii.precioPromocional());

        Auto.anularDescuento(); //anular el descuento de todos los autos.
        System.out.println("");

        System.out.println(audi.precioPromocional());
        System.out.println(mercedez.precioPromocional());
        System.out.println(cadillac.precioPromocional());
        System.out.println(mazeratii.precioPromocional());
    }

    public static void makeSomething(){
        //needs to be static
        //do something
    }
}
