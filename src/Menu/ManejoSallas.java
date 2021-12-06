package Menu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class ManejoSallas {
    public String GuardarDatos(String idsala,String nombresala,String descripcion,String localizacion) throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        String texto=null;
        File f=new File("Salas.txt");
        FileWriter escribir;
        PrintWriter linea;
        //BufferedWriter escribir=null;
        
       // escribir=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true),"utf-8"));
        try
        {
            
        
        if(!f.exists())
        {
            f.createNewFile();
        }
        escribir=new FileWriter(f,true);
        linea=new PrintWriter(escribir);
        linea.print(idsala+";");
        linea.print(nombresala+";");
        linea.print(descripcion+";");
        linea.print(localizacion+"\n");
        linea.close();
        escribir.close();
        }catch(IOException e)
        {
            texto+="Error"+ e;
        }
        return (texto);
    }
    
    
    public ArrayList LeerDatos(String idsala) throws FileNotFoundException,UnsupportedEncodingException,IOException
    {
        boolean encontrado=false;
        int id=Integer.parseInt(idsala);
        ArrayList<String> ArrayListArchivo=new ArrayList<String>();
        
        File f=new File("Salas.txt");
        try
        {
            
        if(!f.exists())
        {
            f.createNewFile();
        }
        Scanner s=new Scanner(f);
        while(s.hasNextLine()&& !encontrado)
        {
            String linea=s.nextLine();
            Scanner s1=new Scanner(linea);
            s1.useDelimiter("\\s*;\\s*");
            int idsalaarch=Integer.parseInt(s1.next());
            if(id==idsalaarch)
            {
                encontrado=true;
       
                String nombresala=s1.next();
                String descripcion=s1.next();
                String localizacion=s1.next();
                ArrayListArchivo.add("1");
                ArrayListArchivo.add(nombresala);
                ArrayListArchivo.add(descripcion);
                ArrayListArchivo.add(localizacion);
            }
 
            
                
            
        }
        s.close();
        }catch(IOException e)
        {
            System.out.println("Error"+e);
        }
        return ArrayListArchivo;
    }
    
    public void ModificarDatos(String idsala,String nombresala,String descripcion, String localizacion)
    {
        File fl=new File("Salas1.txt");
        File fAntiguo=new File("Salas.txt");
        String cadena=(idsala+";"+nombresala+";"+descripcion+";"+localizacion+"\n");
        String ncadena=(idsala+";"+nombresala+";"+descripcion+";"+localizacion+"\n");
        int id=Integer.parseInt(idsala);
        
        
        try
                {
                   if(fAntiguo.exists())
                   {
                       String linea;
                       Scanner z=new Scanner(fAntiguo);
                       while(z.hasNextLine())
                       {
                           linea=z.nextLine();
                           Scanner s1=new Scanner(linea);
                           s1.useDelimiter("\\s*;\\s*");
                           int salasarch=Integer.parseInt(s1.next());
                           if(id==salasarch)
                           {
                               Escribir(fl,ncadena);
                           }
                           else
                           {
                               Escribir(fl,linea);
                           }
                           
                           z.close();
                           String zAntiguo=fAntiguo.getName();
                           borrar(fAntiguo);
                           fl.renameTo(fAntiguo);
                       }
                   }
                   else
                   {
                       System.out.println("Fichero invalido..");
                   }
                  
                }
        catch(IOException e)
                {
                    System.out.println("Error"+e);
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
        }
        catch(IOException e)
                {
                    System.out.println("Error "+e);
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
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e);
                
        }
    }
    
   

}
