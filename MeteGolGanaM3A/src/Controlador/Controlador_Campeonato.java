/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.ConexionMySql;
import Modelo.Modelo_Campeonato;
import Vista.VistaCampeonato;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author tatip
 */

//--------------------------------------------------Controlador--------------------------------//

public class Controlador_Campeonato {

    Modelo_Campeonato modelo;

    VistaCampeonato vista;
    
    ConexionMySql conSql = new ConexionMySql();

    public Controlador_Campeonato() {
    }

    public Controlador_Campeonato(Modelo_Campeonato modelo, VistaCampeonato vista) {

        this.modelo = modelo;

        this.vista = vista;

        vista.setVisible(true);

    }
    
    
//----------------------------------------------Iniciar Control-------------------------------------------------------------------------//
    public void iniciaControl() {
        // Configuración inicial de la vista
        vista.setTitle("Campeonatos");
       

        // Asociación de acciones a los botones
        vista.getBtnImprimir().addActionListener(l -> reporteProducto());
        vista.getBtnRemover().addActionListener(l -> Eliminar());
        vista.getBtnLimpiarDlg().addActionListener(l -> limpiar());
        vista.getBtnConsultar().addActionListener(l -> buscar());
        vista.getBtnExaminar().addActionListener(l -> Foto());
        vista.getBtnSalir().addActionListener(l -> vista.dispose());
        vista.getBtnCrear().addActionListener(l -> abrirDialogo("Crear"));
        vista.getBtnEditar().addActionListener(l -> abrirEditarDialogo());
        vista.getBtnCerrarDlg().addActionListener(l -> cerrarDialogo());
        vista.getBtnLimpiaBusca().addActionListener(l -> limpiaBusca());

        // Validaciones de entrada para los campos de texto
        vista.getTxtCodigoDlg().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                Validaciones.Enteros(evt, vista.getTxtCodigoDlg().getText());
            }
        });

        vista.getTxtNombreDlg().addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                Validaciones.validaNomNum(evt, vista.getTxtNombreDlg().getText());
            }
        });

        vista.getTxtPrecioDlg().addKeyListener(new KeyAdapter() {
            @Override

            public void keyTyped(KeyEvent evt) {
                Validaciones.Decimales(evt, vista.getTxtPrecioDlg().getText());
            }
        });

        // Asociación de acción al botón de edición en el diálogo
        vista.getBtnEditarDLG().addActionListener(l -> crearEditarProductos());

        // Mostrar los datos iniciales en la tabla
        mostrarDatosTabla();
    }
    
    
//-----------------------------------------------------------Dialogo------------------------------------------------------------------------//
    private void cerrarDialogo() {

        vista.getDialogRegistrarModificar().dispose();

    }

    private void abrirEditarDialogo() {
        int selectedRow = vista.getTblCampeonato().getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar un registro de la tabla",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            abrirDialogo("Editar");
        }
    }

    

    private void abrirDialogo(String ce) {

        vista.getDialogRegistrarModificar().setLocationRelativeTo(vista);
        vista.getDialogRegistrarModificar().setSize(500, 500);
        vista.getDialogRegistrarModificar().setTitle(ce);

        if (vista.getDialogRegistrarModificar().getTitle().equals("Crear")) {

            vista.getBtnRegistrarModificar().setText("Registrar");
            limpiar();
            vista.getTxtCodigo().setEnabled(false);
        } else {

            vista.getBtnModificar().setText("Modificar");
            llenarCamposDeTexto();
            vista.getTxtCodigo().setEnabled(false);

        }
        vista.getDialogRegistrarModificar().setVisible(true);
    }
    

//-------------------------------------------------------------CREAR MODIFICAR-------------------------------------------------------//
    
    private void crearEditarCampeonato() {
        String title = vista.getDialogRegistrarModificar().getTitle();

        if (title.equals("Crear")) {
            if (camposVacios()) {
                JOptionPane.showMessageDialog(null, "Aún existen campos vacíos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                modelo.setCod_campeonato(Integer.valueOf(vista.getTxtCodigo().getText()));

                if (modelo.Validar()) {

                    // Asignar valores al modelo
                    modelo.setNombreProducto(vista.getTxtNombreDlg().getText());
                    modelo.setFotoProducto(vista.getTxtFoto().getText());
                    modelo.setDescripcionProducto(vista.getTxtDescripcionDlg().getText());
                    //transformar de objeto a int
                    int stock = ((Number) vista.getSpnStockDlg().getValue()).intValue();
                    modelo.setStock(stock);
                    
                    modelo.setPrecio(Double.valueOf(vista.getTxtPrecioDlg().getText()));

                    if (modelo.insertarProductos()) {
                        JOptionPane.showMessageDialog(null, "Datos guardados exitosamente",
                                "Advertencia", JOptionPane.INFORMATION_MESSAGE);

                        vista.getDlgProductos().dispose();
                        mostrarDatosTabla();

                    } else {
                        JOptionPane.showMessageDialog(null, "Error al guardar la información",
                                "Advertencia", JOptionPane.ERROR_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(vista, "El código ingresado ya existe en la base de datos",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } else if (title.equals("Editar")) {
            int confirmacion = JOptionPane.showConfirmDialog(vista, "¿Está seguro de modificar esta información?",
                    "Advertencia", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {

                modelo.setCodigoProducto(Integer.valueOf(vista.getTxtCodigoDlg().getText()));
                modelo.setNombreProducto(vista.getTxtNombreDlg().getText());
                modelo.setDescripcionProducto(vista.getTxtDescripcionDlg().getText());
                
                int stock = ((Number) vista.getSpnStockDlg().getValue()).intValue();
                modelo.setStock(stock);
                
                modelo.setPrecio(Double.parseDouble(vista.getTxtPrecioDlg().getText()));

                modelo.setFotoProducto(vista.getTxtFoto().getText());

                if (modelo.modificarProductos()) {
                    JOptionPane.showMessageDialog(vista, "Datos modificados ",
                            "Advertencia", JOptionPane.INFORMATION_MESSAGE);

                    mostrarDatosTabla();
                }
            }
        }
    }

// Verifica si hay campos vacíos en el formulario
    private boolean camposVacios() {
        return vista.getTxtCodigoDlg().getText().isEmpty()
                || vista.getTxtDescripcionDlg().getText().isEmpty()
                || vista.getTxtFoto().getText().isEmpty()
                || vista.getTxtDescripcionDlg().getText().isEmpty()
                || vista.getTxtPrecioDlg().getText().isEmpty();

    }

    public void llenarCamposDeTexto() {
        // Obtener la lista de productos
        List<Productos> listaProductos = modelo.listarProductos();

        // Recorrer la lista de productos
        listaProductos.stream().forEach(p -> {
            // Verificar si el codigo del producto coincide con el codigo seleccionado en la tabla
            if (vista.getTblProductos().getValueAt(vista.getTblProductos().getSelectedRow(), 0).equals(p.getCodigoProducto())) {

                // Llenar los campos de la vista con los datos de producto seleccionado
                vista.getTxtCodigoDlg().setText(String.valueOf(p.getCodigoProducto()));
                vista.getTxtNombreDlg().setText(p.getNombreProducto());
                vista.getTxtDescripcionDlg().setText(p.getDescripcionProducto());
                vista.getSpnStockDlg().setValue(p.getStock());
                vista.getTxtFoto().setText(p.getFotoProducto());
                vista.getTxtPrecioDlg().setText(String.valueOf(p.getPrecio()));
                // Cargar la imagen de la foto y ajustar su tamaño
                ImageIcon miImagen = new ImageIcon(vista.getTxtFoto().getText());
                Image foto = miImagen.getImage();
                foto = foto.getScaledInstance(145, 145, Image.SCALE_SMOOTH);
                vista.getLblFoto().setIcon(new ImageIcon(foto));

            }
        });
    }

    public void mostrarDatosTabla() {

        DefaultTableModel tabla = (DefaultTableModel) vista.getTblProductos().getModel();
        tabla.setRowCount(0);

        // Obtener la lista de productos
        List<Productos> listaProductos = modelo.listarProductos();

        // Recorrer la lista de productos
        listaProductos.forEach(p -> {

            // Crear un objeto datos con los valores de los campos correspondientes del producto
            Object[] datos = {p.getCodigoProducto(), p.getNombreProducto(), p.getDescripcionProducto(), p.getStock(), p.getPrecio()};

            // Agregar el objeto como una nueva fila a la tabla
            tabla.addRow(datos);
        });

        // Agregar ordenamiento y filtrado a la tabla
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tabla);
        vista.getTblProductos().setRowSorter(sorter);
    }

public void buscar() {
    // Obtener el código ingresado en el campo de búsqueda
    int codigo = Integer.parseInt(vista.getTxtBuscar().getText());

    if (codigo == 0) {
        // Mostrar mensaje de error si no se ingresa el código
        JOptionPane.showMessageDialog(null, "Ingrese el código del producto que desea buscar",
                "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // Obtener el modelo de la tabla
        DefaultTableModel tabla = (DefaultTableModel) vista.getTblProductos().getModel();
        // Limpiar el modelo de datos de la tabla
        tabla.setNumRows(0);

        // Obtener la lista de productos
        List<Productos> listaProductos = modelo.listarProductos();

        // Utilizar un stream para procesar la lista de productos
        listaProductos.stream()
                // Filtrar los productos por el código
                .filter(p -> codigo == p.getCodigoProducto())
                // Mapear cada producto filtrado a un objeto "datos" que contiene los valores deseados
                .map(p -> {
                    // Crear un objeto "datos"
                    Object[] datos = {p.getCodigoProducto(), p.getNombreProducto(), p.getDescripcionProducto(), p.getStock()};
                    return datos;
                })
                // Agregar cada objeto "datos" como una nueva fila al modelo de la tabla
                .forEach(tabla::addRow);
    }
}

    public void Eliminar() {
        // Mostrar mensaje de confirmación
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?",
                "Advertencia", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Obtener la fila seleccionada en la tabla
            int selectedRow = vista.getTblProductos().getSelectedRow();

            if (selectedRow != -1) {

                // Obtener elcodigo del producto  de la fila seleccionada
                int cod = (int) vista.getTblProductos().getValueAt(selectedRow, 0);
                String codString = String.valueOf(cod);
                modelo.setCodigoProducto(cod);

                if (modelo.EliminarProductos()) {
                    // Mostrar mensaje de eliminación exitosa
                    JOptionPane.showMessageDialog(null, "Eliminado",
                            "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                    mostrarDatosTabla(); // Actualizar la tabla con los datos actualizados
                } else {
                    // Mostrar mensaje de error en caso de fallar la eliminación
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro",
                            "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

//--------------------------------------------------------------LIMPIAR------------------------------------------------------------//

    public void limpiar() {

        vista.getTxtNombre().setText("");
        vista.getTxtCodigo().setText("");
        vista.getTxtBuscar().setText("");
        vista.getCbxTipoCampeonato().setSelectedIndex(0);
        vista.getSpnMaxEqipo().setValue(2);
        

    }
    
    private void limpiaBusca() {
        vista.getTxtBuscar().setText("");
        mostrarDatosTabla();
    }
    
    
    /* private void reporte(){
    try{
        
        JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/reportes/reporteProductos.jasper"));
        Map<String,Object> params = new HashMap<String, Object>();
        JasperPrint jasPrint =JasperFillManager.fillReport(jr, params, conSql.getCon());
        JasperViewer jasview = new JasperViewer(jasPrint,false);
        jasview.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jasview.setVisible(true);
    }catch(JRException ex){
        Logger.getLogger(ControladorFactura.class.getName()).log(Level.SEVERE, null, ex);

}
}
     
      public void reporteProducto() {

       
          int rta =Integer.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad mínima referente para el stock")) ;
          
         String rta2 = JOptionPane.showInputDialog("Ingrese el título de su reporte");
          
        try {
                        ConeccionPG con = new ConeccionPG();
                        Connection conn = con.getConnection();

                        JasperReport reporte = null;
                        String path = "src\\reportes\\reporteProductos.jasper";

                        Map parametro = new HashMap();
                        parametro.put("cantidad", rta);
                        parametro.put("titulo", rta2);

                        reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

                        JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);

                        JasperViewer vista = new JasperViewer(jprint, false);

                        vista.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                        vista.setVisible(true);
                    } catch (JRException ex) {
                        Logger.getLogger(ControladorPersonas.class.getName()).log(Level.SEVERE, null, ex);
 }
    }*/

}
