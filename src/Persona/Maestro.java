
package Persona;


public class Maestro extends Persona{
    private int alumnos;
    private String materia; 

    public Maestro(int alumnos, String materia, String nombre, String ApePater, String ApeMater, String Codigo) {
        super(nombre, ApePater, ApeMater, Codigo);
        this.alumnos = alumnos;
        this.materia = materia;
    }

    public Maestro() {
        
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
   
    
   
}
