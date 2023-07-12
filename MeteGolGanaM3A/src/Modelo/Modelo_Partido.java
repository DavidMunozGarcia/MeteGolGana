/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.ConexionMySql;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Modelo_Partido extends Clase_Partido {

    ConexionMySql CPG = new ConexionMySql();

    public Modelo_Partido() {

    }

    public List<Clase_Partido> listarPartidos() {
        List<Clase_Partido> listaPartidos = new ArrayList<Clase_Partido>();

        try {
            String sql = "select * from partido";
            ResultSet rs = CPG.Consultas(sql);
            while (rs.next()) {
                Clase_Partido partido = new Clase_Partido();
                partido.setCod_partido(rs.getInt("cod_partido"));
                partido.setCod_campeonato(rs.getInt("cod_campeonato"));
                partido.setCod_equipo1(rs.getInt("cod_equipo1"));
                partido.setCod_equipo2(rs.getInt("cod_equipo2"));
                partido.setCod_estadio(rs.getInt("cod_estadio"));

                listaPartidos.add(partido);

            }
            rs.close();//CIERRO CONEXION
            return listaPartidos;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Partido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean InsertarPartido() {
        String sql;
        sql = "INSERT INTO partido(cod_partido,cod_campeonato,cod_equipo1,cod_equipo2,cod_estadio,estado_elim)";
        sql += "VALUES('" + getCod_partido() + "','" + getCod_campeonato() + "','" + getCod_equipo1() + "','" + getCod_equipo2() + "','" + getCod_estadio() + "','" + getEstado() + "')";
        return CPG.CRUD(sql);

    }

    public boolean ModificarPartido() {
        String sql;
        sql = "update partido set cod_partido='" + getCod_partido() + "' ,cod_campeonato='" + getCod_campeonato() + "',cod_equipo1='" + getCod_equipo1() + "',cod_equipo2='" + getCod_equipo2() + "',cod_estadio='" + getCod_estadio() + "'where cod_partido='" + getCod_partido() + "';";
        return CPG.CRUD(sql);

    }

    public boolean EliminarPartido() {
        String sql;
        sql = "delete from partido where cod_partido='" + getCod_partido() + "';";
        return CPG.CRUD(sql);

    }

}
