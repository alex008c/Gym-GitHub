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


public class ManejoEntrenador {
 public String GuardarDatos(String identrenador,String nombre,String apellido,String tel,String correo)
{
    String texto=null;
    File f=new File("Entrenadores.txt");
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
        linea.print(identrenador+";");
        linea.print(nombre+";");
        linea.print(apellido+";");
        linea.print(tel+";");
        linea.print(correo+"\n");
        linea.close();
        escribir.close();
        
        
    }catch(Exception e)
    {
        texto=("Error"+e);
    }
    
    return texto;
}

public ArrayList LeerDatos(String identrenador)throws FileNotFoundException,
UnsupportedEncodingException, IOException 
{
    boolean encontrado=false;
    int idac=Integer.parseInt(identrenador);
    ArrayList<String> ArrayEntrenador=new ArrayList<String>();
    File g=new File("Entrenadores.txt");
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
            
            String nombre=sl.next();
            String apellido=sl.next();
            String tel=sl.next();
            String correo=sl.next();
            ArrayEntrenador.add("1");
            ArrayEntrenador.add(nombre);
            ArrayEntrenador.add(apellido);
            ArrayEntrenador.add(tel);
           
            ArrayEntrenador.add(correo);
            }
                    
        
 
        }
        s.close();
        
        
    }catch(Exception e)
    {
        System.out.println("ERROR "+e);
    }
              
    return ArrayEntrenador;
}
public void ModificarDatos(String idactividades,String nombre,String descripcion,String localizacion,String entrenador)
{
    File fNuevo=new File("Entrenadores1.txt");
    File fAntiguo =new File("Entrenadores.txt");
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

