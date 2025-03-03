public class Auto {
    private String licensePlate;
    private String brand;
    private double price;
    private String color;
    private static double discount;

    // Constructor to initialize the Auto object
    public Auto(String licensePlate, String brand, double price, String color){
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.price = price;
        this.color = color;
        Auto.discount = 10; // Default discount is set to 10%
    }

    // Method to calculate the promotional price after applying the discount
    public double getPromotionalPrice(){
        return this.price - (this.price * (Auto.discount / 100));
    }

    // Static method to cancel the discount
    public static void cancelDiscount(){
        Auto.discount = 0;
    }

    // Overriding the toString method to provide a string representation of the Auto object
    @Override
    public String toString() {
        return "Auto{" + licensePlate + ", " + brand + ", " + price + ", " + color + "}";   
    }
}
