/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex008c
 */
public class FrameCuota extends javax.swing.JFrame {

    /**
     * Creates new form FrameCuota
     */
    DefaultTableModel tabla;
    public FrameCuota() {
        initComponents();
        campofechacuota.setText(FechaActual());
        tabla=( DefaultTableModel)this.Tabla.getModel();
    }
int num;
int n=1;
 ;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        campofechacuota = new javax.swing.JTextField();
        campoidcuota = new javax.swing.JTextField();
        campocobro = new javax.swing.JTextField();
        campocorreo = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        HOME = new javax.swing.JLabel();
        CLEAR = new javax.swing.JLabel();
        SAVE = new javax.swing.JLabel();
        botonbuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Cuota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        identrenador.setText("ID Cuota");

        nombreentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nombreentrenador.setForeground(new java.awt.Color(204, 204, 204));
        nombreentrenador.setText("Fecha Cuota");

        apellidoentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        apellidoentrenador.setForeground(new java.awt.Color(204, 204, 204));
        apellidoentrenador.setText("ID Cliente ");

        telentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        telentrenador.setForeground(new java.awt.Color(204, 204, 204));
        telentrenador.setText("Valor Cobro");

        correoentrenador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        correoentrenador.setForeground(new java.awt.Color(204, 204, 204));
        correoentrenador.setText(" Status Cuota");

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
        campoid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campoid.setEnabled(false);
        campoid.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                campoidMouseMoved(evt);
            }
        });

        campofechacuota.setBackground(new java.awt.Color(255, 255, 255));
        campofechacuota.setForeground(new java.awt.Color(0, 0, 0));
        campofechacuota.setCaretColor(new java.awt.Color(0, 0, 0));
        campofechacuota.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        campofechacuota.setEnabled(false);

        campoidcuota.setBackground(new java.awt.Color(204, 204, 204));
        campoidcuota.setCaretColor(new java.awt.Color(0, 0, 0));
        campoidcuota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoidcuotaKeyReleased(evt);
            }
        });

        campocobro.setBackground(new java.awt.Color(204, 204, 204));
        campocobro.setCaretColor(new java.awt.Color(0, 0, 0));
        campocobro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campocobroKeyReleased(evt);
            }
        });

        campocorreo.setBackground(new java.awt.Color(204, 204, 204));
        campocorreo.setCaretColor(new java.awt.Color(0, 0, 0));
        campocorreo.setEnabled(false);

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

        botonbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Buscar.png"))); // NOI18N
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(25, 25, 25));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Detalle Cuota");

        Tabla.setBackground(new java.awt.Color(102, 102, 102));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID cobro", "Fecha", "Cantidad", "Concepto", "Status", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setEnabled(false);
        Tabla.setGridColor(new java.awt.Color(0, 0, 0));
        Tabla.setOpaque(false);
        Tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Tabla);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(apellidoentrenador)
                    .addComponent(telentrenador)
                    .addComponent(correoentrenador)
                    .addComponent(nombreentrenador)
                    .addComponent(identrenador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(campocobro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoidcuota, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoid, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campofechacuota, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpiar)
                .addGap(73, 73, 73)
                .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrar)
                .addGap(24, 24, 24))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identrenador)
                    .addComponent(campoid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreentrenador)
                    .addComponent(campofechacuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoentrenador)
                    .addComponent(campoidcuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telentrenador)
                    .addComponent(campocobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoentrenador)
                    .addComponent(campocorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(SAVE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png")));
        CLEAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/limpiar.png")));
        SAVE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/guardar.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        new ManejoLogin().Leer();
        
        this.dispose();
    }//GEN-LAST:event_menuActionPerformed

    private void campoidMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoidMouseMoved
        Scanner z;
          
        try {
            
            File g=new File("Cuota.txt");
            
            if(!g.exists())
            {
                
                g.createNewFile();
            }
            z = new Scanner(g);
          
            
                while (z.hasNextLine())
                {
                    String linea = z.nextLine();
                      num++;
                    Scanner sll = new Scanner(linea);

           
                }

            z.close();
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }
        
  campoid.setText(String.valueOf(num));
  num=0;
        n=Integer.parseInt(campoid.getText());
       n=n+1;
      
    }//GEN-LAST:event_campoidMouseMoved

    private void campocobroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campocobroKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_campocobroKeyReleased

    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
        int cod;
        tabla.setRowCount(0);
        boolean encontrado=false;

        cod=Integer.parseInt(campoidcuota.getText());

        Scanner s;
        try {
            File f=new File("Cobros.txt");

            s = new Scanner(f);

            do {
                String linea = s.nextLine();

                Scanner sl = new Scanner(linea);

                sl.useDelimiter("\\s*;\\s*");
                try {
                    String id=sl.next();
                    String dia=sl.next();
                    String mes=sl.next();
                    String anio=sl.next();

                    if(cod==Integer.parseInt(sl.next()))
                    {
                        String concepto= sl.next();
                        String cobro=sl.next();
                        String estado=sl.next();
                        double total=0;total+=Double.parseDouble(cobro);
                        tabla.addRow(new Object [] {id,dia+"/"+mes+"/"+anio,cobro,concepto,estado,total});

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "ID no existe.");
                    }

                } // fin try
                catch (Exception  e1)
                {
                    JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);

                }
            }while (s.hasNextLine() ); // fin while
         
        
            s.close();
            
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }
        
    }//GEN-LAST:event_botonbuscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        campoidcuota.setText("");
        campocobro.setText("");
        campoidcuota.setText("");
        
    }//GEN-LAST:event_limpiarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
int cod;
        boolean encontrado=false;
        double deuda=0;

        cod=Integer.parseInt(campoidcuota.getText());

        Scanner s;
        try {
            File f=new File("Cobros.txt");
            
           
            s = new Scanner(f);
                
               do {
                    String linea = s.nextLine();

                    Scanner sl = new Scanner(linea);

                    sl.useDelimiter("\\s*;\\s*");
                    try {
                        String id=sl.next();
                        String dia=sl.next();
                        String mes=sl.next();
                        String anio=sl.next();
                        

                        if(cod==Integer.parseInt(sl.next()))
                        {
                            String concepto=sl.next();
                            String cobro=sl.next();
                            String estado=sl.next();
                            double total2=0,
                                    deu=Double.parseDouble(cobro);
                             deuda=Double.parseDouble(campocobro.getText());
                            
                            if(Double.parseDouble(cobro)!=0.0){
                            if((deu-deuda)>=0){
                               
                                total2=deu-deuda;
                            
                            ManejoCobrooo mc=new ManejoCobrooo();
                            String Nlinea=(id+";"+dia+";"+mes+";"+anio+";"+cod+";"+concepto+";"+total2+";"+estado);
                            mc.ModificarDatos(Nlinea,campoid.getText());
                            }
                             
                            } 
                           
                            
                        }
                        
                        
                    } // fin try
                    catch (Exception  e1)
                    {
                       JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                       
                    }
                }while (s.hasNextLine() ); // fin while
        

            s.close();
            
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }
        File FNuevo= new File("Cobros2.txt");
       if(FNuevo.exists()){
           File FAntiguo= new File("Cobros.txt");
        FAntiguo.delete();
        FNuevo.renameTo(FAntiguo);}
      //////
        
        //

        try {
            File f=new File("Cobros.txt");
            
           
            s = new Scanner(f);
                
               do {
                    String linea = s.nextLine();

                    Scanner sl = new Scanner(linea);

                    sl.useDelimiter("\\s*;\\s*");
                    try {
                        String id=sl.next();
                        String dia=sl.next();
                        String mes=sl.next();
                        String anio=sl.next();
                        String codi=sl.next();
                        String concepto=sl.next();
                        String cobro=sl.next();
                        String estado=sl.next();
                       
                            if(Double.parseDouble(cobro)==0.0){
                            ManejoCobrooo mc=new ManejoCobrooo();
                            String Nlinea=(id+";"+dia+";"+mes+";"+anio+";"+codi+";"+concepto+";"+cobro+";"+"true");
                            mc.ModificarDatos(Nlinea,campoid.getText());
                              
                            }
                        
                        
                    } // fin try
                    catch (Exception  e1)
                    {
                       JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                       
                    }
                }while (s.hasNextLine() ); // fin while
        

            s.close();
            
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }  
        File fnuevo= new File("Cobros2.txt");
       if(fnuevo.exists()){
           File fantiguo= new File("Cobros.txt");
        fantiguo.delete();
        fnuevo.renameTo(fantiguo);}
       
       
       int codd;
        boolean encontra=false;
       

        codd=Integer.parseInt(campoidcuota.getText());

        Scanner z;
        try {
            File c=new File("Clientes.txt");
            
           
            z = new Scanner(c);
                
               do {
                    String lineaa = z.nextLine();

                    Scanner sp = new Scanner(lineaa);

                    sp.useDelimiter("\\s*;\\s*");
                    try {
                        int id=Integer.parseInt(sp.next());
 
                        if(codd==id)
                        {
                            
                          String nombre=sp.next();
                        String pat=sp.next();
                        String mat=sp.next();
                        String dir=sp.next();
                        String dia=sp.next();
                        String mes=sp.next();
                        String anio=sp.next();
                        String tel=sp.next();
                        String cel=sp.next();
                        String fecha=sp.next();
                        String stat=sp.next();
                        String tipo=sp.next();
                        String correo=sp.next();
                        double balan=Double.parseDouble(sp.next());
                        double cuota=Double.parseDouble(sp.next());  
                        double valorcuota=balan-deuda;
                        ManejoClientes m=new ManejoClientes();
                        String nueval=(id+"; "+nombre+"; "+pat+"; "+mat+"; "+dir+"; "+dia+"; "+mes+"; "+anio+"; "+tel+"; "
                                +cel+"; "+fecha+"; "+stat+"; "+tipo+"; "+correo+"; "+valorcuota+"; "+cuota);
                        m.ModificarDatos(nueval,String.valueOf(id));
                           
                            
                            
                        }
                        
                        
                    } // fin try
                    catch (Exception  e1)
                    {
                       JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e1);
                       
                    }
                }while (z.hasNextLine() ); // fin while
        

            z.close();
            
        } // fin try
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al leer Archivo " + e);
        }
      
         File FNuevoooo= new File("Clientes2.txt");
       if(FNuevoooo.exists()){
           File FAntiguooo= new File("Clientes.txt");
        FAntiguooo.delete();
        FNuevoooo.renameTo(FAntiguooo);}
       
    }//GEN-LAST:event_registrarActionPerformed

    private void campoidcuotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoidcuotaKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_campoidcuotaKeyReleased
public String FechaActual()
        {
            Date Fecha=new Date();
            SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
            return formato.format(Fecha);
        }
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
            java.util.logging.Logger.getLogger(FrameCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCuota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCuota().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLEAR;
    private javax.swing.JLabel HOME;
    private javax.swing.JLabel SAVE;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel apellidoentrenador;
    private javax.swing.JButton botonbuscar;
    private javax.swing.JTextField campocobro;
    private javax.swing.JTextField campocorreo;
    private javax.swing.JTextField campofechacuota;
    private javax.swing.JTextField campoid;
    private javax.swing.JTextField campoidcuota;
    private javax.swing.JLabel correoentrenador;
    private javax.swing.JLabel identrenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton menu;
    private javax.swing.JLabel nombreentrenador;
    private javax.swing.JButton registrar;
    private javax.swing.JLabel telentrenador;
    // End of variables declaration//GEN-END:variables
}
