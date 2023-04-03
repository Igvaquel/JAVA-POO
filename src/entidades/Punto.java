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
public class Punto {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Punto() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    
    
    
    
    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cordenada x del punto 1: ");
        x1 = leer.nextInt();
        System.out.print("Ingrese la cordenada y del punto 1: ");
        y1 = leer.nextInt();
        System.out.print("Ingrese la cordenada x del punto 2: ");
        x2 = leer.nextInt();
        System.out.print("Ingrese la cordenada y del punto 2: ");
        y2 = leer.nextInt();  
    }
    public void distancia(){
       System.out.print("La distancia entre los 2 puntos es de: "+ Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ) );
    }
}
