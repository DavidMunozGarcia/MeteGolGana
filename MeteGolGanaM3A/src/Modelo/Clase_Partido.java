/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Clase_Partido {

    private int cod_partido;
    private int cod_equipo1;
    private int cod_equipo2;
    private int cod_campeonato;
    private int cod_estadio;
    private int estado;

    public Clase_Partido() {
    }

    public Clase_Partido(int cod_partido, int cod_equipo1, int cod_equipo2, int cod_campeonato, int cod_estadio, int estado) {
        this.cod_partido = cod_partido;
        this.cod_equipo1 = cod_equipo1;
        this.cod_equipo2 = cod_equipo2;
        this.cod_campeonato = cod_campeonato;
        this.cod_estadio = cod_estadio;
        this.estado = estado;
    }

    public int getCod_partido() {
        return cod_partido;
    }

    public void setCod_partido(int cod_partido) {
        this.cod_partido = cod_partido;
    }

    public int getCod_equipo1() {
        return cod_equipo1;
    }

    public void setCod_equipo1(int cod_equipo1) {
        this.cod_equipo1 = cod_equipo1;
    }

    public int getCod_equipo2() {
        return cod_equipo2;
    }

    public void setCod_equipo2(int cod_equipo2) {
        this.cod_equipo2 = cod_equipo2;
    }

    public int getCod_campeonato() {
        return cod_campeonato;
    }

    public void setCod_campeonato(int cod_campeonato) {
        this.cod_campeonato = cod_campeonato;
    }

    public int getCod_estadio() {
        return cod_estadio;
    }

    public void setCod_estadio(int cod_estadio) {
        this.cod_estadio = cod_estadio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
