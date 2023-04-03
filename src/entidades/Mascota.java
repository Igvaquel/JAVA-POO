/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;


public class Mascota {
    private String nombre;
    private String especie;
    private String color;
    private String raza;
    private boolean cola;
    private int edad;  
    private int energia;

    public Mascota() {
        this.energia = 1000;
    }
    
    public Mascota(String nombre, String especie, String color, String raza, boolean cola, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
        this.raza = raza;
        this.cola = cola;
        this.edad = edad;
        this.energia = 1000;
    }
     
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isCola() {
        return cola;
    }

    public int getEdad() {
        return edad;
    }
    
    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", especie=" + especie + ", color=" + color + ", raza=" + raza + ", cola=" + cola + ", edad=" + edad + ", energia=" + energia + '}';
    }

   
}
