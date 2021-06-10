
package metodos;

import Persona.Administrador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MetodosAdmi {
    
    Vector vAdmi = new Vector();
    
    public void guardarA(Administrador uAdministrador){
        vAdmi.addElement(uAdministrador);
    }
     public void guardarAdministrador(Administrador administrador){
         try{
         FileWriter fw= new FileWriter("Administrador.txt",true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw= new  PrintWriter(bw);
         pw.print(" / "+administrador.getNombre());
         pw.print(" / "+administrador.getApePater());
         pw.print(" / "+administrador.getApeMater());
         pw.print(" / "+administrador.getCodigo());
         pw.close();
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
     }
             }
   public DefaultTableModel listaAdministrador(){
         Vector cabeceras = new Vector();
         cabeceras.addElement("Nombre");
         cabeceras.addElement("Apellido Paterno");
         cabeceras.addElement("Apellido Materno");
         cabeceras.addElement("No.de Personal");
      
         
         DefaultTableModel modTabla = new DefaultTableModel (cabeceras, 0);
         
         try{
             FileReader fr = new FileReader("Administrador.txt" ); 
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
