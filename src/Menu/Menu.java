/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author alex008c
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mantenimiento = new javax.swing.JMenu();
        jmenuusuario = new javax.swing.JMenuItem();
        jmenuentrenador = new javax.swing.JMenuItem();
        jmenulocalizacion = new javax.swing.JMenuItem();
        jmenusalas = new javax.swing.JMenuItem();
        jmenuactividades = new javax.swing.JMenuItem();
        jmenuhorario = new javax.swing.JMenuItem();
        jmenuclientes = new javax.swing.JMenuItem();
        jmenuestado = new javax.swing.JMenuItem();
        jmenureservas = new javax.swing.JMenuItem();
        jmenureseactividades = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmenucuotas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setAlignmentX(5.0F);
        jMenuBar1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(25, 32769));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(20, 35));

        mantenimiento.setBackground(new java.awt.Color(153, 153, 153));
        mantenimiento.setForeground(new java.awt.Color(51, 51, 51));
        mantenimiento.setText("Mantenimiento ");
        mantenimiento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        mantenimiento.setMaximumSize(new java.awt.Dimension(130, 140));
        mantenimiento.setPreferredSize(new java.awt.Dimension(100, 100));

        jmenuusuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenuusuario.setText("De Usuarios");
        mantenimiento.add(jmenuusuario);

        jmenuentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenuentrenador.setText("De Etrenador");
        mantenimiento.add(jmenuentrenador);

        jmenulocalizacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenulocalizacion.setText("De Localización");
        mantenimiento.add(jmenulocalizacion);

        jmenusalas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenusalas.setText("De Salas");
        mantenimiento.add(jmenusalas);

        jmenuactividades.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenuactividades.setText("De Actividades");
        mantenimiento.add(jmenuactividades);

        jmenuhorario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenuhorario.setText("De Horarios Actividades");
        mantenimiento.add(jmenuhorario);

        jmenuclientes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenuclientes.setText("Clientes");
        mantenimiento.add(jmenuclientes);

        jmenuestado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenuestado.setText("Estado Reservas");
        mantenimiento.add(jmenuestado);

        jmenureservas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenureservas.setText("De Reservas");
        mantenimiento.add(jmenureservas);

        jmenureseactividades.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenureseactividades.setText("Reversa Actividades");
        mantenimiento.add(jmenureseactividades);

        jMenuBar1.add(mantenimiento);

        jMenu2.setBackground(new java.awt.Color(153, 153, 153));
        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Movimientos");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenu2.setMaximumSize(new java.awt.Dimension(130, 140));
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 100));

        jmenucuotas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmenucuotas.setText("Cuotas");
        jMenu2.add(jmenucuotas);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(153, 153, 153));
        jMenu3.setForeground(new java.awt.Color(51, 51, 51));
        jMenu3.setText("Procesos");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenu3.setMaximumSize(new java.awt.Dimension(130, 140));
        jMenu3.setPreferredSize(new java.awt.Dimension(100, 100));

        jMenu7.setText("Cobro");
        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu1.setBackground(new java.awt.Color(153, 153, 153));
        jMenu1.setForeground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Consultas");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(130, 140));
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 100));
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jmenuactividades;
    private javax.swing.JMenuItem jmenuclientes;
    private javax.swing.JMenuItem jmenucuotas;
    private javax.swing.JMenuItem jmenuentrenador;
    private javax.swing.JMenuItem jmenuestado;
    private javax.swing.JMenuItem jmenuhorario;
    private javax.swing.JMenuItem jmenulocalizacion;
    private javax.swing.JMenuItem jmenureseactividades;
    private javax.swing.JMenuItem jmenureservas;
    private javax.swing.JMenuItem jmenusalas;
    private javax.swing.JMenuItem jmenuusuario;
    private javax.swing.JMenu mantenimiento;
    // End of variables declaration//GEN-END:variables
}
