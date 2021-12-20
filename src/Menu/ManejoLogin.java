package Menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ManejoLogin {
public String GuardarDatos(String id)
{
    String texto=null;
    File f=new File("Login.txt");
    FileWriter escribir;
    PrintWriter linea;
    try
    {
        if(!f.exists())
                {
                    f.createNewFile();
                }
        escribir=new FileWriter(f,true);
        linea=new PrintWriter(escribir);
        linea.print(id+"\n");
        linea.close();
        escribir.close();
        
        
    }catch(Exception e)
    {
        texto=("Error"+e);
    }
    
    return texto;
}


public void Leer()
{
    File ar=new File("Login.txt");
   
        Scanner s;
        boolean encontrado=false;
        try {
            
            File f=new File("Login.txt");
            
            if(!f.exists())
            {
                
                f.createNewFile();
            }
            s = new Scanner(f);
            //else
            
                while (s.hasNextLine() && !encontrado)
                {
                    String linea = s.nextLine();

                    Scanner sl = new Scanner(linea);

                    sl.useDelimiter("\\s*;\\s*");
                    try {
                        String num=sl.next();
                        if(num.equals("0"))
                        {
                            
                                Menu me=new Menu();
                                me.setVisible(true);
                        }      
                            
                            else
                            {
                                MenuUsuario mi=new MenuUsuario();
                                mi.setVisible(true);
                               
                            }
                        
                        
                   
                
                    } // fin try
                    catch (Exception  e1)
                    {
                       // JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                       
                    }
                } // fin while
            

            s.close();
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }
    
    
    
}
public void borrar(File fichero)
{
    try
    {
        if(fichero.exists())
        {
            fichero.delete();
        }
                    
        
    }catch(Exception e)
    {
        System.out.println("ERROR" + e);
    }
               
    
}
}
