/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class Circunferencia {
    private double Radio;

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        Radio = leer.nextInt();  
    }
    
    public double area() {
        return Math.PI * Radio * Radio;
    }
    
    public double perimetro() {
        return 2 * Math.PI * Radio ;
    }
}
