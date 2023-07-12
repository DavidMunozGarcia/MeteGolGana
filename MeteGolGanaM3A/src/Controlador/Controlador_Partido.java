/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionMySql;
import Modelo.Clase_Partido;
import Modelo.Modelo_Partido;
import Vista.VistaPartido;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Controlador_Partido {

    private Modelo_Partido modeloPar;
    private VistaPartido vistapar;

    public Controlador_Partido(Modelo_Partido modeloPar, VistaPartido vistapar) {
        this.modeloPar = modeloPar;
        this.vistapar = vistapar;
        vistapar.setVisible(true);
        cargaPartidos();
    }
//-------------------------------------------------------CONTROL--------------------------------------------------------------------------------------------

    public void iniciaControl() {
        vistapar.getBtnAgregar().addActionListener(l -> abrirDialogo("Crear"));
        vistapar.getBtnModificar().addActionListener(l -> abrirDialogo("Editar"));
        vistapar.getBtnEliminar().addActionListener(l -> abrirDialogo("Eliminar"));
        vistapar.getBtnCancelar().addActionListener(l -> salirdialogo());
        vistapar.getBtnRegistrarModificar().addActionListener(l -> crearEditarPartido());

        //vista.getBtnSalir1().addActionListener(l -> salirdialogo());
        //vista.getBtnImprimir().addActionListener(l -> generarreporte());
        //vista.getBtnSalir().addActionListener(l -> salir());
        //vista.getBtnCrear().addActionListener(l -> {

    }
//-------------------------------------------------------DIALOGO--------------------------------------------------------------------------------------------

    private void abrirDialogo(String ce) {

        vistapar.getDialogRegistrarModificar().setLocationRelativeTo(null);
        vistapar.getDialogRegistrarModificar().setSize(900, 900);
        vistapar.getDialogRegistrarModificar().setTitle(ce);
        vistapar.getDialogRegistrarModificar().setVisible(true);
        if (vistapar.getDialogRegistrarModificar().getTitle().contentEquals("Crear")) {
            vistapar.getLblReMoJugadores().setText("REGISTRO DE PARTIDOS");
        } else if (vistapar.getDialogRegistrarModificar().getTitle().contentEquals("Editar")) {
            vistapar.getLblReMoJugadores().setText("MODIFICAR PARTIDOS");
            LlenarDatos();

        } else if (vistapar.getDialogRegistrarModificar().getTitle().contentEquals("Eliminar")) {
            LlenarDatos();
        }
    }
//--------------------------------------------------------CRUD--------------------------------------------------------------------------------------------
//-------------------------------------------------------AGREGAR--------------------------------------------------------------------------------------------

    private void crearEditarPartido() {
        if (vistapar.getDialogRegistrarModificar().getTitle().contentEquals("Crear")) {

            Modelo_Partido model = new Modelo_Partido();

            if (vistapar.getTxtCodPartido().equals("") || vistapar.getTxtCampeonato().equals("") || vistapar.getTxtEquipo1().equals("") || vistapar.getTxtEquipo2().equals("") || vistapar.getTxtEstadio().equals("")) {

                JOptionPane.showMessageDialog(null, "POR FAVOR LLENE LOS DATOS");

            } else {
                int codigopartido = Integer.valueOf(vistapar.getTxtCodPartido().getText());
                int codcampeonato = Integer.valueOf(vistapar.getTxtCampeonato().getText());
                int equipo1 = Integer.valueOf(vistapar.getTxtEquipo1().getText());
                int equipo2 = Integer.valueOf(vistapar.getTxtEquipo2().getText());
                int estadio = Integer.valueOf(vistapar.getTxtEstadio().getText());
                int estado = 0;

                model.setCod_partido(codigopartido);
                model.setCod_campeonato(codcampeonato);
                model.setCod_equipo1(equipo1);
                model.setCod_equipo2(equipo2);
                model.setCod_estadio(estadio);
                model.setEstado(estado);
                if (model.InsertarPartido()) {
                    limpiar();
                    JOptionPane.showMessageDialog(vistapar, "DATOS CREADOS");
                    vistapar.getDialogRegistrarModificar().setVisible(false);
                    cargaPartidos();
                } else {
                    JOptionPane.showMessageDialog(vistapar, "ERROR AL GRABAR DATOS");
                }
            }
//-------------------------------------------------------MODIFICAR--------------------------------------------------------------------------------------------

        } else if (vistapar.getDialogRegistrarModificar().getTitle().contentEquals("Editar")) {

            Modelo_Partido model = new Modelo_Partido();

            if (vistapar.getTxtCodPartido().equals("") || vistapar.getTxtCampeonato().equals("") || vistapar.getTxtEquipo1().equals("") || vistapar.getTxtEquipo2().equals("") || vistapar.getTxtEstadio().equals("")) {

                JOptionPane.showMessageDialog(null, "POR FAVOR LLENE LOS DATOS");

            } else {
                int codigopartido = Integer.valueOf(vistapar.getTxtCodPartido().getText());
                int codcampeonato = Integer.valueOf(vistapar.getTxtCampeonato().getText());
                int equipo1 = Integer.valueOf(vistapar.getTxtEquipo1().getText());
                int equipo2 = Integer.valueOf(vistapar.getTxtEquipo2().getText());
                int estadio = Integer.valueOf(vistapar.getTxtEstadio().getText());

                model.setCod_partido(codigopartido);
                model.setCod_campeonato(codcampeonato);
                model.setCod_equipo1(equipo1);
                model.setCod_equipo2(equipo2);
                model.setCod_estadio(estadio);
                if (model.ModificarPartido()) {
                    limpiar();
                    JOptionPane.showMessageDialog(vistapar, "DATOS CREADOS");
                    vistapar.getDialogRegistrarModificar().setVisible(false);
                    cargaPartidos();
                } else {
                    JOptionPane.showMessageDialog(vistapar, "ERROR AL GRABAR DATOS");
                }

            }
//-------------------------------------------------------ELIMINAR--------------------------------------------------------------------------------------------

        } else if (vistapar.getDialogRegistrarModificar().getTitle().contentEquals("Eliminar")) {
            Modelo_Partido model = new Modelo_Partido();
            model.setCod_partido(Integer.valueOf(vistapar.getTxtCodPartido().getText()));
            if (model.EliminarPartido()) {

                limpiar();
                JOptionPane.showMessageDialog(vistapar, "DATOS ELIMINADOS");

                vistapar.getDialogRegistrarModificar().setVisible(false);
                cargaPartidos();

            } else {
                JOptionPane.showMessageDialog(vistapar, "ERROR AL GRABAR DATOS");
            }

        }
    }

//-------------------------------------------------------CARGAR PARTIDOS EN LA TABLA--------------------------------------------------------------------------------------------
    private void cargaPartidos() {
        DefaultTableModel mJtable;
        mJtable = (DefaultTableModel) vistapar.getTblPartidos().getModel();
        mJtable.setNumRows(0);
        List<Clase_Partido> listaP = modeloPar.listarPartidos();
        listaP.stream().forEach(p -> {
            String[] rowData = {String.valueOf(p.getCod_partido()), String.valueOf(p.getCod_campeonato()), String.valueOf(p.getCod_equipo1()), String.valueOf(p.getCod_equipo2()), String.valueOf(p.getCod_estadio())};
            mJtable.addRow(rowData);
        }
        );
    }
//-------------------------------------------------------LLENAR DATOS--------------------------------------------------------------------------------------------

    public void LlenarDatos() {

        List<Clase_Partido> Listpar = modeloPar.listarPartidos();
        int selectedRow = vistapar.getTblPartidos().getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Para que los datos se llenen, debe seleccionar un elemento de la tabla");
        } else {
            String selectedId = vistapar.getTblPartidos().getValueAt(selectedRow, 0).toString();
            Optional<Clase_Partido> matchingPartido = Listpar.stream()
                    .filter(p -> selectedId.equals(p.getCod_partido()))
                    .findFirst();

            if (matchingPartido.isPresent()) {
                Clase_Partido p = matchingPartido.get();
                vistapar.getTxtCodPartido().setText(String.valueOf(p.getCod_partido()));
                vistapar.getTxtCodPartido().setEnabled(false);
                vistapar.getTxtCampeonato().setText(String.valueOf(p.getCod_campeonato()));
                vistapar.getTxtEquipo1().setText(String.valueOf(p.getCod_equipo1()));
                vistapar.getTxtEquipo2().setText(String.valueOf(p.getCod_equipo2()));
                vistapar.getTxtEstadio().setText(String.valueOf(p.getCod_estadio()));

            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento válido de la tabla.");
            }
        }
    }
//------------------------------------------------------- SALIR DEL DIALOGO--------------------------------------------------------------------------------------------

    public void salirdialogo() {
        limpiar();
        vistapar.getDialogRegistrarModificar().setVisible(false);
    }

//------------------------------------------------------- LIMPIAR--------------------------------------------------------------------------------------------
    private void limpiar() {

        vistapar.getTxtCodPartido().setText("");
        vistapar.getTxtCampeonato().setText("");
        vistapar.getTxtEquipo1().setText("");
        vistapar.getTxtEquipo2().setText("");
        vistapar.getTxtEstadio().setText("");
        vistapar.getTxtCodPartido().setEnabled(true);

    }
}
