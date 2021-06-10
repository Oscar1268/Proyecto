/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;


public class Persona {
    String nombre;
    String ApePater;
    String ApeMater;
    String Codigo;

    public Persona(String nombre, String ApePater, String ApeMater, String Codigo) {
        this.nombre = nombre;
        this.ApePater = ApePater;
        this.ApeMater = ApeMater;
        this.Codigo = Codigo;
    }
    public Persona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApePater() {
        return ApePater;
    }

    public String getApeMater() {
        return ApeMater;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApePater(String ApePater) {
        this.ApePater = ApePater;
    }

    public void setApeMater(String ApeMater) {
        this.ApeMater = ApeMater;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
}
