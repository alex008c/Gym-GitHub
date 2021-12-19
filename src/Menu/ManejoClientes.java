package Menu;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class ManejoClientes {

    public void GuardarDatos(String idcliente,String nombrecliente,String apellidopat,String apellidomat,String direc,String dia,String mes,String anio,
            String tel,String cel,String fingreso,String status,String tipo,String correo,
    double balan,double cuo)
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
        linea.print(direc+";");
        linea.print(dia+";");
        linea.print(mes+";");
        linea.print(anio+";");
        linea.print(tel+";");
        linea.print(cel+";");
        linea.print(fingreso+";");
        linea.print(status+";");
        linea.print(tipo+";");
        linea.print(correo+";");
       
        linea.print(balan+";");
        linea.print(cuo+"\n");
        
       
        linea.close();
        escribir.close();
        
        
    }catch(Exception e)
    {
        texto=("Error"+e);
    }
    
    
}


public void ModificarDatos( String LineaNueva,String id)
{  
        File fNuevo= new File("Clientes2.txt");
        File fAntiguo= new File("Clientes.txt");
        
        
        String nCadena=LineaNueva;
        int coddd=Integer.parseInt(id); 
    try
    {
        
        if(fAntiguo.exists())
        {
        Scanner s = new Scanner(fAntiguo);
        
            System.out.println("ola");
        String linea;
        
            while (s.hasNextLine()) {
                            System.out.println("ola1");

                linea=s.nextLine();
                Scanner sl = new Scanner(linea);
                 sl.useDelimiter("\\s*;\\s*"); 
                int codigoArc = Integer.parseInt(sl.next()); 
             if(coddd==codigoArc) 
             {             System.out.println("ola2");

                Escribir(fNuevo,nCadena); 
                } 
                else 
                   {             System.out.println("ola3");

                     Escribir(fNuevo,linea); 
                   }
            } // fin while

             s.close(); 
                         System.out.println("ola4");

            // Borro el fichero antiguo 
            borrar(fAntiguo); 
                        System.out.println("ola5");

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
public void borrar(File Ffichero)
{
    try
    {
        if(Ffichero.exists())
        {            System.out.println("ola6");

            Ffichero.delete();
        }
                    
        
    }catch(Exception e)
    {
        System.out.println("ERROR" + e);
    }
               
    
}
}
