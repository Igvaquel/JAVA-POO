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
public class Empleado {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private int salario;

    public Empleado() {
        this.nombre = "";
        this.edad = 0;
        this.salario = 0;
    }
    
    public void ingresar(){
        System.out.println("Ingrese su nombre");
        nombre= leer.next();
        System.out.println("Ingrese su edad");
        edad= leer.nextInt();
        System.out.println("Ingrese su salario");
        salario= leer.nextInt();
    }
    public void calcularAumento(){
        if(edad>=30){
            System.out.println("El aumento sera del 10%, total: " + salario*1.10);
        }else{
            System.out.println("El aumento sera del 5%, total: " + salario*1.05);
        }
    }

    
    
    
}
