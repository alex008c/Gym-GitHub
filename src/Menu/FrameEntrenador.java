/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author alex008c
 */
public class FrameEntrenador extends javax.swing.JFrame {
    /**
     * Creates new form FrameEntrenador
     */
    public FrameEntrenador() {
        initComponents();
    }
   Boolean crear = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        identrenador = new javax.swing.JLabel();
        nombreentrenador = new javax.swing.JLabel();
        apellidoentrenador = new javax.swing.JLabel();
        telentrenador = new javax.swing.JLabel();
        correoentrenador = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        campoid = new javax.swing.JTextField();
        camponombre = new javax.swing.JTextField();
        campoapellido = new javax.swing.JTextField();
        campotel = new javax.swing.JTextField();
        campocorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        estatus = new javax.swing.JTextPane();
        limpiar = new javax.swing.JButton();
        HOME = new javax.swing.JLabel();
        CLEAR = new javax.swing.JLabel();
        SAVE = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GYM");
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Entrenador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(25, 25, 25));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));

        identrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        identrenador.setForeground(new java.awt.Color(204, 204, 204));
        identrenador.setText("ID Entrenador");

        nombreentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombreentrenador.setForeground(new java.awt.Color(204, 204, 204));
        nombreentrenador.setText("Nombre Entrenador");

        apellidoentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        apellidoentrenador.setForeground(new java.awt.Color(204, 204, 204));
        apellidoentrenador.setText("Apellido Entrenador");

        telentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telentrenador.setForeground(new java.awt.Color(204, 204, 204));
        telentrenador.setText("Tel. Entrenador");

        correoentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correoentrenador.setForeground(new java.awt.Color(204, 204, 204));
        correoentrenador.setText("Correo Entrenador");

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(204, 204, 204));
        menu.setText("Menu");
        menu.setMaximumSize(new java.awt.Dimension(96, 35));
        menu.setMinimumSize(new java.awt.Dimension(96, 35));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(0, 0, 0));
        registrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(204, 204, 204));
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        campoid.setBackground(new java.awt.Color(204, 204, 204));
        campoid.setForeground(new java.awt.Color(0, 0, 0));
        campoid.setCaretColor(new java.awt.Color(0, 0, 0));
        campoid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoidKeyTyped(evt);
            }
        });

        camponombre.setBackground(new java.awt.Color(204, 204, 204));
        camponombre.setCaretColor(new java.awt.Color(0, 0, 0));

        campoapellido.setBackground(new java.awt.Color(204, 204, 204));
        campoapellido.setCaretColor(new java.awt.Color(0, 0, 0));

        campotel.setBackground(new java.awt.Color(204, 204, 204));
        campotel.setCaretColor(new java.awt.Color(0, 0, 0));

        campocorreo.setBackground(new java.awt.Color(204, 204, 204));
        campocorreo.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Estatus");

        estatus.setBackground(new java.awt.Color(51, 51, 51));
        estatus.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        estatus.setForeground(new java.awt.Color(51, 51, 51));
        estatus.setCaretColor(new java.awt.Color(102, 102, 102));
        estatus.setEnabled(false);
        jScrollPane1.setViewportView(estatus);

        limpiar.setBackground(new java.awt.Color(0, 0, 0));
        limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(204, 204, 204));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        HOME.setBackground(new java.awt.Color(0, 0, 0));
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N

        CLEAR.setBackground(new java.awt.Color(0, 0, 0));
        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Limpiar.png"))); // NOI18N

        SAVE.setBackground(new java.awt.Color(0, 0, 0));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoentrenador)
                    .addComponent(telentrenador)
                    .addComponent(correoentrenador)
                    .addComponent(nombreentrenador)
                    .addComponent(identrenador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponombre)
                    .addComponent(campotel)
                    .addComponent(campocorreo))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limpiar)
                        .addGap(50, 50, 50)
                        .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registrar)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identrenador)
                    .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreentrenador)
                    .addComponent(camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoentrenador)
                    .addComponent(campoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telentrenador)
                    .addComponent(campotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoentrenador)
                    .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png")));
        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/limpiar.png")));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed
                                                                        
    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
       campoid.setText("");
       camponombre.setText("");
       campoapellido.setText("");
       campotel.setText("");
       campocorreo.setText("");
       estatus.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void campoidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoidKeyReleased
      int cod;
        boolean encontrado=false;

        cod=Integer.parseInt(campoid.getText());

        Scanner s;
        try {
            File f=new File("Entrenador.txt");
            
            if(!f.exists())
            {
                f.createNewFile();
                estatus.setText("Creando...");
            }
            s = new Scanner(f);
                while (s.hasNextLine() && !encontrado)
                {
                    String linea = s.nextLine();

                    Scanner sl = new Scanner(linea);

                    sl.useDelimiter("\\s*;\\s*");
                    try {
                        if(cod==Integer.parseInt(sl.next()))
                        {
                            camponombre.setText(sl.next());
                            campoapellido.setText(sl.next());
                            campotel.setText(sl.next());
                            campocorreo.setText(sl.next());
                            
                            encontrado=true;
                            crear = true;
                            estatus.setText("Modificando...");
                        }
                        else
                        { 
                            camponombre.setText("");
                            campoapellido.setText("");
                            campotel.setText("");
                            campocorreo.setText("");
                            estatus.setText(""); 
                            encontrado=false;
                            crear = false;
                            estatus.setText("Creando...");
                        }
                        
                    } // fin try
                    catch (Exception  e1)
                    {
                       JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                       
                    }
                } // fin while
            

            s.close();
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }
       
    }//GEN-LAST:event_campoidKeyReleased

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
    String id="";
    String nom="";
    String ape="";
    String tel="";
    String cor="";
    
    ManejoEntrenador me=new ManejoEntrenador();
        id=campoid.getText();
        nom=camponombre.getText();
        ape=campoapellido.getText();
        tel=campotel.getText();
        if(campocorreo.getText().isEmpty()){
           cor="-"; 
        }
        else{
        cor=campocorreo.getText();}
        String Snuevalinea="";
        try {

            if (crear==false)
            {
                me.GuardarDatos (id, nom, ape, tel, cor);
            }
            else
            {
                Snuevalinea=(id + "; " + nom + "; " + ape + "; " + tel + "; " + cor);
                me.ModificaDatos(Snuevalinea,id);
            }
            campoid.setText("");
            camponombre.setText("");
            campoapellido.setText("");
            campotel.setText("");
            campocorreo.setText("");
            estatus.setText("");

        } // fin try
        
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void campoidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoidKeyTyped
        // TODO add your handling code here:
       char c=evt.getKeyChar();
       if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_campoidKeyTyped

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
            java.util.logging.Logger.getLogger(FrameEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEntrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JLabel CLEAR;
    javax.swing.JLabel HOME;
    javax.swing.JLabel SAVE;
    javax.swing.JLabel apellidoentrenador;
    javax.swing.JTextField campoapellido;
    javax.swing.JTextField campocorreo;
    javax.swing.JTextField campoid;
    javax.swing.JTextField camponombre;
    javax.swing.JTextField campotel;
    javax.swing.JLabel correoentrenador;
    javax.swing.JTextPane estatus;
    javax.swing.JLabel identrenador;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JPanel jPanel1;
    javax.swing.JPanel jPanel2;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JButton limpiar;
    javax.swing.JButton menu;
    javax.swing.JLabel nombreentrenador;
    javax.swing.JButton registrar;
    javax.swing.JLabel telentrenador;
    // End of variables declaration//GEN-END:variables
}
