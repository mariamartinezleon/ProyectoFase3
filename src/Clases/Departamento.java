package Clases;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import utils.JDBCMySQL;


public class Departamento {
   private Integer dpto_id;
   private String nombre_dpto;

    public Departamento() {
    }

    public Departamento(Integer dpto_id, String nombre_dpto) {
        this.dpto_id = dpto_id;
        this.nombre_dpto = nombre_dpto;
    }

    public Integer getDpto_id() {
        return dpto_id;
    }

    public void setDpto_id(Integer dpto_id) {
        this.dpto_id = dpto_id;
    }

    public String getNombre_dpto() {
        return nombre_dpto;
    }

    public void setNombre_dpto(String nombre_dpto) {
        this.nombre_dpto = nombre_dpto;
    }

    public boolean save() {
        try {
            Map<String, Object> params = new HashMap<>();
            String query = "insert into departamento(nombre_dpto) values( :nombre_dpto)";
            if (dpto_id!= null) {
                query = "update departamento set  nombre_dpto=:nombre_dpto where dpto_id=:dpto_id";
                params.put("dpto_id", this.dpto_id);
            }
            params.put("nombre_dpto", this.nombre_dpto);;
            JDBCMySQL msql = new JDBCMySQL();
            return msql.execute(query, params);
        } catch (Exception e) {
            System.err.println("Error al guardar departamento");
            System.err.println(e.getMessage());
        }
        return false;
    }
    public List<Departamento> list() {
        List<Departamento> list = new ArrayList<>();
        JDBCMySQL mysql = new JDBCMySQL();
        String sql = "SELECT * FROM departamento";
        ResultSet rs = mysql.query(sql, null);
        try {
            while (rs.next()) {
                list.add(new Departamento(
                        rs.getInt(1),
                        rs.getString(2)
                ));
            }
        } catch (Exception e) {
            System.err.println("Error al obtener lista departamento");
            System.err.println(e.getMessage());
        }
        return list;
    }
}
