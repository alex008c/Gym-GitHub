/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FrameActividades extends javax.swing.JFrame {
boolean encontrado=false;
boolean crear=false;
    /**
     * Creates new form FrameActividades
     */
    public FrameActividades() {
        initComponents();
        botonguardar.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(30,30,30));
        jPanel1.setBackground(new java.awt.Color(30,30,30));
        titulo.setForeground(Color.white);
        jPanel1.setLayout(null);
    }
    
    public void validar()
    {
         if(idactividad.getText().isEmpty())
        {
            campact.setText("Campo Obligatorio");
        }
        else
        {
            campact.setText("");
        }
          if(nombreactividad.getText().isEmpty())
        {
            campnombre.setText("Campo Obligatorio");
        }
        else
        {
            campnombre.setText("");
        }
           if(descripcionactividad.getText().isEmpty())
        {
            campdescrip.setText("Campo Obligatorio");
        }
        else
        {
            campdescrip.setText("");
        }
            if(localizacionactividad.getText().isEmpty())
        {
            camplocal.setText("Campo Obligatorio");
        }
        else
        {
            camplocal.setText("");
        }
             if(entrenadoractividad.getText().isEmpty())
        {
            campentre.setText("Campo Obligatorio");
        }
        else
        {
            campentre.setText("");
        }
             
             if(idactividad.getText().isEmpty()||nombreactividad.getText().isEmpty()||descripcionactividad.getText().isEmpty()||localizacionactividad.getText().isEmpty()||entrenadoractividad.getText().isEmpty())
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idactividad = new javax.swing.JTextField();
        nombreactividad = new javax.swing.JTextField();
        descripcionactividad = new javax.swing.JTextField();
        localizacionactividad = new javax.swing.JTextField();
        entrenadoractividad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonguardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        accion = new javax.swing.JTextField();
        campact = new javax.swing.JLabel();
        campnombre = new javax.swing.JLabel();
        campdescrip = new javax.swing.JLabel();
        camplocal = new javax.swing.JLabel();
        campentre = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/id (2).png"))); // NOI18N
        jLabel1.setText("ID ACTIVIDAD");

        idactividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idactividadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idactividadKeyTyped(evt);
            }
        });

        nombreactividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreactividadKeyReleased(evt);
            }
        });

        descripcionactividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descripcionactividadKeyReleased(evt);
            }
        });

        localizacionactividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                localizacionactividadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                localizacionactividadKeyTyped(evt);
            }
        });

        entrenadoractividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                entrenadoractividadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                entrenadoractividadKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ic-username_97587.png"))); // NOI18N
        jLabel2.setText("NOMBRE ACTIVIDAD");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/concept_mind_thread_conceit_idea_head_icon_146777.png"))); // NOI18N
        jLabel3.setText("DESCRIPCION");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/direccion.png"))); // NOI18N
        jLabel4.setText("ID LOCALIZACION ACTIVIDAD");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Pokemon_Trainer_Boy_icon-icons.com_67516.png"))); // NOI18N
        jLabel5.setText("ID ENTRENADOR");

        botonguardar.setBackground(new java.awt.Color(0, 0, 0));
        botonguardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N
        botonguardar.setText("GUARDAR");
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        jButton2.setText("MENU");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        accion.setEditable(false);
        accion.setEnabled(false);

        campact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campact.setForeground(new java.awt.Color(255, 0, 0));

        campnombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campnombre.setForeground(new java.awt.Color(255, 0, 0));

        campdescrip.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campdescrip.setForeground(new java.awt.Color(255, 0, 0));

        camplocal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        camplocal.setForeground(new java.awt.Color(255, 0, 0));

        campentre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campentre.setForeground(new java.awt.Color(255, 0, 0));

        titulo.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(204, 204, 204));
        titulo.setText("Actividades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entrenadoractividad, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(localizacionactividad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreactividad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idactividad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descripcionactividad))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campact)
                            .addComponent(campdescrip)
                            .addComponent(campentre)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(camplocal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campnombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonguardar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campact)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campnombre)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descripcionactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campdescrip))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(localizacionactividad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(camplocal)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(accion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(botonguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrenadoractividad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campentre))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed
       String ida=idactividad.getText();
String nombre=nombreactividad.getText();
String descrip=descripcionactividad.getText();
String local=localizacionactividad.getText();
String entrenador=entrenadoractividad.getText();
String msj;
String nuevalinea="";
ManejoActividades ma=new ManejoActividades();

try
{
    if(crear==false)
    {
       msj= ma.GuardarDatos(ida,nombre,descrip,local,entrenador);
    }
    else
    {
        nuevalinea=(ida+"; "+nombre+"; "+descrip+"; "+local+"; "+entrenador);
        ma.ModificarDatos(nuevalinea,ida);
    }
    accion.setText("Guardando datos");

    
    Blanquear();
                
    
    
    
}catch(Exception e)
{
    System.out.println("ERROR"+e);
} 
          
         
    }//GEN-LAST:event_botonguardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idactividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idactividadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_idactividadKeyTyped

    private void localizacionactividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localizacionactividadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_localizacionactividadKeyTyped

    private void idactividadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idactividadKeyReleased

validar();
        int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(idactividad.getText());

        Scanner s;
        
        try {
            
            File f=new File("Actividades.txt");
            
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
                            nombreactividad.setText(sl.next());
                            descripcionactividad.setText(sl.next());
                            localizacionactividad.setText(sl.next());
                            entrenadoractividad.setText(sl.next());
                            
                            encontrado=true;
                            crear = true;
                            //Satigualinea=(campoid.getText() + "; " + camponombre.getText() + "; " + campoapellido.getText() + "; " + campotel.getText() + "; " + campocorreo.getText());
                            accion.setText("Modificando...");
                        }
                        else
                        {  //Salida.setText("Este registro no existe");
                            nombreactividad.setText("");
                            descripcionactividad.setText("");
                            localizacionactividad.setText("");
                            entrenadoractividad.setText("");
 
                            encontrado=false;
                            crear = false;
                            accion.setText("Creando...");
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
       
    }//GEN-LAST:event_idactividadKeyReleased

    private void localizacionactividadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_localizacionactividadKeyReleased
        // TODO add your handling code here:
        validar();
int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(localizacionactividad.getText());

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
             
                            localizacionactividad.setText(sl.next());
                       
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
       
    }//GEN-LAST:event_localizacionactividadKeyReleased

    private void entrenadoractividadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrenadoractividadKeyReleased
        // TODO add your handling code here:
        //
        validar();
   int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(entrenadoractividad.getText());

        Scanner s;
        
        try {
            
            File f=new File("Entrenador.txt");
            
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
                            entrenadoractividad.setText(sl.next());
                         
                            
                           // encontrado=true;
                           // crear = true;
                            //Satigualinea=(campoid.getText() + "; " + camponombre.getText() + "; " + campoapellido.getText() + "; " + campotel.getText() + "; " + campocorreo.getText());
                           // accion.setText("Modificando...");
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
       
        
    }//GEN-LAST:event_entrenadoractividadKeyReleased

    private void nombreactividadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreactividadKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_nombreactividadKeyReleased

    private void descripcionactividadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionactividadKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_descripcionactividadKeyReleased

    private void entrenadoractividadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entrenadoractividadKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_entrenadoractividadKeyTyped

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
            java.util.logging.Logger.getLogger(FrameActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameActividades().setVisible(true);
            }
     
        });
        
    } public void Blanquear()
        {
            nombreactividad.setText("");
            descripcionactividad.setText("");
            localizacionactividad.setText("");
            entrenadoractividad.setText("");
            
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accion;
    private javax.swing.JButton botonguardar;
    private javax.swing.JLabel campact;
    private javax.swing.JLabel campdescrip;
    private javax.swing.JLabel campentre;
    private javax.swing.JLabel camplocal;
    private javax.swing.JLabel campnombre;
    private javax.swing.JTextField descripcionactividad;
    private javax.swing.JTextField entrenadoractividad;
    private javax.swing.JTextField idactividad;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField localizacionactividad;
    private javax.swing.JTextField nombreactividad;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
