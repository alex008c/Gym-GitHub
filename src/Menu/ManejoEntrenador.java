/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alex008c
 */
public class ManejoEntrenador{
    

public void GuardarDatos(String id, String name, String lastname, String tel, String correo){
    try {
        File file=new File("Entrenador.txt");
        FileWriter fw=new FileWriter(file,true);
        PrintWriter pw=new PrintWriter(fw);
        if(!file.exists()){
            file.createNewFile();
        }
        pw.print(id + ";" + name + ";" + lastname + ";" + tel + ";" + correo + "\n");
        pw.close();
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar."+ ex);
        System.out.println("Guardar");
    }
    }

public void ModificarDatos(String identre, String nombre,String apellido,String tel,String correo){
 File fileant=new File("Entrenador.txt");
 File filenue=new File("Entrenador2.txt");
String posmody=(identre+";"+nombre+";"+apellido+";"+tel+";"+correo+"\n");
 int id=Integer.parseInt(identre);
    try {
        if(fileant.exists()){ 
         String line;
         Scanner sc=new Scanner(fileant);
            while ((sc.hasNextLine())) {
             line=sc.next();
            Scanner sc1=new Scanner(line);
            sc1.useDelimiter("\\s*;\\s*");
            int idd=Integer.parseInt(sc1.next());
            if(id==idd){
                write(filenue,posmody);
            }
            else{
                write(filenue,line);
            }
            }//fin while
            sc.close();
            
            //Renombrar
            String Filant = fileant.getName();
            clear(fileant);
            filenue.renameTo(fileant);
        }
        else{
            System.out.println("Fichero no existe");
        }
    } catch (Exception e) {
        System.out.println("ERROR"+e);
        System.out.println("Modificar");
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
            System.out.println("ERROR write"+e);
            System.out.println("write");
    }
}//fin del write

void clear(File file){
    try {
        if(file.exists()){
            file.delete();
            System.out.println("Fichero borrado.");
        }
    } catch (Exception e) {
        System.out.println("ERROR BORRAR"+e);
        System.out.println("borrar");
    }
}//fin del clear

    public ArrayList LeerDatos(String campoid)throws FileNotFoundException,
UnsupportedEncodingException, IOException 
{
 
    boolean search=false;
    int iden=Integer.parseInt(campoid);
    ArrayList<String> ArrayEntrenador=new ArrayList<String>();
    File file=new File("Entrenador.txt");
    try
    {
        if(!file.exists())
        {
            file.createNewFile();
        }
        
        Scanner sc=new Scanner(file);
        
        while(sc.hasNextLine()&& !search)
            
        {
            String linea=sc.nextLine();
            Scanner sc1=new Scanner(linea);
            sc1.useDelimiter("\\s*;\\s*");
            int idd=Integer.parseInt(sc1.next());
            if(idd==iden)
            {
            search=true;
            String nombre=sc1.next();
            String apellido=sc1.next();
            String tel=sc1.next();
            String corr=sc1.next();
            ArrayEntrenador.add("1");
            ArrayEntrenador.add(nombre);
            ArrayEntrenador.add(apellido);
            ArrayEntrenador.add(tel);
            ArrayEntrenador.add(corr);
            }
                    
        
 
        }
        sc.close();
        
        
    }catch(Exception e)
    {
        System.out.println("ERROR leer"+e);
        System.out.println("leer");
    }
              
    return ArrayEntrenador;

} 
}//fin del manejo