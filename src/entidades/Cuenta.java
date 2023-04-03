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
public class Cuenta {
    Scanner leer = new Scanner(System.in);
    private int saldo;
    private String titular;

    public Cuenta() {
        this.saldo = 0;
        this.titular = "";
    }
    public void ingresar(){
        
        System.out.println("Ingrese su nombre");
        titular= leer.next();
        System.out.println("Ingrese su saldo");
        saldo= leer.nextInt();
    }
    public void retirarDinero(){
        int resta =0;
        System.out.println("Ingrese la cantidad a retirar");
        resta= leer.nextInt();
        
        if(resta<saldo){ 
            System.out.println("Perfecto!, "+titular+ " su saldo restante es de: "+ (saldo-=resta));
            
        }else{
            System.out.println(titular+" no cuentas con el saldo suficiente, saldo: "+saldo);
        }
    }
    
    
}


