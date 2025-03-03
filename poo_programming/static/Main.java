public class Main {
    public static void main(String[] args) {
        Auto audi = new Auto("CCCaudi", "audi", 31230, "red");
        Auto mercedes = new Auto("pmerXXX", "mercedes", 9786, "green");
        Auto cadillac = new Auto("cadiCCC", "cadillac", 123, "green");
        Auto maserati = new Auto("maseCCC", "maserati", 4567, "green");

        System.out.println(audi.getPromotionalPrice());
        System.out.println(mercedes.getPromotionalPrice());
        System.out.println(cadillac.getPromotionalPrice());
        System.out.println(maserati.getPromotionalPrice());

        Auto.cancelDiscount(); // Anular el descuento de todos los autos.
        System.out.println("");

        System.out.println(mercedes.getPromotionalPrice());
        System.out.println(cadillac.getPromotionalPrice());
        System.out.println(maserati.getPromotionalPrice());
    }

    public static void makeSomething() {
        // Implementation of the static method
        System.out.println("Doing something...");
    }
}
