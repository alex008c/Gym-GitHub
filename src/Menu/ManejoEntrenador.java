/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author alex008c
 */
public class ManejoEntrenador{
    

public void GuardarDatos(String id, String name, String lastname, String tel, String correo){
    try {
        FileWriter file=new FileWriter("Entrenador.txt");
        PrintWriter pwrite=new PrintWriter(file);
        pwrite.println(id + ";" + name + ";" + lastname + ";" + tel + ";" + correo);
        pwrite.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar."+ ex);
    }
    }

public void ModificarDatos(String premody, String posmody ){
 File fileant=new File("Entrenador.txt");
 File filenue=new File("Entrenador2.txt");
 
    BufferedReader read;
    try {
        if(fileant.exists()){
         read=new BufferedReader(new FileReader(fileant));
         
         String line;
            while ((line=read.readLine()) !=null ) {
            if(line.equals(premody)){
                write(filenue,posmody);
            }
            else{
                write(filenue,line);
            }
            }//fin while
            read.close();
            
            //Renombrar
            String Filant = fileant.getName();
            clear(fileant);
            filenue.renameTo(fileant);
        }
        else{
            System.out.println("Fichero no existe");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    }//FIN MODIFICAR

void write(File file, String registro){
    BufferedWriter wr;
        try {
        if(!file.exists()){
            file.createNewFile();
        }
        wr=new BufferedWriter(new FileWriter(file, true));
        wr.write(registro + "\r\n");
        wr.close();
    } catch (Exception e) {
            System.out.println(e);
    }
}//fin del write

void clear(File file){
    try {
        if(file.exists()){
            file.delete();
            System.out.println("Fichero borrado.");
        }
    } catch (Exception e) {
        System.out.println(e);
    }
} //fin del clear
}//fin del manejo