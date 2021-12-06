/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

//hay que dar enter luego de poner el id, si esta en el archivo tira el el lugar
/**
 *
 * @author pedro
 */
public class FrameLocalizacion extends javax.swing.JFrame {
boolean encontrado;
    /**
     * Creates new form FrameLocalizacion
     */
    public FrameLocalizacion() {
        initComponents();
        botonguardar.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    public void validar()
    {
         if(idlocalizacion.getText().isEmpty())
        {
            campid.setText("Campo Obligatorio");
        }
        else
        {
            camplugar.setText("");
        }
         if(tipolocalizacion.getText().isEmpty())
         {
             camplugar.setText("Campo Obligatorio");
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
        jLabel1.setText("ID LOCALIZACION");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Lugar");

        botonguardar.setText("Guardar");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

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
                .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idlocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipolocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camplugar)
                            .addComponent(campid))
                        .addContainerGap(133, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(campid))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipolocalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camplugar))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idlocalizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idlocalizacionKeyTyped
        
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
       
        
        
        
    }//GEN-LAST:event_idlocalizacionKeyTyped

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
        
                  
  
       String idl=idlocalizacion.getText();
       String tipo=tipolocalizacion.getText();
       String msj;
       ManejoLocalizacion ml=new ManejoLocalizacion();
       try
       {
           if(encontrado==false)
           {
               msj=ml.GuardarDatos(idl, tipo);
               
           }
           else
                   {
                       ml.ModificarDatos(idl, tipo);
                        
                   }
            accion.setText("Guardando datos");
          
           Blanquear();
       
       }catch(Exception e)
       {
           System.out.println("ERROR" +e);
       }       
                  
    
    }//GEN-LAST:event_botonguardarActionPerformed

    private void botonmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonmenuActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonmenuActionPerformed

    private void idlocalizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idlocalizacionKeyReleased
        // TODO add your handling code here:
        validar();
        encontrado=false;
        ManejoLocalizacion ml=new ManejoLocalizacion();
        String idl=idlocalizacion.getText();
        ArrayList<String> RetornoLocalizacion =new ArrayList<String>();
        try
        {
            RetornoLocalizacion=ml.LeerDatos(idl);
            if(!RetornoLocalizacion.isEmpty()&&"1".equals(RetornoLocalizacion.get(0)))
            {
                encontrado=true;
                
                tipolocalizacion.setText(RetornoLocalizacion.get(1));
                accion.setText("Modificando");
            }
            else{
                tipolocalizacion.setText("");
                accion.setText("Creando");
            }
            
  
            
        
                     }catch(UnsupportedEncodingException e)
        {
            System.out.println("ERROR" + e);
                  
        }catch(Exception e)
        {
            System.out.println("ERROR"+e);
        }
                   
    }//GEN-LAST:event_idlocalizacionKeyReleased

    private void tipolocalizacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipolocalizacionKeyReleased
 validar();
    }//GEN-LAST:event_tipolocalizacionKeyReleased

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
    private javax.swing.JTextField accion;
    private javax.swing.JButton botonguardar;
    private javax.swing.JButton botonmenu;
    private javax.swing.JLabel campid;
    private javax.swing.JLabel camplugar;
    private javax.swing.JTextField idlocalizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tipolocalizacion;
    // End of variables declaration//GEN-END:variables
}
