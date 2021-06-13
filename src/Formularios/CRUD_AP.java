
package Formularios;

import Clases.AccionesSQL;
import Clases.funciones_ap;
import java.util.HashSet;
import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author Bolaines
 */
public class CRUD_AP extends javax.swing.JFrame {

    public CRUD_AP() {
        initComponents();
        setLocationRelativeTo(null);
        funciones_ap.setListar_ap("");
        funciones_ap.setListar_E("");
        
           jPopupMenuEm.add(MenuExtra);
           jPopupMenuAP.add(MenuExtra1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuExtra = new javax.swing.JPanel();
        jbEditarEm = new javax.swing.JButton();
        jPopupMenuEm = new javax.swing.JPopupMenu();
        MenuExtra1 = new javax.swing.JPanel();
        jbEditarAP = new javax.swing.JButton();
        jPopupMenuAP = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabla1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtabla2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarAP = new javax.swing.JButton();
        txtBuscarAP = new javax.swing.JTextField();
        txtBuscarEm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbF5_Em = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbF5_AP = new javax.swing.JButton();

        MenuExtra.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MenuExtraAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jbEditarEm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editarr.png"))); // NOI18N
        jbEditarEm.setToolTipText("EDITAR EMPLEADO");
        jbEditarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarEmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuExtraLayout = new javax.swing.GroupLayout(MenuExtra);
        MenuExtra.setLayout(MenuExtraLayout);
        MenuExtraLayout.setHorizontalGroup(
            MenuExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuExtraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbEditarEm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        MenuExtraLayout.setVerticalGroup(
            MenuExtraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuExtraLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbEditarEm)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MenuExtra1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                MenuExtra1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jbEditarAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editarr.png"))); // NOI18N
        jbEditarAP.setToolTipText("EDITAR AP");
        jbEditarAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarAPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuExtra1Layout = new javax.swing.GroupLayout(MenuExtra1);
        MenuExtra1.setLayout(MenuExtra1Layout);
        MenuExtra1Layout.setHorizontalGroup(
            MenuExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(MenuExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuExtra1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jbEditarAP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MenuExtra1Layout.setVerticalGroup(
            MenuExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(MenuExtra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MenuExtra1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jbEditarAP, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jtabla1.setAutoCreateRowSorter(true);
        jtabla1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jtabla1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtabla1.setForeground(new java.awt.Color(0, 153, 153));
        jtabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº AP", "CARNET", "FECHA DE REG", "TIPO DE AP", "SANCION", "FECHA DE INICIO", "FECHA DE CIERRE", "COMENTARIOS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabla1.setComponentPopupMenu(jPopupMenuAP);
        jtabla1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabla1.setFocusable(false);
        jtabla1.setGridColor(new java.awt.Color(204, 204, 204));
        jtabla1.setRowHeight(25);
        jtabla1.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jtabla1.setShowHorizontalLines(false);
        jtabla1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtabla1);

        jtabla2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        jtabla2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jtabla2.setForeground(new java.awt.Color(0, 153, 153));
        jtabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CARNET", "NOMBRES", "APELLIDOS", "CARGO", "DEPARTAMENTO", "JEFE INMED.", "LINEA DE NEG."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtabla2.setComponentPopupMenu(jPopupMenuEm);
        jtabla2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabla2.setFocusable(false);
        jtabla2.setGridColor(new java.awt.Color(204, 204, 204));
        jtabla2.setRowHeight(25);
        jtabla2.setSelectionBackground(new java.awt.Color(102, 102, 255));
        jtabla2.setShowHorizontalLines(false);
        jtabla2.getTableHeader().setReorderingAllowed(false);
        jtabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabla2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtabla2);
        jtabla2.getAccessibleContext().setAccessibleParent(jbEditarAP);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("REGISTROS DE EMPLEADOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("REGISTROS DE ACCIONES DE PERSONAL");

        btnRegistrarAP.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarAP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistrarAP.setForeground(new java.awt.Color(153, 0, 0));
        btnRegistrarAP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nueva.JPG"))); // NOI18N
        btnRegistrarAP.setToolTipText("CREAR NUEVO REG");
        btnRegistrarAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAPActionPerformed(evt);
            }
        });

        txtBuscarAP.setToolTipText("BUSCAR AP");
        txtBuscarAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarAPActionPerformed(evt);
            }
        });
        txtBuscarAP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarAPKeyTyped(evt);
            }
        });

        txtBuscarEm.setToolTipText("BUSCAR EMPLEADO");
        txtBuscarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarEmActionPerformed(evt);
            }
        });
        txtBuscarEm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEmKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarEmKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-.png"))); // NOI18N

        jbF5_Em.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refrescar2.JPG"))); // NOI18N
        jbF5_Em.setToolTipText("ACTUALIZAR");
        jbF5_Em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbF5_EmActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar.JPG"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbF5_AP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refrescar2.JPG"))); // NOI18N
        jbF5_AP.setToolTipText("ACTUALIZAR");
        jbF5_AP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbF5_APActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(472, 472, 472)
                                .addComponent(btnRegistrarAP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbF5_Em, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtBuscarEm, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbF5_AP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarAP, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarEm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbF5_Em, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 259, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscarAP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbF5_AP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnRegistrarAP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAPActionPerformed

        registroAp f = new registroAp();
        f.setVisible(true);

    }//GEN-LAST:event_btnRegistrarAPActionPerformed

    private void txtBuscarAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarAPActionPerformed

    }//GEN-LAST:event_txtBuscarAPActionPerformed

    private void txtBuscarAPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAPKeyReleased

        funciones_ap.setListar_ap(this.txtBuscarAP.getText());
    }//GEN-LAST:event_txtBuscarAPKeyReleased

    private void txtBuscarAPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAPKeyTyped

    }//GEN-LAST:event_txtBuscarAPKeyTyped

    private void txtBuscarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarEmActionPerformed
        funciones_ap.setListar_E(this.txtBuscarEm.getText());
    }//GEN-LAST:event_txtBuscarEmActionPerformed

    private void txtBuscarEmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEmKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarEmKeyReleased

    private void txtBuscarEmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarEmKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbF5_EmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbF5_EmActionPerformed
        funciones_ap.setListar_E("")
        ;
    }//GEN-LAST:event_jbF5_EmActionPerformed

    private void jbF5_APActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbF5_APActionPerformed
        funciones_ap.setListar_ap("");
    }//GEN-LAST:event_jbF5_APActionPerformed

    private void MenuExtraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MenuExtraAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuExtraAncestorAdded

    private void jbEditarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarEmActionPerformed

        int fila1 = jtabla2.getSelectedRow();

        EditarReg f = new EditarReg();

        f.txtCarnet.setText(jtabla2.getValueAt(fila1, 1).toString());
        f.txtNombres.setText(jtabla2.getValueAt(fila1, 2).toString());
        f.txtApellidos.setText(jtabla2.getValueAt(fila1, 3).toString());
        f.txtCargo.setText(jtabla2.getValueAt(fila1, 4).toString());
        f.txtDpto.setText(jtabla2.getValueAt(fila1, 5).toString());
        f.txtJefe.setText(jtabla2.getValueAt(fila1, 6).toString());
        f.txtLinea.setText(jtabla2.getValueAt(fila1, 7).toString());
        f.lblUsr.setText(jtabla2.getValueAt(fila1, 0).toString());
        f.setVisible(true);
        //f.txtcargo.setSelectedItem(jtabla1.getValueAt(fila1, 4).toString());
        //f.txtSeccion.setText(jtabla1.getValueAt(fila1, 6).toString());
        
        
       
         f.jFecha.setEnabled(false);
         f.cbxNivel.setEnabled(false);
         f.cbxSansion.setEnabled(false);
         f.jFechaIn.setEnabled(false);
         f.jFechaCie.setEnabled(false);
         f.txtComentarios.setEnabled(false);

    }//GEN-LAST:event_jbEditarEmActionPerformed

    private void jtabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabla2MouseClicked
 
    }//GEN-LAST:event_jtabla2MouseClicked

    private void MenuExtra1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_MenuExtra1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuExtra1AncestorAdded

    private void jbEditarAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarAPActionPerformed
    
        int fila2 = jtabla1.getSelectedRow();

        EditarReg f = new EditarReg();
        
         f.txtCarnet.setText(jtabla2.getValueAt(fila2, 1).toString());
         f.jFecha.setDateFormatString(jtabla2.getValueAt(fila2, 2).toString());
         f.cbxNivel.setSelectedItem(jtabla2.getValueAt(fila2, 3).toString());
         f.cbxSansion.setSelectedItem(jtabla2.getValueAt(fila2, 4).toString());
         f.jFechaIn.setDateFormatString(jtabla2.getValueAt(fila2, 5).toString());
         f.jFechaCie.setDateFormatString(jtabla2.getValueAt(fila2, 6).toString());
         f.txtComentarios.setText(jtabla2.getValueAt(fila2, 7).toString());
         f.lblAP.setText(jtabla2.getValueAt(fila2, 0).toString());
         f.setVisible(true);
         
         
         
       
     f.txtNombres.setEnabled(false); 
     f.txtApellidos.setEnabled(false); 
     f.txtApellidos.setEnabled(false); 
     f.txtCarnet.setEnabled(false); 
     f.txtJefe.setEnabled(false); 
     f.txtDpto.setEnabled(false); 
     f.txtLinea.setEnabled(false); 
     f.txtCargo.setEnabled(false); 
   
        
    }//GEN-LAST:event_jbEditarAPActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD_AP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuExtra;
    private javax.swing.JPanel MenuExtra1;
    private javax.swing.JButton btnRegistrarAP;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuAP;
    private javax.swing.JPopupMenu jPopupMenuEm;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbEditarAP;
    private javax.swing.JButton jbEditarEm;
    private javax.swing.JButton jbF5_AP;
    private javax.swing.JButton jbF5_Em;
    public static javax.swing.JTable jtabla1;
    public static javax.swing.JTable jtabla2;
    private javax.swing.JTextField txtBuscarAP;
    private javax.swing.JTextField txtBuscarEm;
    // End of variables declaration//GEN-END:variables
}
