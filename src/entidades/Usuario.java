/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Pepo
 */
public class Usuario {

    public String nomnre;
    public String apellido;
    public String pais;
    public int dni;
    public Date nacimiento;

    public Usuario() {
    }

    public Usuario(String nomnre, String apellido, String pais, int dni, Date nacimiento) {
        this.nomnre = nomnre;
        this.apellido = apellido;
        this.pais = pais;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }

    
}
