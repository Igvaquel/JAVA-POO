/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Pepo
 */
public class Juego {
    private int num;
    private int intentos;

    public Juego() {
        this.num = 0;
        this.intentos = 3;
    }
    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        int x = 0;
        System.out.print("Ingrese el numero secreto: ");
        num = leer.nextInt();
        
        for (int i=1;i<=(intentos+1);i++) {
            
            System.out.println("Ingrese el numero a probar");    
            x = leer.nextInt();
            
            if(x==num){
                System.out.println("Correcto!!!");
                break;
            }
            if(i==intentos){
                System.out.println("Limite de intentos, perdiste");
                break;
            }
            
            if(x<num){
                System.out.println("Mas alto");
            }else{
                System.out.println("Mas bajo");
            }
            
        } 
    }
    
}

