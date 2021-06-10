
package metodos;

import Persona.Alumno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class metodos {
    
    Vector vAlumno = new Vector();
   
     public  void guardar(Alumno unAlumno) {
         vAlumno.addElement(unAlumno);
        
    }
     public void guardarAlumno(Alumno alumno){
         try{
         FileWriter fw= new FileWriter("Alumnos.txt",true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw= new  PrintWriter(bw);
         pw.print(" / "+alumno.getNombre());
         pw.print(" / "+alumno.getApePater());
         pw.print(" / "+alumno.getApeMater());
         pw.print(" / "+alumno.getCodigo());
         pw.print(" / "+alumno.getSemestre()+"\n");
         pw.close();
   
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
             
             }
     }
     public DefaultTableModel listaAlumnos(){
         Vector cabeceras = new Vector();
         cabeceras.addElement("Nombre");
         cabeceras.addElement("Apellido Paterno");
         cabeceras.addElement("Apellido Materno");
         cabeceras.addElement("Matricula");
         cabeceras.addElement("Semestre");
         
         
         DefaultTableModel modTabla = new DefaultTableModel (cabeceras, 0);
         
         try{
             FileReader fr = new FileReader("Alumnos.txt" ); 
             BufferedReader br = new BufferedReader(fr);
             String  d;
             while ((d=br.readLine())!=null) {
               StringTokenizer dato = new StringTokenizer(d," / ");
               Vector x = new Vector();
                 while (dato.hasMoreTokens()) {
                     x.addElement (dato.nextElement());     
                 }
                 modTabla.addRow(x);
             }

         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         
         }
         return modTabla;
     }
     
}
