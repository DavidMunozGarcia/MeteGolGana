package Controlador;

import Modelo.Clase_Equipo;
import Modelo.ModeloEquipos;
import Vista.VistaEquipos;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Derek
 */
public class Controlador_Equipo {

    private ModeloEquipos modeloEqui;
    private VistaEquipos vistaequi;

    public Controlador_Equipo(ModeloEquipos modeloEqui, VistaEquipos vistaequi) {
        this.modeloEqui = modeloEqui;
        this.vistaequi = vistaequi;
        vistaequi.setVisible(true);
        //cargaEquipo();
    }

    public void iniciaControl() {
        vistaequi.getBtnAgregar().addActionListener(l -> abrirDialogo("Crear"));
        vistaequi.getBtnModificar().addActionListener(l -> abrirDialogo("Editar"));
        vistaequi.getBtnEliminar().addActionListener(l -> abrirDialogo("Eliminar"));
        vistaequi.getBtnCancelar().addActionListener(l -> salirdialogo());
        vistaequi.getBtnRegistrarModificar().addActionListener(l -> crearEditarPartido());

        //vista.getBtnSalir1().addActionListener(l -> salirdialogo());
        //vista.getBtnImprimir().addActionListener(l -> generarreporte());
        //vista.getBtnSalir().addActionListener(l -> salir());
        //vista.getBtnCrear().addActionListener(l -> {
    }

    private void abrirDialogo(String ce) {

        vistaequi.getJdlgEquipos().setLocationRelativeTo(null);
        vistaequi.getJdlgEquipos().setSize(900, 900);
        vistaequi.getJdlgEquipos().setTitle(ce);
        vistaequi.getJdlgEquipos().setVisible(true);

        if (vistaequi.getJdlgEquipos().getTitle().contentEquals("Crear")) {
            vistaequi.getLblReMoEquipos().setText("REGISTRO DE EQUIPOS");

        } else if (vistaequi.getJdlgEquipos().getTitle().contentEquals("Editar")) {
            vistaequi.getLblReMoEquipos().setText("MODIFICAR EQUIPOS");
            //LlenarDatos();

        } else if (vistaequi.getJdlgEquipos().getTitle().contentEquals("Eliminar")) {
            //LlenarDatos();
        }
    }
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
                    vistaequi.getDialogRegistrarModificar().setVisible(false);
                    cargaPartidos();
                } else {
                    JOptionPane.showMessageDialog(vistapar, "ERROR AL GRABAR DATOS");
                }

            }
//-------------------------------------------------------ELIMINAR--------------------------------------------------------------------------------------------

        } else if (vistaequi.getJdlgEquipos().getTitle().contentEquals("Eliminar")) {
            ModeloEquipos model = new ModeloEquipos();
            model.setCod_equipo(Integer.valueOf(vistaequi.getTxtcodequipo().getText()));
            if (model.EliminarPartido()) {

                limpiar();
                JOptionPane.showMessageDialog(vistaequi, "DATOS ELIMINADOS");

                vistaequi.getJdlgEquipos().setVisible(false);
                cargarEquipos();

            } else {
                JOptionPane.showMessageDialog(vistaequi, "ERROR AL GRABAR DATOS");
            }

        }
    }

//-------------------------------------------------------CARGAR PARTIDOS EN LA TABLA--------------------------------------------------------------------------------------------
    private void cargarEquipos() {
        DefaultTableModel mJtable;
        mJtable = (DefaultTableModel) vistaequi.getTblEquipos().getModel();
        mJtable.setNumRows(0);
        List<Clase_Equipo> listaE = modeloEqui.listarEquipos();
        listaE.stream().forEach(p -> {
            String[] rowData = {String.valueOf(p.getCod_equipo()), String.valueOf(p.getNombre_equi()), String.valueOf(p.getAnio_fundacion()), String.valueOf(p.getCiudad())};
            mJtable.addRow(rowData);
        }
        );
    }
//-------------------------------------------------------LLENAR DATOS--------------------------------------------------------------------------------------------

    public void LlenarDatos() {

        List<Clase_Equipo> Listequi = modeloEqui.listarEquipos();
        int selectedRow = vistaequi.getTblEquipos().getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Para que los datos se llenen, debe seleccionar un elemento de la tabla");
        } else {
            String selectedId = vistaequi.getTblEquipos().getValueAt(selectedRow, 0).toString();
            Optional<Clase_Equipo> matchingPartido = Listequi.stream()
                    .filter(p -> selectedId.equals(p.getCod_equipo()))
                    .findFirst();

            if (matchingPartido.isPresent()) {
                Clase_Equipo p = matchingPartido.get();
                vistaequi.getTxtcodequipo().setText(String.valueOf(p.getCod_equipo()));
                vistaequi.getTxtcodequipo().setEnabled(false);
                vistaequi.getTxtNombreequipo().setText(String.valueOf(p.getNombre_equi()));
                vistaequi.getJdcaniofundacion().setDate(p.getAnio_fundacion());
                vistaequi.getTxtCiudadequipo().setText(String.valueOf(p.getCiudad()));

            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento válido de la tabla.");
            }
        }
    }
//------------------------------------------------------- SALIR DEL DIALOGO--------------------------------------------------------------------------------------------

    public void salirdialogo() {
        limpiar();
        vistaequi.getJdlgEquipos().setVisible(false);
    }

//------------------------------------------------------- LIMPIAR--------------------------------------------------------------------------------------------
    private void limpiar() {

        vistaequi.getTxtcodequipo().setText("");
        vistaequi.getTxtNombreequipo().setText("");
        vistaequi.getJdcaniofundacion().setDate(null);
        vistaequi.getTxtCiudadequipo().setText("");
        vistaequi.getTxtcodequipo().setEnabled(true);

    }
}
