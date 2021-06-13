
package Formularios;

import Clases.AccionesSQL;
import Clases.funciones_ap;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.Calendar;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class registroAp extends javax.swing.JFrame {

    
 //ArrayList<String> lista2 = new ArrayList<String>();
 
      
    public registroAp() {
        initComponents();
        
        setLocationRelativeTo(null);
        this.lblUsr.setText(funciones_ap.estraerIDMAX_E());
        this.lblAP.setText(funciones_ap.estraerIDMAX_ap());
        //funciones_ap.setListar_ap("");
     
                    
        
        
    }
    
    /* public void carnet(){
        if((Integer.parseInt (lblUsr.getText()))>9){
        txtCarnet.setText("DOC"+lblUsr.getText());}
        else if((Integer.parseInt (lblUsr.getText()))==0){
        txtCarnet.setText("DOC01");
        }else{
        txtCarnet.setText("DOC0"+lblUsr.getText());
        } 

}*/

    
    private void limpiarcajas (){
        
        
        this.jFecha.setDateFormatString("");
        this.txtNombres.setText("");
        this.txtApellidos.setText("");
        this.txtCarnet.setText("");
        this.txtDpto.setText("");
        this.txtLinea.setText("");
        this.txtCargo.setText("");
        this.jFechaIn.setDateFormatString("");
        this.jFechaCie.setDateFormatString("");
     
        this.lblUsr.setText(funciones_ap.estraerIDMAX_E());
        this.lblAP.setText(funciones_ap.estraerIDMAX_ap());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        Carnet = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        txtNombres = new JTextField();
        txtApellidos = new JTextField();
        btnSalir = new JButton();
        btnRegistrarEmpleado = new JButton();
        btnLimpiar = new JButton();
        cbxNivel = new JComboBox<>();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        txtCargo = new JTextField();
        txtDpto = new JTextField();
        txtLinea = new JTextField();
        txtJefe = new JTextField();
        jLabel11 = new JLabel();
        jFecha = new JDateChooser();
        txtComentarios = new JTextField();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        txtCarnet = new JTextField();
        jFechaCie = new JDateChooser();
        jFechaIn = new JDateChooser();
        jLabel14 = new JLabel();
        cbxSansion = new JComboBox<>();
        lblAP = new JLabel();
        lblUsr = new JLabel();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        jLabel15 = new JLabel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setForeground(new Color(0, 153, 153));

        Carnet.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        Carnet.setText("Departamento/Cuenta");

        jLabel3.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Linea de negocio");

        jLabel4.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jefe inmediato");

        jLabel5.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new Color(0, 102, 204));
        jLabel5.setText("REFERENCIAS");

        jLabel6.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Tipo de Accion de Personal");

        txtNombres.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new Color(255, 255, 255));
        btnSalir.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setForeground(new Color(204, 0, 0));
        btnSalir.setIcon(new ImageIcon(getClass().getResource("/Imagenes/cerrar.JPG"))); // NOI18N
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistrarEmpleado.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrarEmpleado.setForeground(new Color(153, 0, 0));
        btnRegistrarEmpleado.setIcon(new ImageIcon(getClass().getResource("/Imagenes/guardarR.png"))); // NOI18N
        btnRegistrarEmpleado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setForeground(new Color(153, 0, 0));
        btnLimpiar.setIcon(new ImageIcon(getClass().getResource("/Imagenes/limpiar.JPG"))); // NOI18N
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        cbxNivel.setModel(new DefaultComboBoxModel<>(new String[] { "Falta leve", "Falta grave", "Falta muy grave" }));
        cbxNivel.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                cbxNivelItemStateChanged(evt);
            }
        });
        cbxNivel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cbxNivelMouseClicked(evt);
            }
            public void mouseExited(MouseEvent evt) {
                cbxNivelMouseExited(evt);
            }
        });
        cbxNivel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cbxNivelActionPerformed(evt);
            }
        });

        jLabel7.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Nombres");

        jLabel8.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Apellidos");

        jLabel9.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("ID Empleado");

        jLabel10.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Cargo");

        txtDpto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtDptoActionPerformed(evt);
            }
        });

        txtLinea.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtLineaActionPerformed(evt);
            }
        });

        txtJefe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtJefeActionPerformed(evt);
            }
        });

        jLabel11.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Fecha");

        jLabel12.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Fecha de Cierre");

        jLabel13.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Fecha de Inicio");

        jFechaCie.setDateFormatString("yyyy-MM-dd");

        jFechaIn.setDateFormatString("yyyy-MM-dd");

        jLabel14.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Tipo de sansiones, amonestasiones");

        cbxSansion.setModel(new DefaultComboBoxModel<>(new String[] { "Amonestacion verbal", "PIP", "Suspención sin goce de sueldo", "Despido con responsabilidad patronal", "Despido sin responsabilidad patronal" }));
        cbxSansion.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                cbxSansionItemStateChanged(evt);
            }
        });
        cbxSansion.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cbxSansionMouseClicked(evt);
            }
            public void mouseExited(MouseEvent evt) {
                cbxSansionMouseExited(evt);
            }
        });
        cbxSansion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cbxSansionActionPerformed(evt);
            }
        });

        lblAP.setText("AP");

        lblUsr.setText("Empleado");

        jLabel2.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new Color(153, 0, 0));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("NUEVA ACCIÓN  DE  PERSONAL");

        jLabel1.setText("AP Nº");

        jLabel15.setText("Empleado Nº");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombres, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidos)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCarnet, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFecha, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFechaIn, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCargo, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtJefe, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLinea, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Carnet, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txtDpto, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrarEmpleado, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel15, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUsr, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblAP)))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtComentarios)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(cbxSansion, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNivel, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jFechaCie, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 323, GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251))))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDpto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(Carnet))
                    .addComponent(jLabel11, GroupLayout.Alignment.LEADING)
                    .addComponent(jFecha, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombres, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJefe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel8))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLinea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCarnet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFechaIn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFechaCie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxSansion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxNivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)))
                .addGap(21, 21, 21)
                .addComponent(txtComentarios, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblUsr)
                        .addComponent(lblAP)
                        .addComponent(jLabel15))
                    .addComponent(btnRegistrarEmpleado))
                .addGap(25, 25, 25))
        );

        btnSalir.getAccessibleContext().setAccessibleDescription("SALIR");
        btnRegistrarEmpleado.getAccessibleContext().setAccessibleDescription("REGISTRAR");
        btnLimpiar.getAccessibleContext().setAccessibleDescription("LIMPIAR");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombresActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void btnRegistrarEmpleadoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
    //this.txtComentarios.setText(lista2.get(cbxSansion.getSelectedIndex()));
       
    if ( txtCarnet.getText().isEmpty()||txtNombres.getText().isEmpty()   
        ||txtApellidos.getText().isEmpty() ||txtApellidos.getText().isEmpty()||cbxNivel.getSelectedItem().equals("Elegir:")||cbxSansion.getSelectedItem().equals("Elegir:")){
            
             JOptionPane.showMessageDialog(this, "FAVOR VALIDAR LOS CAMPOS VACIOS");
             
         
             //cierre if
        } else { 
        
             AccionesSQL se = new AccionesSQL();
            
             //Tabla de Empleado
            se.setIdEmp(this.lblUsr.getText());
            se.setCarnet(this.txtCarnet.getText());
            se.setNombres (this.txtNombres.getText());
            se.setApellidos (this.txtApellidos.getText());            
            se.setCargo(this.txtCargo.getText());
            se.setJefe(this.txtJefe.getText());
            se.setDpto(this.txtDpto.getText());
            se.setLineaNegocio(this.txtLinea.getText());            
           
             
            
            //Tabla de AP 
           /*
            Calendar cal;
            cal = jFecha.getCalendar(); 
            
            int d, m, a;
            d = cal.get(Calendar.DAY_OF_MONTH);
            m = cal.get(Calendar.MONTH);
            a = cal.get(Calendar.YEAR) - 1900;
            //se.setFecha (new Date(a, m, d));
          
            
            cal = jFechaIn.getCalendar(); 
            d = cal.get(Calendar.DAY_OF_MONTH);
            m = cal.get(Calendar.MONTH);
            a = cal.get(Calendar.YEAR) - 1900;
            se.setFechaInicio(new Date(a, m, d));
            
            cal = jFechaCie.getCalendar(); 
            d = cal.get(Calendar.DAY_OF_MONTH);
            m = cal.get(Calendar.MONTH);
            a = cal.get(Calendar.YEAR) - 1900;
            se.setFechacierre (new Date(a, m, d));
            //*/
            
            se.setIdAP(this.lblAP.getText());
            se.setCarnet(this.txtCarnet.getText());
            se.setFecha(this.jFecha.getDate().toString());        
            se.setTipoAP(this.cbxSansion.getSelectedItem().toString());
            se.setSancion(this.cbxNivel.getSelectedItem().toString());
            se.setFechaInicio(this.jFechaIn.getDate().toString());   
            se.setFechacierre(this.jFechaCie.getDate().toString());
            
            se.setComentario(this.txtComentarios.getText());
            if (funciones_ap.isRegister_E(se)){
                funciones_ap.isRegister_ap(se);
                //Funciones_usuarios.setListar_D("");
                //limpiarcajas();
                JOptionPane.showMessageDialog(this, "AP REGISTRADA CON EXITO ");
                
           } else{              
                JOptionPane.showMessageDialog(this, "EL REGISTRO NO HA SIDO ALMACENADO!");
           
       
    }//cierre else
    }    
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnLimpiarActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       
        limpiarcajas();
      
     
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtApellidosActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void cbxNivelMouseExited(MouseEvent evt) {//GEN-FIRST:event_cbxNivelMouseExited
        // TODO add your handling code here:
        //txtIDES.setText(lista2.get(jCEspecialidad.getSelectedIndex()));
    }//GEN-LAST:event_cbxNivelMouseExited

    private void cbxNivelMouseClicked(MouseEvent evt) {//GEN-FIRST:event_cbxNivelMouseClicked
        // TODO add your handling code here:
        //txtIDES.setText(lista2.get(jCEspecialidad.getSelectedIndex()));
    }//GEN-LAST:event_cbxNivelMouseClicked

    private void cbxNivelItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_cbxNivelItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbxNivelItemStateChanged

    private void cbxNivelActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cbxNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNivelActionPerformed

    private void txtDptoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtDptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDptoActionPerformed

    private void txtLineaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtLineaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLineaActionPerformed

    private void txtJefeActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJefeActionPerformed

    private void cbxSansionItemStateChanged(ItemEvent evt) {//GEN-FIRST:event_cbxSansionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSansionItemStateChanged

    private void cbxSansionMouseClicked(MouseEvent evt) {//GEN-FIRST:event_cbxSansionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSansionMouseClicked

    private void cbxSansionMouseExited(MouseEvent evt) {//GEN-FIRST:event_cbxSansionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSansionMouseExited

    private void cbxSansionActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cbxSansionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSansionActionPerformed

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
            java.util.logging.Logger.getLogger(registroAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroAp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroAp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel Carnet;
    private JButton btnLimpiar;
    private JButton btnRegistrarEmpleado;
    private JButton btnSalir;
    private JComboBox<String> cbxNivel;
    private JComboBox<String> cbxSansion;
    private JDateChooser jFecha;
    private JDateChooser jFechaCie;
    private JDateChooser jFechaIn;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    public static JLabel lblAP;
    public static JLabel lblUsr;
    private JTextField txtApellidos;
    private JTextField txtCargo;
    private JTextField txtCarnet;
    private JTextField txtComentarios;
    private JTextField txtDpto;
    private JTextField txtJefe;
    private JTextField txtLinea;
    private JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
