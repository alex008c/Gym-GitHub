/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        botoniniciar.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

   public void validar()
   {
       if(usuario.getText().isEmpty())
       {
           campusuario.setText("Campo Obligatorio");
       }
       else
       {
           campusuario.setText("");
       }
       if(contraseña.getText().isEmpty())
       {
           campcontra.setText("Campo Obligatorio");
       }
       else
       {
           campcontra.setText("");
       }
       if(usuario.getText().isEmpty()||contraseña.getText().isEmpty())
       {
           botoniniciar.setEnabled(false);
       }
       else
       {
           botoniniciar.setEnabled(true);
       }
                 
                   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        botoniniciar = new javax.swing.JButton();
        campusuario = new javax.swing.JLabel();
        campcontra = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usuarioKeyReleased(evt);
            }
        });

        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraseñaKeyReleased(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 0, 0));
        jTextField3.setFont(new java.awt.Font("Wide Latin", 3, 18)); // NOI18N
        jTextField3.setText("LOGIN");
        jTextField3.setSelectionColor(new java.awt.Color(153, 153, 153));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 0, 0));
        jTextField4.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jTextField4.setText("Usuario");

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 0, 0));
        jTextField5.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jTextField5.setText("Contraseña");

        botoniniciar.setBackground(new java.awt.Color(255, 0, 0));
        botoniniciar.setFont(new java.awt.Font("Wide Latin", 3, 10)); // NOI18N
        botoniniciar.setText("Iniciar");
        botoniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoniniciarActionPerformed(evt);
            }
        });

        campusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campusuario.setForeground(new java.awt.Color(255, 0, 0));

        campcontra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campcontra.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jTextField4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campusuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campcontra))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(botoniniciar)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(campusuario))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(campcontra)))
                .addGap(45, 45, 45)
                .addComponent(botoniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoniniciarActionPerformed
        // TODO add your handling code here:
        File archivo=new File("Usuarios.txt");
        Menu m=new Menu();
        
        String usua=usuario.getText();
        String contra=new String(contraseña.getPassword());
        
        try
        {
            if(!archivo.exists())
            {
                archivo.createNewFile();
            }
            Scanner s=new Scanner(archivo);
            while(s.hasNextLine())
            {
                String linea=s.nextLine();
                Scanner sl=new Scanner(linea);
                sl.useDelimiter("\\s*;\\s*");
                String usuarioarch=sl.next();
                if(usua.equals(usuarioarch))
                {
                    String contr=sl.next();
                    String nivel=sl.next();
                    if(contra.equals(contr))
                    {
                        if(nivel.equals("1"))
                        {
                     m.setVisible(true);
                     this.dispose();
                        }
                    
                        
                    else
                    {
                        //aqui va el usuario 1
                        
                        m.setVisible(true);
                        
                    }
                    }else
                    {
                        System.out.println("Contraseña incorrecta");
                    }
                    
                }
                else{
                    System.out.println("Usuario no existe");
                }
                
            }
                        
            
            
        }catch(Exception e)
        {
            System.out.println("Error "+e);
        }
                  
        
    }//GEN-LAST:event_botoniniciarActionPerformed

    private void usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_usuarioKeyReleased

    private void contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_contraseñaKeyReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoniniciar;
    private javax.swing.JLabel campcontra;
    private javax.swing.JLabel campusuario;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
