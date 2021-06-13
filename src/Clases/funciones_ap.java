
package Clases;

import Formularios.CRUD_AP;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bolaines
 */
public class funciones_ap {
    
    private static conexion.Conexion con = new Conexion();
    private static Connection conexion = con.conexion();
    private static PreparedStatement ps = null;
    
    
    public static boolean isRegister_ap( AccionesSQL s){
       String sql = AccionesSQL.registrar_ap;
      
       try {
           ps = conexion.prepareStatement(sql);
           ps.setString(1, s.getCarnet());
           ps.setString(2, s.getFecha());
           ps.setString(3, s.getTipoAP());
           ps.setString(4, s.getSancion());
           ps.setString(5, s.getFechaInicio());
           ps.setString(6, s.getFechacierre());
           ps.setString(7, s.getComentario());
           ps.executeUpdate();
           return true;           
           
       } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
            
       }
    }//CIERRE
    
    public static boolean isUpdate_ap ( AccionesSQL s){
       String sql = AccionesSQL.actualizar_ap;
   
       try {
           ps = conexion.prepareStatement(sql);
           ps.setString(1, s.getCarnet());
           ps.setString(2, s.getFecha());
           ps.setString(3, s.getTipoAP());
           ps.setString(4, s.getSancion());
           ps.setString(5, s.getFechaInicio());
           ps.setString(6, s.getFechacierre());
           ps.setString(7, s.getComentario());
           ps.setString(8, s.getIdAP());
           ps.executeUpdate();
           return true;           
           
       } catch (SQLException ex) {
            
            return false;
            
       }
    }// cierre
    
    public static boolean isDelete_ap( AccionesSQL s){
       String sql = AccionesSQL.eliminar_ap;
   
       try {
           ps = conexion.prepareStatement(sql);
           ps.setString(1, s.getIdAP());
           ps.executeUpdate();
           return true;           
           
       } catch (SQLException ex) {
            //Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
            return false;
            
       }
    }// cierre
    
    
    public static void setListar_ap (String buscar){ 
         DefaultTableModel modelo = (DefaultTableModel)CRUD_AP.jtabla1.getModel();
                  
         while(modelo.getRowCount() > 0){
             modelo.removeRow(0);
             
         }
         String sql = "";
         
         if(buscar.equals("")){
             sql = AccionesSQL.listar_ap;
          
         }else{
             sql = "SELECT * FROM accion_personal WHERE ("
                    + "carnet_empleado LIKE '"+buscar+"%' OR "
                    + "fecha LIKE '"+buscar+"%' OR "
                    + "tipo_de_accp LIKE '"+buscar+"%' OR "
                    + "sancion LIKE '"+buscar+"%' OR "
                    + "fecha_inicio LIKE '"+buscar+"%' OR "
                    + "fecha_cierre LIKE '"+buscar+"%' OR "                     
                    + "comentarios LIKE '"+buscar+"%' "
                     +")";
                                                
         }
                                       
         String datos [] = new String[8];
         
         try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
             
           while (rs.next()) {
               datos[0] = rs.getString("accp_id");
               datos[1] = rs.getString("carnet_empleado");
               datos[2] = rs.getString("fecha");
               datos[3] = rs.getString("tipo_de_accp");   
               datos[4] = rs.getString("sancion");
               datos[5] = rs.getString("fecha_inicio");
               datos[6] = rs.getString("fecha_cierre");
               datos[7] = rs.getString("comentarios");
               
               modelo.addRow(datos);
                                    
             }  //cierre while
                 
         } catch (SQLException ex) {
             System.err.println(ex.getMessage());
             
         }
         
     }//cierre buscar    
    
    public static String estraerIDMAX_ap(){
        
        String sql = "SELECT MAX(accp_id) FROM accion_personal";
        int id = 0;
        
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                id = rs.getInt(1);
            
            }if (id == 0) {
                id = 1;
                
            }else { 
                id = id + 1;
            }
            
            return String.valueOf(id);
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
        
        
    } //cierre
      
      
      
   ///////////////////////////////////////////////////////////////////////////////////
   /////////////////////////// METODOS DE EMPLEADO ///////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////
    
    public static boolean isRegister_E( AccionesSQL s){
       String sql = AccionesSQL.registrar_E;
      
       try {
           ps = conexion.prepareStatement(sql);
           ps.setString(1, s.getCarnet());
           ps.setString(2, s.getNombres());
           ps.setString(3, s.getApellidos());
           ps.setString(4, s.getCargo());
           ps.setString(5, s.getDpto());
           ps.setString(6, s.getJefe());
           ps.setString(7, s.getLineaNegocio());
           ps.executeUpdate();
           return true;           
           
       } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return false;
            
       }
    }//CIERRE
    
    public static boolean isUpdate_E ( AccionesSQL s){
       String sql = AccionesSQL.actualizar_E;
   
       try {
           ps = conexion.prepareStatement(sql);
           ps.setString(1, s.getCarnet());
           ps.setString(2, s.getNombres());
           ps.setString(3, s.getApellidos());
           ps.setString(4, s.getCargo());
           ps.setString(5, s.getDpto());
           ps.setString(6, s.getJefe());
           ps.setString(7, s.getLineaNegocio());
           ps.setString(8, s.getIdEmp());
           ps.executeUpdate();
           return true;           
           
       } catch (SQLException ex) {
             System.err.println(ex.getMessage());
            return false;
            
       }
    }// cierre
    
    public static boolean isDelete_E( AccionesSQL s){
       String sql = AccionesSQL.eliminar_E;
   
       try {
           ps = conexion.prepareStatement(sql);
           ps.setString(1, s.getIdEmp());
           ps.executeUpdate();
           return true;           
           
       } catch (SQLException ex) {
             System.err.println(ex.getMessage());
            return false;
            
       }
    }// cierre
    
    
    
    public static void setListar_E (String buscar){ 
         DefaultTableModel modelo = (DefaultTableModel)CRUD_AP.jtabla2.getModel();
                  
         while(modelo.getRowCount() > 0){
             modelo.removeRow(0);
             
         }
         String sql = "";
         
         if(buscar.equals("")){
             sql = AccionesSQL.listar_E;
          
         }else{
             sql = "SELECT * FROM empleado WHERE ("
                    + "carnet_empleado LIKE '"+buscar+"%' OR "
                    + "nombres LIKE '"+buscar+"%' OR "
                    + "apellidos LIKE '"+buscar+"%' OR "
                    + "cargo LIKE '"+buscar+"%' OR "
                    + "departamento LIKE '"+buscar+"%' OR "
                    + "jefe_inmediato LIKE '"+buscar+"%' OR " 
                    + "linea_negocios LIKE '"+buscar+"%' "
                     +")";
                                                
         }
                                       
         String datos [] = new String[8];
         
         try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
             
           while (rs.next()) {
               datos[0] = rs.getString("id_empleado");
               datos[1] = rs.getString("carnet_empleado");
               datos[2] = rs.getString("nombres");
               datos[3] = rs.getString("apellidos");   
               datos[4] = rs.getString("cargo");
               datos[5] = rs.getString("departamento");
               datos[6] = rs.getString("jefe_inmediato");
               datos[7] = rs.getString("linea_negocios");
               
               modelo.addRow(datos);
                                    
             }  //cierre while
                 
         } catch (SQLException ex) {
             System.err.println(ex.getMessage());
             
         }
         
     }//cierre buscar
    
     public static String estraerIDMAX_E(){
        
        String sql = "SELECT MAX(id_empleado) FROM empleado";
        int id = 0;
        
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                id = rs.getInt(1);
            
            }if (id == 0) {
                id = 1;
                
            }else { 
                id = id + 1;
            }
            
            return String.valueOf(id);
            
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
        
        
    } //cierre
    
} // final de la clase funciones_ap
