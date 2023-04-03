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
public class Libro {
    private int ISBN;
    private String Título;
    private String Autor;
    private int NúmeroDePáginas;

    public Libro() {
    }

    public Libro(int ISBN, String Título, String Autor, int NúmeroDePáginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NúmeroDePáginas = NúmeroDePáginas;
    }
    public void cargarLibro() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro: ");
        ISBN = leer.nextInt();
        System.out.print("Ingrese el título del libro: ");
        Título = leer.next();
        System.out.print("Ingrese el autor del libro: ");
        Autor = leer.next();
        System.out.print("Ingrese el número de páginas del libro: ");
        NúmeroDePáginas = leer.nextInt();
    }
    public void informarLibro() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + Título);
        System.out.println("Autor: " + Autor);
        System.out.println("Número de páginas: " + NúmeroDePáginas);
    }    
    
}
    