/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alex008c
 */
public class ManejoReservaActividades {
    
    public void GuardarDatos (String id, String dia, String anio, String dia1, String mes1, String anio1, String idest, String idcliente, String idacti, String idhoacti) throws IOException
    {
        try
        {
            FileWriter F1=new FileWriter("Reserva.txt", true);
            PrintWriter pw=new PrintWriter(F1);
            pw.println(id + ";" + dia + "; " + anio + "; " + dia1 + "; " + mes1 + "; " + anio1 + "; " + idest + "; " + idcliente + "; " + idacti + "; " + idhoacti);
            pw.close();
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar archivo"+ ex);
        }
    }
    
    public void ModificaDatos(String LineaNueva, String id )
    {
        
        File fNuevo= new File("ReservaActividades2.txt");
        File fAntiguo= new File("ReservaActividades.txt");
        
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
            //Renombro el fichero 
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
    } //Fin metodo modifica datos
    

void Escribir(File fFichero, String cadena)
    {
        BufferedWriter bw;
        
        try
        {
            if(!fFichero.exists())
            {
                fFichero.createNewFile();
            }
                bw=new BufferedWriter(new FileWriter(fFichero, true));
                bw.write(cadena+"\r\n");
                bw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al procesar."+ e);
        }
    }

public void borrar (File Ffichero)
    {
        try
        {
            if(Ffichero.exists())
            {
                Ffichero.delete();
            }
        }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error al Borrar." + e);
    }
    } // fin metodo borrar
    
    public void Delay(long milis)
    {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // fin metodo delay
    
}
