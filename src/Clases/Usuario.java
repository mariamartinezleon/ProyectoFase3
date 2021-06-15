package Clases;

import conexion.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import utils.JDBCMySQL;

public class Usuario {

    private Integer usr_id;
    private String tipo_usr;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.usr_id = idUsuario;
    }

    public Usuario(String tipoUsuario, String nombre, String apellido, String usuario, String contrasena) {
        this.tipo_usr = tipoUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Usuario(Integer idUsuario, String tipoUsuario, String nombre, String apellido, String usuario, String contrasena) {
        this.usr_id = idUsuario;
        this.tipo_usr = tipoUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Integer getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Integer usr_id) {
        this.usr_id = usr_id;
    }

    public String getTipo_usr() {
        return tipo_usr;
    }

    public void setTipo_usr(String tipo_usr) {
        this.tipo_usr = tipo_usr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * **********************************************************************
     */
       public boolean save() {
        try {
            Map<String, Object> params = new HashMap<>();
            String query = "insert into usuarios(tipo_usr, nombres, apellidos, usuario, contrasena) values(:tipo_usr, :nombres, :apellidos, :usuario, :contrasena)";
            if (usr_id != null) {
                query = "update usuarios set tipo_usr=:tipo_usr, nombres=:nombres, apellidos=:apellidos, usuario=:usuario, contrasena=:contrasena where usr_id=:usr_id";
                params.put("usr_id", this.usr_id);
            }
           // params.put("usr_id", this.usr_id);
            params.put("tipo_usr", this.tipo_usr);
            params.put("nombres", this.nombre);
            params.put("apellidos", this.apellido);
            params.put("usuario", this.usuario);
            params.put("contrasena", this.contrasena);
            JDBCMySQL msql = new JDBCMySQL();
            return msql.execute(query, params);
        } catch (Exception e) {
            System.err.println("Error al guardar usuarios");
            System.err.println(e.getMessage());
        }
        return false;
    }
    public List<Usuario> list() {
        List<Usuario> list = new ArrayList<>();
        JDBCMySQL mysql = new JDBCMySQL();
        String sql = "SELECT * FROM usuarios";
        ResultSet rs = mysql.query(sql, null);
        try {
            while (rs.next()) {
                list.add(new Usuario(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (Exception e) {
            System.err.println("Error al obtener lista usuarios");
            System.err.println(e.getMessage());
        }
        return list;
    }

   
    public static Usuario find(int id) {
        JDBCMySQL mysql = new JDBCMySQL();
        String sql = "SELECT * FROM usuarios where usr_id = " + id;
        ResultSet rs = mysql.query(sql, null);
        try {
            rs.next();
            return new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
            );
        } catch (Exception e) {
            System.err.println("Error al obtener usuarios");
            System.err.println(e.getMessage());
        }
        return null;
    }
 /*
    public Usuario login(String user, String password) {
        JDBCMySQL mysql = new JDBCMySQL();
        String sql = "SELECT * FROM usuario where usr_id = :usr_id";
        Map<String, Object> params = new HashMap<>();
        params.put("usr_id", user);
        ResultSet rs = mysql.query(sql, params);
        try {
            rs.next();
            this.usr_id = rs.getInt(1);
            this.tipo_usr = rs.getString(2);
            this.nombre = rs.getString(3);
            this.apellido = rs.getString(4);
            this.usuario = rs.getString(5);
            this.contrasena = rs.getString(6);
            if (passworduser.equals(password)) {
                return this;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error al inciar sesion");
        }
        return null;
    } */
    /*
   public static void main(String[] args) {
        Usuario u = new Usuario();
        List<Usuario> listUsr;
        System.out.println("*---------");
        listUsr = (new Usuario()).list();

       for (Usuario s : listUsr) {
           System.out.println(s.usr_id);
           System.out.println(s.tipo_usr);
           System.out.println(s.nombre);
           System.out.println(s.apellido);
           System.out.println(s.usuario);
           System.out.println(s.contrasena);
           System.out.println("****");
       }
        
        u.usr_id = 5;
        u.tipo_usr = "hr";
        u.nombre ="Marco";
        u.apellido ="Fontaner";
        u.usuario = "fon";
        u.contrasena = "rr";
        
        u.save();
        
        System.out.println("----------*");

    }*/

}
