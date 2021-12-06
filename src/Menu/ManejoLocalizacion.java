package Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ManejoLocalizacion {
public String GuardarDatos(String idlocalizacion,String tipo)
{
    String texto=null;
    File f=new File("Localizacion.txt");
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
        linea.print(idlocalizacion+";");
        linea.print(tipo+"\n");
        linea.close();
        escribir.close();
        
        
    }catch(Exception e)
    {
        texto=("Error"+e);
    }
    
    return texto;
}

public ArrayList LeerDatos(String idlocalizacion)throws FileNotFoundException,
UnsupportedEncodingException, IOException 
{
    boolean encontrado=false;
    int idlo=Integer.parseInt(idlocalizacion);
    ArrayList<String> ArrayLocalizacion=new ArrayList<String>();
    File g=new File("Localizacion.txt");
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
            if(idd==idlo)
            {
            
            String tipo=sl.next();
            ArrayLocalizacion.add("1");
           
            ArrayLocalizacion.add(tipo);
            }
                    
        
 
        }
        s.close();
        
        
    }catch(Exception e)
    {
        System.out.println("ERROR "+e);
    }
              
    return ArrayLocalizacion;
}
public void ModificarDatos(String aidi,String tipo)
{
    File fNuevo=new File("Localizacion1.txt");
    File fAntiguo =new File("Localizacion.txt");
    String cadena=(aidi+";"+tipo+"\n");
    String ncadena=(aidi+";"+tipo+"\n");
    
    int id=Integer.parseInt(aidi);
   
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
