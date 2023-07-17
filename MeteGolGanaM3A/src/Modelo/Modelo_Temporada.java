/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMySql;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tatip
 */
public class Modelo_Temporada extends Clase_Temporada {
    
      Conexion.ConexionMySql con = new ConexionMySql();
    
     public boolean InsertarTemporada() {

        String sql = "INSERT INTO temporada(fecha_inicio, fecha_fin, codigo_campeonato) "
                + "VALUES ('" + getFechaIni()+ "','" + getFechaFin()+ "'," + getCodCampeonatoFk() + ");";

        return con.CRUD(sql);
    }

    public boolean ModificarTemporada() {

        String sql = "UPDATE temporada SET fecha_inicio='" + getFechaIni()+ "',fecha_fin=" + getFechaFin()+ ",codigo_campeonato=" + getCodCampeonatoFk() + " "
                + "WHERE codigo=" + getCodigoPk()+ ";";

        return con.CRUD(sql);
    }

    public boolean OcultarTemporada() {

        String sql = "UPDATE temporada SET estado_elim = true "
                + "WHERE `codigo`=" + getCodigoPk()+ ";";

        return con.CRUD(sql);
    }

    public List<Clase_Jugador> ListaTemporada() {

        try {

            String sql = "SELECT * "
                    + "FROM jugador j, persona p "
                    + "WHERE p.cedula = j.cedula_personafk "
                    + "ORDER BY j.codigo";
            ResultSet res = con.Consultas(sql);
            List<Clase_Jugador> jug = new ArrayList<>();
            byte[] bytea;

            while (res.next()) {

                Clase_Jugador mijugador = new Clase_Jugador();

                //jugador
                mijugador.setCod_equipo(res.getInt("cod_equipofk"));
                mijugador.setCod_jugador(res.getInt("codigo"));
                mijugador.setCedula_persona(res.getString("cedula_personafk"));
                mijugador.setSueldo(res.getDouble("sueldo"));
                mijugador.setPosicion(res.getString("posicion"));
                mijugador.setFecha_finContrato(res.getDate("fecha_fin_contrato"));
                mijugador.setFecha_inicioContrato(res.getDate("fecha_inicio_contrato"));
                mijugador.setAnios_exp(res.getInt("anios_exp"));

                jug.add(mijugador);
            }

            res.close();
            return jug;

        } catch (SQLException ex) {

            Logger.getLogger(Modelo_Temporada.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

    public List<Clase_Jugador> BuscarJugador(String aux) {

        try {

            String sql = "SELECT * "
                    + "FROM jugador j, persona p "
                    + "WHERE p.cedula = j.cedula_personafk "
                    + "AND (j.cedula_personafk LIKE '%" + aux + "%' OR CONCAT(p.nombre1, ' ', p.apellido1) LIKE '%" + aux + "%') "
                    + "ORDER BY j.codigo";
            ResultSet res = con.Consultas(sql);
            List<Clase_Jugador> jug = new ArrayList<>();
            byte[] bytea;

            while (res.next()) {

                Clase_Jugador mijugador = new Clase_Jugador();

                //jugador
                mijugador.setCod_equipo(res.getInt("cod_equipofk"));
                mijugador.setCod_jugador(res.getInt("codigo"));
                mijugador.setCedula_persona(res.getString("cedula_personafk"));
                mijugador.setSueldo(res.getDouble("sueldo"));
                mijugador.setPosicion(res.getString("posicion"));

                //persona
                mijugador.setApellido1(res.getString("apellido1"));
                mijugador.setApellido2(res.getString("apellido2"));
                mijugador.setCedula(res.getString("cedula"));
                mijugador.setDireccion(res.getString("direccion"));
                mijugador.setEmail(res.getString("email"));
                mijugador.setFecha_nac(res.getDate("fecha_nac"));
                mijugador.setNombnre1(res.getString("nombre1"));
                mijugador.setNombnre2(res.getString("nombre2"));
                mijugador.setSexo(res.getString("sexo"));
                mijugador.setTelefono(res.getString("telefono"));
                mijugador.setEstado_elim(res.getBoolean("estado_elim"));

                bytea = res.getBytes("foto");

                if (bytea != null) try {

                    mijugador.setFoto(getImage(bytea));

                } catch (IOException ex) {
                    Logger.getLogger(Modelo_Jugador.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                jug.add(mijugador);
            }

            res.close();
            return jug;

        } catch (SQLException ex) {

            Logger.getLogger(Modelo_Jugador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
    }

  
    
}
