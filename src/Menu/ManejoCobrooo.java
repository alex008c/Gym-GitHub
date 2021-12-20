package Menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ManejoCobrooo {
    
    public void GuardarDatos(String id,String dia,String mes,String anio,String cliente,String conc,double valor,boolean status)
{
     try
        {
            FileWriter F1=new FileWriter("Cobros.txt", true);
            PrintWriter pw=new PrintWriter(F1);
            pw.println(id +";"+ dia +";"+ mes +";"+ anio +";"+ cliente +";"+ conc +";"+ valor +";"+ status);
            pw.close();
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar archivo"+ ex);
        }
}
    public void ModificarDatos(String LineaNueva,String id)
{  
        File fNuevo= new File("Cobros2.txt");
        File fAntiguo= new File("Cobros.txt");
        
        boolean encontrado = false;
        String nCadena=LineaNueva;
        int cod=Integer.parseInt(id); 
    try
    {
        
        if(fAntiguo.exists())
        {
        Scanner s = new Scanner(fAntiguo);
        
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
public void Delay(long milis)
    {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // fin metodo delay



//ModificarDatos2
public void ModificarDatos2(String LineaNueva,String id)
{  
        File fNuevo= new File("Cobros2.txt");
        File fAntiguo= new File("Cobros.txt");
        
        boolean encontrado = false;
        String nCadena=LineaNueva;
        int cod=Integer.parseInt(id); 
    try
    {
        
        if(fAntiguo.exists())
        {
        Scanner s = new Scanner(fAntiguo);
        
        String linea;
        
            while (s.hasNextLine()) {
                
                linea=s.nextLine();
                Scanner sl = new Scanner(linea);
                 sl.useDelimiter("\\s*;\\s*"); 
                int codigoArc = Integer.parseInt(sl.next()); 
                
             if(cod!=codigoArc) 
             {  
             Escribir2(fNuevo,linea); 
                } 
            } // fin while

             s.close(); 
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
    public void Escribir2(File fichero,String zcadena)
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
public void borrar2(File fichero)
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
public void Delay2(long milis)
    {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // fin metodo delay


}
