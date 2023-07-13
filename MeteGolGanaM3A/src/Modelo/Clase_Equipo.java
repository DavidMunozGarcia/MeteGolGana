package Modelo;

import java.sql.Date;

public class Clase_Equipo{
  private int cod_equipo;  
  private String nombre_equi;  
  private Date anio_fundacion;  
  private String ciudad;  
  private int estado_elim;  

    public Clase_Equipo() {
    }

    public Clase_Equipo(int cod_equipo, String nombre_equi, Date anio_fundacion, String ciudad, int estado_elim) {
        this.cod_equipo = cod_equipo;
        this.nombre_equi = nombre_equi;
        this.anio_fundacion = anio_fundacion;
        this.ciudad = ciudad;
        this.estado_elim = estado_elim;
    }

    public int getCod_equipo() {
        return cod_equipo;
    }

    public void setCod_equipo(int cod_equipo) {
        this.cod_equipo = cod_equipo;
    }

    public String getNombre_equi() {
        return nombre_equi;
    }

    public void setNombre_equi(String nombre_equi) {
        this.nombre_equi = nombre_equi;
    }

    public Date getAnio_fundacion() {
        return anio_fundacion;
    }

    public void setAnio_fundacion(Date anio_fundacion) {
        this.anio_fundacion = anio_fundacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEstado_elim() {
        return estado_elim;
    }

    public void setEstado_elim(int estado_elim) {
        this.estado_elim = estado_elim;
    }
  
}
