
package Clases;
import java.sql.Date;
/**
 *
 * @author Bolaines
 */
public class AccionesSQL {

    private String fecha;
    private String dpto;
    private String nombres;
    private String apellidos;
    private String carnet;
    private String lineaNegocio;
    private String jefe;
    private String cargo;
    private String fechaInicio;
    private String fechacierre;
    private String tipoAP;
    private String sancion;
    private String comentario;
    private String idAP;
    private String idEmp;

    public AccionesSQL(String fecha, String dpto, String nombres, String apellidos, String carnet, String lineaNegocio, String jefe, String cargo, String fechaInicio, String fechacierre, String tipoAP, String sancion, String comentario, String idAP, String idEmp) {
        this.fecha = fecha;
        this.dpto = dpto;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carnet = carnet;
        this.lineaNegocio = lineaNegocio;
        this.jefe = jefe;
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.fechacierre = fechacierre;
        this.tipoAP = tipoAP;
        this.sancion = sancion;
        this.comentario = comentario;
        this.idAP = idAP;
        this.idEmp = idEmp;
    }
    
    
    // SENTENCIAS PARA REGISTRO DE APs 
    
        
    public static String listar_ap  =  "SELECT * FROM accion_personal";
    
    public static String registrar_ap = "INSERT INTO accion_personal("
           + "carnet_empleado,"
           + "fecha,"
           + "tipo_de_accp,"
           + "sancion,"
           + "fecha_inicio,"
           + "fecha_cierre,"
           + "comentarios)"
           + "VALUES(?,?,?,?,?,?,?)";
    
    public static String actualizar_ap = "UPDATE accion_personal SET "
          + "carnet_empleado = ?,"
           + "fecha = ?,"
           + "tipo_de_accp = ?,"
           + "sancion = ?,"
           + "fecha_inicio = ?,"
           + "fecha_cierre = ?,"            
           + "comentarios = ?"
           + "WHERE accp_id = ?";
   
    public static String eliminar_ap = "DELETE FROM accion_personal WHERE accp_id = ? ";
    
    public static String eliminar_todo_ap = "TRUNCATE TABLE accion_personal";
    
    
    // SENTENCIAS PARA REGISTRO DE EMPLEADOS
    
    public static String listar_E =  "SELECT * FROM empleado";
    
    public static String registrar_E = "INSERT INTO empleado("
           + "carnet_empleado,"
           + "nombres,"
           + "apellidos,"
           + "cargo,"
           + "departamento,"
           + "jefe_inmediato,"
           + "linea_negocios)"
           + "VALUES(?,?,?,?,?,?,?)";
    
    public static String actualizar_E = "UPDATE empleado SET "
          + "carnet_empleado = ?,"
           + "nombres = ?,"
           + "apellidos = ?,"
           + "cargo = ?,"
           + "departamento = ?,"
           + "jefe_inmediato = ?,"            
           + "linea_negocios = ?"
           + "WHERE id_empleado = ?";
    
    public static String eliminar_E = "DELETE FROM empleado WHERE id_empleado = ? ";
    
    public static String eliminar_todo_E = "TRUNCATE TABLE empleado";

    public AccionesSQL() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getLineaNegocio() {
        return lineaNegocio;
    }

    public void setLineaNegocio(String lineaNegocio) {
        this.lineaNegocio = lineaNegocio;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(String fechacierre) {
        this.fechacierre = fechacierre;
    }

    public String getTipoAP() {
        return tipoAP;
    }

    public void setTipoAP(String tipoAP) {
        this.tipoAP = tipoAP;
    }

    public String getSancion() {
        return sancion;
    }

    public void setSancion(String sancion) {
        this.sancion = sancion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public String getIdAP() {
        return idAP;
    }

    public void setIdAP(String idAP) {
        this.idAP = idAP;
    }

    public String getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
    }
    
    
    
} //cierre de la clase
