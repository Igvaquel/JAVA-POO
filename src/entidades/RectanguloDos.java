/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Pepo
 */
public class RectanguloDos {
    private double lado1;
    private double lado2;

    public RectanguloDos(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    
    
    public void CalcularRectangulo(){
        System.out.println("El area del rectangulo es de: "+ lado1*lado2);
    }
    
}

