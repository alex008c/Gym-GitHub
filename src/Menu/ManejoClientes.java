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


public class ManejoClientes {

    public String GuardarDatos(String idcliente,String nombrecliente,String apellidopat,String apellidomat,String direc,String nacimiento,String tel,String cel,String fingreso,String status,String tipo,String correo, String balance,String valorcuo)
{
    String texto=null;
    File f=new File("Clientes.txt");
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
        linea.print(idcliente+";");
        linea.print(nombrecliente+";");
        linea.print(apellidopat+";");
        linea.print(apellidomat+";");
        linea.print(nacimiento+";");
        linea.print(tel+";");
        linea.print(cel+";");
        linea.print(fingreso+";");
        linea.print(status+";");
        linea.print(tipo+";");
        linea.print(correo+";");
        linea.print(balance+";");
        linea.print(valorcuo+"\n");
        linea.close();
        escribir.close();
        
        
    }catch(Exception e)
    {
        texto=("Error"+e);
    }
    
    return texto;
}

public ArrayList LeerDatos(String idcliente)throws FileNotFoundException,
UnsupportedEncodingException, IOException 
{
    boolean encontrado=false;
    int idac=Integer.parseInt(idcliente);
    ArrayList<String> ArrayCliente=new ArrayList<String>();
    File g=new File("Clientes.txt");
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
            String apellidopat=sl.next();
            String apellidomat=sl.next();
            String direc=sl.next();
             String fechana=sl.next();
             String tel=sl.next();
             String cel=sl.next();
             String fechaing=sl.next();
             String status=sl.next();
             String tipo=sl.next();
             String correo=sl.next();
             String balance=sl.next();
             String valorcuota=sl.next();
            ArrayCliente.add("1");
            ArrayCliente.add(nombre);
            ArrayCliente.add(apellidopat);
            ArrayCliente.add(apellidomat);
            ArrayCliente.add(direc);
            ArrayCliente.add(fechana);
            ArrayCliente.add(tel);
            ArrayCliente.add(cel);
            ArrayCliente.add(fechaing);
            ArrayCliente.add(status);
            ArrayCliente.add(tipo);
            ArrayCliente.add(correo);
            ArrayCliente.add(balance);
            ArrayCliente.add(valorcuota);
            }
                    
        
 
        }
        s.close();
        
        
    }catch(Exception e)
    {
        System.out.println("ERROR "+e);
    }
              
    return ArrayCliente;
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
