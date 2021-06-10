
package Persona;

public class Director extends Persona{

    public Director(String nombre, String ApePater, String ApeMater, String Codigo) {
        super(nombre, ApePater, ApeMater, Codigo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePater() {
        return ApePater;
    }

    public void setApePater(String ApePater) {
        this.ApePater = ApePater;
    }

    public String getApeMater() {
        return ApeMater;
    }

    public void setApeMater(String ApeMater) {
        this.ApeMater = ApeMater;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    
   
}

