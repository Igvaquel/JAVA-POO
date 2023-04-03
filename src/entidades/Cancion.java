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
public class Cancion {
    private String Título;
    private String Autor;

    public Cancion() {
        this.Título = "";
        this.Autor = "";
    }

    
    
    public Cancion(String Título, String Autor) {
        this.Título = Título;
        this.Autor = Autor;
    }
    
    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    
    
    
    
}
