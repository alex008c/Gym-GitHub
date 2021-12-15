package Menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


public class ManejoActividades {

    public String GuardarDatos(String idactividad,String nombre,String descripcion,String localizacion,String entrenador)
{
    String texto=null;
    File f=new File("Actividades.txt");
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
        linea.print(idactividad+";");
        linea.print(nombre+";");
        linea.print(descripcion+";");
        linea.print(localizacion+";");
        linea.print(entrenador+"\n");
        linea.close();
        escribir.close();
        
        
    }catch(Exception e)
    {
        texto=("Error"+e);
    }
    
    return texto;
}


public void ModificarDatos(String LineaNueva,String id)
{
    File fNuevo=new File("Actividades1.txt");
    File fAntiguo =new File("Actividades.txt");
    //String cadena=(idactividades+";"+nombre+";"+descripcion+";"+localizacion+";"+entrenador+"\n");
String ncadena=LineaNueva;    
    int ids=Integer.parseInt(id);
   
    try
    {
        if(fAntiguo.exists())
        {
           
        Scanner s=new Scanner(fAntiguo);
        String linea="";
        while(s.hasNextLine())
        {
            linea=s.nextLine();
            Scanner sl=new Scanner(linea);
            sl.useDelimiter("\\s*;\\s*");
            int idarch=Integer.parseInt(sl.next());
            if(ids==idarch)
            {
                Escribir(fNuevo,ncadena);
            }
            else
            {
                Escribir(fNuevo,linea);
            }
                  
              
        }
       
    s.close();
         String nombreantiguo=fAntiguo.getName();
        borrar(fAntiguo);
        fNuevo.renameTo(fAntiguo); 
        }
          


        
    }catch(Exception e)
    {
        System.out.println("ERROR" +e);
    }
             
    
}

public void Escribir(File fichero,String zcadena)
{
    BufferedWriter br;
    try
    {
        if(!fichero.exists())
        {
            fichero.createNewFile();
        }
        br=new BufferedWriter(new FileWriter(fichero,true));
        br.write(zcadena+"\r\n");
        br.close();
        
        
        
        
    }catch(IOException e)
    {
        System.out.println("Error"+e);
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
