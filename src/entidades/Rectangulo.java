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
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }
    

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        base = leer.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = leer.nextInt();
    }
    
    public double superficie () {
        return base*altura;
    }
    public double perímetro  () {
        return (base + altura)*2;
    }
    
    public void dibujo(){
        
        
        for(int i =0; i < base; i++){
            System.out.print("*");
        }
        
        System.out.println();
         
        for(int i=0; i < altura-2 ; i++){
            System.out.print("*");
            for(int j = 0; j < altura-2 ; j++){
               System.out.print(" "); 
            }
            System.out.println("*");
        }
        
        for(int i =0; i < base; i++){
            System.out.print("*");
        }
        
    }
}
