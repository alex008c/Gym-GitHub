package Menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ManejoUsuarios {
 public void GuardarDatos(String usuario,String contra,int nivel,String nombre,String apellido,String correo)
{
    String texto=null;
    File f=new File("Usuarios.txt");
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
        linea.print(usuario+";");
        linea.print(contra+";");
        linea.print(nivel+";");
        linea.print(nombre+";");
        linea.print(apellido+";");
        linea.print(correo+"\n");
    
        
       
        linea.close();
        escribir.close();
        
        
    }catch(Exception e)
    {
        texto=("Error"+e);
    }
}
    public void ModificarDatos(String LineaNueva,String id)
{  
        File fNuevo= new File("Usuarios2.txt");
        File fAntiguo= new File("Usuarios.txt");
        
        boolean encontrado = false;
        //String aCadena=LineaAntigua;
        String nCadena=LineaNueva;
        int cod=Integer.parseInt(id); 
    try
    {
        
        if(fAntiguo.exists())
        {
        Scanner s = new Scanner(fAntiguo);
        
      //  br = new BufferedReader(new FileReader(fAntiguo));
      
        String linea;
        
            while (s.hasNextLine()) {
                
                linea=s.nextLine();
                Scanner sl = new Scanner(linea);
                 sl.useDelimiter("\\s*;\\s*"); 
                int codigoArc = Integer.parseInt(sl.next()); 
             if(cod==codigoArc) 
             { 
            Escribir(fNuevo,nCadena); 
                } 
                else 
                   { 
                     Escribir(fNuevo,linea); 
                   }
            } // fin while

             s.close(); 
             
              // Capturo el nombre del fichero antiguo 
            //String nAntiguo = fAntiguo.getName(); 
            // Borro el fichero antiguo 
            borrar(fAntiguo); 
            //Renombro el fichero auxiliar con el nombre del fichero antiguo 
            fNuevo.renameTo(fAntiguo); 
    }
    else
    {
        System.out.println("Fichero no Existe");
    }
}catch(Exception e)
{
    System.out.println(e);
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

 
 
 
 
 

