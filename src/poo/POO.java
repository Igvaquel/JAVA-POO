/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import entidades.Mascota;
import java.util.Scanner;

public class POO {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota("Chen", "gato", leer.next(), "arabe", true, leer.nextInt());
        
        m1.setNombre("nube");
        m1.pasear(100);
        System.out.println(m1.toString());
    }
    
}
