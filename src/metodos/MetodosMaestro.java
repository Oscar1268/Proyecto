/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import Persona.Maestro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MetodosMaestro {
    

    
    Vector vMaestro = new Vector();
   
     public  void guardarM(Maestro unMaestro) {
         vMaestro.addElement(unMaestro);
        
    }
     public void guardarMaestro(Maestro maestro){
         try{
         FileWriter fw= new FileWriter("Maestro.txt",true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw= new  PrintWriter(bw);
         pw.print(" / "+maestro.getNombre());
         pw.print(" / "+maestro.getApePater());
         pw.print(" / "+maestro.getApeMater());
         pw.print(" / "+maestro.getCodigo());
         pw.print(" / "+maestro.getMateria()+"\n");
         pw.close();
   
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
             
             }
     }
     public DefaultTableModel listaMaestro(){
         Vector cabeceras = new Vector();
         cabeceras.addElement("Nombre");
         cabeceras.addElement("Apellido Paterno");
         cabeceras.addElement("Apellido Materno");
         cabeceras.addElement("No.de Personal");
         cabeceras.addElement("Materia");
         
         
         DefaultTableModel modTabla = new DefaultTableModel (cabeceras, 0);
         
         try{
             FileReader fr = new FileReader("Maestro.txt" ); 
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
