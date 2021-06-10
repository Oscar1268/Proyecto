
package Persona;


public class Alumno extends Persona{
    private int Semestre;
    private String Materias;
    private double Calificacion;
    private double  Promedio;

    public Alumno(int Semestre, String Materias, double Calificacion, double Promedio, String nombre, String ApePater, String ApeMater, String Codigo) {
        super(nombre, ApePater, ApeMater, Codigo);
        this.Semestre = Semestre;
        this.Materias = Materias;
        this.Calificacion = Calificacion;
        this.Promedio = Promedio;
    }

    public Alumno() {
        
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public String getMaterias() {
        return Materias;
    }

    public void setMaterias(String Materias) {
        this.Materias = Materias;
    }

    public double getCalificacion() {
        return Calificacion;
    }

    public void setCalificacion(double Calificacion) {
        this.Calificacion = Calificacion;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public void setSemestre(String Semestre) {
         this.Semestre = this.Semestre;
    }
    
    
}
