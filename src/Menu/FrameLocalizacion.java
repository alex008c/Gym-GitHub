/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//hay que dar enter luego de poner el id, si esta en el archivo tira el el lugar
/**
 *
 * @author pedro
 */
public class FrameLocalizacion extends javax.swing.JFrame {
boolean encontrado=false;
boolean crear=false;
    /**
     * Creates new form FrameLocalizacion
     */
    public FrameLocalizacion() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(30,30,30));
        titulo.setForeground(new java.awt.Color(204,204,204));
        botonguardar.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    public void validar()
    {
         if(idlocalizacion.getText().isEmpty())
        {
            campid.setText("*");
        }
        else
        {
            camplugar.setText("");
        }
         if(tipolocalizacion.getText().isEmpty())
         {
             camplugar.setText("*");
         }
         else
         {
             camplugar.setText("");
         }
         if(idlocalizacion.getText().isEmpty()||tipolocalizacion.getText().isEmpty())
         {
             botonguardar.setEnabled(false);
         }
         else
         {
             botonguardar.setEnabled(true);
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idlocalizacion = new javax.swing.JTextField();
        tipolocalizacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonguardar = new javax.swing.JButton();
        botonmenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        accion = new javax.swing.JTextField();
        campid = new javax.swing.JLabel();
        camplugar = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        CLEAR = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idlocalizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idlocalizacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idlocalizacionKeyTyped(evt);
            }
        });

        tipolocalizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tipolocalizacionKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/id (2).png"))); // NOI18N
        jLabel1.setText("ID LOCALIZACION");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/direccion.png"))); // NOI18N
        jLabel2.setText("Lugar");

        botonguardar.setBackground(new java.awt.Color(0, 0, 0));
        botonguardar.setForeground(new java.awt.Color(204, 204, 204));
        botonguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        botonguardar.setText("Guardar");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        botonmenu.setBackground(new java.awt.Color(0, 0, 0));
        botonmenu.setForeground(new java.awt.Color(204, 204, 204));
        botonmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        botonmenu.setText("Menu");
        botonmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonmenuActionPerformed(evt);
            }
        });

        accion.setEditable(false);
        accion.setEnabled(false);

        campid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campid.setForeground(new java.awt.Color(255, 0, 0));

        camplugar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        camplugar.setForeground(new java.awt.Color(255, 0, 0));

        titulo.setFont(new java.awt.Font("Viner Hand ITC", 1, 30)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("Localizacion");

        CLEAR.setBackground(new java.awt.Color(0, 0, 0));
        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Limpiar.png"))); // NOI18N

        limpiar.setBackground(new java.awt.Color(0, 0, 0));
        limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(204, 204, 204));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiar)
                        .addGap(49, 49, 49)
                        .addComponent(botonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipolocalizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(idlocalizacion))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camplugar)
                            .addComponent(campid))
                        .addContainerGap(97, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(campid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camplugar)
                    .addComponent(jLabel2)
                    .addComponent(tipolocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/limpiar.png")));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idlocalizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idlocalizacionKeyTyped
        
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
 
        
    }//GEN-LAST:event_idlocalizacionKeyTyped

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        
                  
  
       String ida=idlocalizacion.getText();
String tipo=tipolocalizacion.getText();


String msj;
String nuevalinea="";
ManejoLocalizacion ma=new ManejoLocalizacion();

try
{
    if(crear==false)
    {
       msj= ma.GuardarDatos(ida,tipo);
    }
    else
    {
        nuevalinea=(ida+"; "+tipo);
        ma.ModificarDatos(nuevalinea,ida);
    }
    accion.setText("Guardando datos");

    
    Blanquear();
                
    
    
    
}catch(Exception e)
{
    System.out.println("ERROR"+e);
} 
          

    }//GEN-LAST:event_botonguardarActionPerformed

    private void botonmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmenuActionPerformed
        // TODO add your handling code here:
     new ManejoLogin().Leer();
        
        this.dispose();
    }//GEN-LAST:event_botonmenuActionPerformed

    private void idlocalizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idlocalizacionKeyReleased
        // TODO add your handling code here:
        validar();
        int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(idlocalizacion.getText());

        Scanner s;
        
        try {
            
            File f=new File("Localizacion.txt");
            
            if(!f.exists())
            {
                
                f.createNewFile();
            }
            s = new Scanner(f);
            //else
            
                while (s.hasNextLine() && !encontrado)
                {
                    String linea = s.nextLine();

                    Scanner sl = new Scanner(linea);

                    sl.useDelimiter("\\s*;\\s*");
                    try {
                        if(cod==Integer.parseInt(sl.next()))
                        {
             
                            tipolocalizacion.setText(sl.next());
                       encontrado=true;
                       crear=true;
                       accion.setText("Modificando");
                        }
                        else
                        {
                            tipolocalizacion.setText("");
                            encontrado=false;
                            crear=false;
                            accion.setText("Creando");
                        }
                
                    } // fin try
                    catch (Exception  e1)
                    {
                       // JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                       
                    }
                } // fin while
            

            s.close();
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }
                   
    }//GEN-LAST:event_idlocalizacionKeyReleased

    private void tipolocalizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipolocalizacionKeyReleased
 validar();
    }//GEN-LAST:event_tipolocalizacionKeyReleased

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        idlocalizacion.setText("");
        tipolocalizacion.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLocalizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLocalizacion().setVisible(true);
            }
        });
    }
        public void Blanquear()
        {
            tipolocalizacion.setText("");
            idlocalizacion.setText("");
        }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLEAR;
    private javax.swing.JTextField accion;
    private javax.swing.JButton botonguardar;
    private javax.swing.JButton botonmenu;
    private javax.swing.JLabel campid;
    private javax.swing.JLabel camplugar;
    private javax.swing.JTextField idlocalizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField tipolocalizacion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
