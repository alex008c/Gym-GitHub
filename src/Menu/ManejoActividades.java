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

public ArrayList LeerDatos(String idactividad)throws FileNotFoundException,
UnsupportedEncodingException, IOException 
{
    boolean encontrado=false;
    int idac=Integer.parseInt(idactividad);
    ArrayList<String> ArrayActividades=new ArrayList<String>();
    File g=new File("Actividades.txt");
    try
    {
        if(!g.exists())
        {
            g.createNewFile();
        }
        
        Scanner s=new Scanner(g);
        
        while(s.hasNextLine()&& !encontrado)
            
        {
            String linea=s.nextLine();
            Scanner sl=new Scanner(linea);
            sl.useDelimiter("\\s*;\\s*");
            int idd=Integer.parseInt(sl.next());
            if(idd==idac)
            {
            encontrado=true;
            String nombre=sl.next();
            String descripcion=sl.next();
            String localizacion=sl.next();
            String entrenador=sl.next();
            ArrayActividades.add("1");
            ArrayActividades.add(nombre);
            ArrayActividades.add(descripcion);
            ArrayActividades.add(localizacion);
           
            ArrayActividades.add(entrenador);
            }
                    
        
 
        }
        s.close();
        
        
    }catch(Exception e)
    {
        System.out.println("ERROR "+e);
    }
              
    return ArrayActividades;
}
public void ModificarDatos(String idactividades,String nombre,String descripcion,String localizacion,String entrenador)
{
    File fNuevo=new File("Actividades1.txt");
    File fAntiguo =new File("Actividades.txt");
    String cadena=(idactividades+";"+nombre+";"+descripcion+";"+localizacion+";"+entrenador+"\n");
    String ncadena=(idactividades+";"+nombre+";"+descripcion+";"+localizacion+";"+entrenador+"\n");
    
    int id=Integer.parseInt(idactividades);
   
    try
    {
        if(fAntiguo.exists())
        {
           
        
        String linea;
        Scanner s=new Scanner(fAntiguo);
        while(s.hasNextLine())
        {
            linea=s.next();
            Scanner sl=new Scanner(linea);
            sl.useDelimiter("\\s*;\\s*");
            int idarch=Integer.parseInt(sl.next());
            if(id==idarch)
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
