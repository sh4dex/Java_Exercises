package ExTelefónicaM1.objectOriented.practicePuntoObj;

import java.util.Random;
import java.util.Scanner;

public class Punto {
    private int x;
    private int y;

    //Getters & Setters
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    //Constructors
    public void Punto(Punto punto){
        x=punto.getX();
        y=punto.getY();
    }
    public void Punto() {
    }
    public void Punto(int x, int y) {
        this.y = y;
        this.x = x;
    }
    //Class methods
    public void pintar(Punto punto){
        System.out.print("1-El punto en x = "+punto.getX());
        System.out.println("y tiene en y = " +punto.getY());
    }
    
}
