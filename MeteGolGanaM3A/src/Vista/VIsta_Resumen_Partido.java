/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import LIB.FSButtonMD;
import LIB.FSTexFieldMD;
import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author blink
 */
public class VIsta_Resumen_Partido extends javax.swing.JFrame {

    /**
     * Creates new form VIsta_Resumen_Partido
     */
    public VIsta_Resumen_Partido() {
        initComponents();
    }

    public static JButton getBtnAgregar() {
        return btnAgregar;
    }

    public static void setBtnAgregar(JButton btnAgregar) {
        VIsta_Resumen_Partido.btnAgregar = btnAgregar;
    }

    public static FSButtonMD getBtnCancelar1() {
        return btnCancelar1;
    }

    public static void setBtnCancelar1(FSButtonMD btnCancelar1) {
        VIsta_Resumen_Partido.btnCancelar1 = btnCancelar1;
    }

    public static JButton getBtnEliminar() {
        return btnEliminar;
    }

    public static void setBtnEliminar(JButton btnEliminar) {
        VIsta_Resumen_Partido.btnEliminar = btnEliminar;
    }

    public JButton getBtnEquipo1() {
        return btnEquipo1;
    }

    public void setBtnEquipo1(JButton btnEquipo1) {
        this.btnEquipo1 = btnEquipo1;
    }

    public static FSButtonMD getBtnInicio1() {
        return btnInicio1;
    }

    public static void setBtnInicio1(FSButtonMD btnInicio1) {
        VIsta_Resumen_Partido.btnInicio1 = btnInicio1;
    }

    public static FSButtonMD getBtnInicio2() {
        return btnInicio2;
    }

    public static void setBtnInicio2(FSButtonMD btnInicio2) {
        VIsta_Resumen_Partido.btnInicio2 = btnInicio2;
    }

    public static JButton getBtnModificar() {
        return btnModificar;
    }

    public static void setBtnModificar(JButton btnModificar) {
        VIsta_Resumen_Partido.btnModificar = btnModificar;
    }

    public JButton getBtnPartidos1() {
        return btnPartidos1;
    }

    public void setBtnPartidos1(JButton btnPartidos1) {
        this.btnPartidos1 = btnPartidos1;
    }

    public static FSButtonMD getBtnRegistrarModificar1() {
        return btnRegistrarModificar1;
    }

    public static void setBtnRegistrarModificar1(FSButtonMD btnRegistrarModificar1) {
        VIsta_Resumen_Partido.btnRegistrarModificar1 = btnRegistrarModificar1;
    }

    public JDialog getDlgResumen() {
        return dlgResumen;
    }

    public void setDlgResumen(JDialog dlgResumen) {
        this.dlgResumen = dlgResumen;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTblResuemn() {
        return tblResuemn;
    }

    public void setTblResuemn(JTable tblResuemn) {
        this.tblResuemn = tblResuemn;
    }

    public static FSTexFieldMD getTxtBuscar() {
        return txtBuscar;
    }

    public static void setTxtBuscar(FSTexFieldMD txtBuscar) {
        VIsta_Resumen_Partido.txtBuscar = txtBuscar;
    }

    public static FSTexFieldMD getTxtEquipo() {
        return txtEquipo;
    }

    public static void setTxtEquipo(FSTexFieldMD txtEquipo) {
        VIsta_Resumen_Partido.txtEquipo = txtEquipo;
    }

    public static FSTexFieldMD getTxtFaltas() {
        return txtFaltas;
    }

    public static void setTxtFaltas(FSTexFieldMD txtFaltas) {
        VIsta_Resumen_Partido.txtFaltas = txtFaltas;
    }

    public static FSTexFieldMD getTxtPartido1() {
        return txtPartido1;
    }

    public static void setTxtPartido1(FSTexFieldMD txtPartido1) {
        VIsta_Resumen_Partido.txtPartido1 = txtPartido1;
    }

    public static FSTexFieldMD getTxtPenales1() {
        return txtPenales1;
    }

    public static void setTxtPenales1(FSTexFieldMD txtPenales1) {
        VIsta_Resumen_Partido.txtPenales1 = txtPenales1;
    }

    public static FSTexFieldMD getTxtSaquesBanda() {
        return txtSaquesBanda;
    }

    public static void setTxtSaquesBanda(FSTexFieldMD txtSaquesBanda) {
        VIsta_Resumen_Partido.txtSaquesBanda = txtSaquesBanda;
    }

    public static FSTexFieldMD getTxtTarjetasAmarillas() {
        return txtTarjetasAmarillas;
    }

    public static void setTxtTarjetasAmarillas(FSTexFieldMD txtTarjetasAmarillas) {
        VIsta_Resumen_Partido.txtTarjetasAmarillas = txtTarjetasAmarillas;
    }

    public static FSTexFieldMD getTxtTarjetasRojas() {
        return txtTarjetasRojas;
    }

    public static void setTxtTarjetasRojas(FSTexFieldMD txtTarjetasRojas) {
        VIsta_Resumen_Partido.txtTarjetasRojas = txtTarjetasRojas;
    }

    public static FSTexFieldMD getTxtTirosEsquina() {
        return txtTirosEsquina;
    }

    public static void setTxtTirosEsquina(FSTexFieldMD txtTirosEsquina) {
        VIsta_Resumen_Partido.txtTirosEsquina = txtTirosEsquina;
    }

    public static FSTexFieldMD getTxtTirosLibres() {
        return txtTirosLibres;
    }

    public static void setTxtTirosLibres(FSTexFieldMD txtTirosLibres) {
        VIsta_Resumen_Partido.txtTirosLibres = txtTirosLibres;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgResumen = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnInicio1 = new LIB.FSButtonMD();
        txtEquipo = new LIB.FSTexFieldMD();
        txtFaltas = new LIB.FSTexFieldMD();
        txtTarjetasAmarillas = new LIB.FSTexFieldMD();
        txtTarjetasRojas = new LIB.FSTexFieldMD();
        txtTirosEsquina = new LIB.FSTexFieldMD();
        txtSaquesBanda = new LIB.FSTexFieldMD();
        txtTirosLibres = new LIB.FSTexFieldMD();
        txtPenales1 = new LIB.FSTexFieldMD();
        btnEquipo1 = new javax.swing.JButton();
        txtPartido1 = new LIB.FSTexFieldMD();
        btnPartidos1 = new javax.swing.JButton();
        btnRegistrarModificar1 = new LIB.FSButtonMD();
        btnCancelar1 = new LIB.FSButtonMD();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnInicio2 = new LIB.FSButtonMD();
        btnAgregar = new javax.swing.JButton();
        txtBuscar = new LIB.FSTexFieldMD();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResuemn = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("STHupo", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resumen de partido");

        btnInicio1.setBackground(new java.awt.Color(0, 102, 204));
        btnInicio1.setText("Pagina Principal");
        btnInicio1.setColorHover(new java.awt.Color(0, 102, 204));
        btnInicio1.setColorNormal(new java.awt.Color(0, 102, 204));
        btnInicio1.setColorPressed(new java.awt.Color(0, 102, 204));
        btnInicio1.setColorTextHover(new java.awt.Color(204, 204, 204));
        btnInicio1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 433, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        txtEquipo.setForeground(new java.awt.Color(0, 0, 0));
        txtEquipo.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtEquipo.setPlaceholder("Esoja al equipo ");
        jPanel3.add(txtEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 210, -1));

        txtFaltas.setForeground(new java.awt.Color(0, 0, 0));
        txtFaltas.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtFaltas.setPlaceholder("Numero de faltas del equipo");
        jPanel3.add(txtFaltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 210, -1));

        txtTarjetasAmarillas.setForeground(new java.awt.Color(0, 0, 0));
        txtTarjetasAmarillas.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtTarjetasAmarillas.setPlaceholder("Numero de tarjetas amarillas");
        jPanel3.add(txtTarjetasAmarillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 210, -1));

        txtTarjetasRojas.setForeground(new java.awt.Color(0, 0, 0));
        txtTarjetasRojas.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtTarjetasRojas.setPlaceholder("Numero de tarjetas rojas");
        jPanel3.add(txtTarjetasRojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, -1));

        txtTirosEsquina.setForeground(new java.awt.Color(0, 0, 0));
        txtTirosEsquina.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtTirosEsquina.setPlaceholder("Numero de tiros de esquina");
        jPanel3.add(txtTirosEsquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 210, -1));

        txtSaquesBanda.setForeground(new java.awt.Color(0, 0, 0));
        txtSaquesBanda.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtSaquesBanda.setPlaceholder("Numero de saques de banda");
        jPanel3.add(txtSaquesBanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 210, -1));

        txtTirosLibres.setForeground(new java.awt.Color(0, 0, 0));
        txtTirosLibres.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtTirosLibres.setPlaceholder("Numero de tiros libres");
        jPanel3.add(txtTirosLibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 210, -1));

        txtPenales1.setForeground(new java.awt.Color(0, 0, 0));
        txtPenales1.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtPenales1.setPlaceholder("Numero de penales");
        jPanel3.add(txtPenales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 210, -1));

        btnEquipo1.setBackground(new java.awt.Color(0, 102, 204));
        btnEquipo1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnEquipo1.setForeground(new java.awt.Color(255, 255, 255));
        btnEquipo1.setText("Escoger equipo");
        jPanel3.add(btnEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 150, 30));

        txtPartido1.setForeground(new java.awt.Color(0, 0, 0));
        txtPartido1.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtPartido1.setPlaceholder("Partido");
        jPanel3.add(txtPartido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 210, -1));

        btnPartidos1.setBackground(new java.awt.Color(0, 102, 204));
        btnPartidos1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnPartidos1.setForeground(new java.awt.Color(255, 255, 255));
        btnPartidos1.setText("Escoger Partido");
        jPanel3.add(btnPartidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, -1, 30));

        btnRegistrarModificar1.setText("Registrar");
        btnRegistrarModificar1.setColorHover(new java.awt.Color(0, 102, 204));
        btnRegistrarModificar1.setColorPressed(new java.awt.Color(0, 204, 51));
        btnRegistrarModificar1.setColorTextHover(new java.awt.Color(255, 255, 255));
        jPanel3.add(btnRegistrarModificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, 40));

        btnCancelar1.setText("Cancelar");
        btnCancelar1.setColorHover(new java.awt.Color(0, 0, 0));
        btnCancelar1.setColorNormal(new java.awt.Color(255, 0, 0));
        btnCancelar1.setColorTextHover(new java.awt.Color(255, 255, 255));
        jPanel3.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, 40));

        javax.swing.GroupLayout dlgResumenLayout = new javax.swing.GroupLayout(dlgResumen.getContentPane());
        dlgResumen.getContentPane().setLayout(dlgResumenLayout);
        dlgResumenLayout.setHorizontalGroup(
            dlgResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, Short.MAX_VALUE)
        );
        dlgResumenLayout.setVerticalGroup(
            dlgResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgResumenLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 102, 204));

        jLabel3.setFont(new java.awt.Font("STHupo", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resumen de partido");

        btnInicio2.setBackground(new java.awt.Color(0, 102, 204));
        btnInicio2.setText("Pagina Principal");
        btnInicio2.setColorHover(new java.awt.Color(0, 102, 204));
        btnInicio2.setColorNormal(new java.awt.Color(0, 102, 204));
        btnInicio2.setColorPressed(new java.awt.Color(0, 102, 204));
        btnInicio2.setColorTextHover(new java.awt.Color(204, 204, 204));
        btnInicio2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnInicio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        btnAgregar.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/boton.png"))); // NOI18N
        btnAgregar.setText("Crear nuevo");
        btnAgregar.setToolTipText("Registrar un nuevo jugador");

        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setToolTipText("Ingrese una cedula o nombre");
        txtBuscar.setBordeColorFocus(new java.awt.Color(51, 51, 255));
        txtBuscar.setPlaceholder("Buscar resumen");

        btnModificar.setBackground(new java.awt.Color(0, 102, 204));
        btnModificar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("Registrar un nuevo jugador");

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/contenedor-de-basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Registrar un nuevo jugador");

        tblResuemn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResuemn);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VIsta_Resumen_Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VIsta_Resumen_Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VIsta_Resumen_Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VIsta_Resumen_Partido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VIsta_Resumen_Partido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgregar;
    public static LIB.FSButtonMD btnCancelar1;
    public static javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEquipo1;
    public static LIB.FSButtonMD btnInicio1;
    public static LIB.FSButtonMD btnInicio2;
    public static javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPartidos1;
    public static LIB.FSButtonMD btnRegistrarModificar1;
    private javax.swing.JDialog dlgResumen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblResuemn;
    public static LIB.FSTexFieldMD txtBuscar;
    public static LIB.FSTexFieldMD txtEquipo;
    public static LIB.FSTexFieldMD txtFaltas;
    public static LIB.FSTexFieldMD txtPartido1;
    public static LIB.FSTexFieldMD txtPenales1;
    public static LIB.FSTexFieldMD txtSaquesBanda;
    public static LIB.FSTexFieldMD txtTarjetasAmarillas;
    public static LIB.FSTexFieldMD txtTarjetasRojas;
    public static LIB.FSTexFieldMD txtTirosEsquina;
    public static LIB.FSTexFieldMD txtTirosLibres;
    // End of variables declaration//GEN-END:variables
}
