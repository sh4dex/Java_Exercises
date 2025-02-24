package POO;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private String color;
    private static double dcto;

    public Auto(String patente, String marca, double precio, String color){
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        Auto.dcto = 10;
    }

    public double precioPromocional(){
        return this.precio  - (this.precio * (Auto.dcto /100));
    }

    public static void anularDescuento(){
        Auto.dcto = 0;
        //this.precio = 0; GEnera error no se puede acceder de un contexto estatico a una instancia
    }

    @Override
    public String toString() {
        return "Auto{" + patente + ", " + marca + ", " + precio + ", " + color + "}";   
    }
}
