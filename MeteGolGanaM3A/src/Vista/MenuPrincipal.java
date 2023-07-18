/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

/**
 *
 * @author tatip
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    public JButton getBtnCampeonato() {
        return btnCampeonato;
    }

    public void setBtnCampeonato(JButton btnCampeonato) {
        this.btnCampeonato = btnCampeonato;
    }

    public JButton getBtnTemporada() {
        return btnTemporada;
    }

    public void setBtnTemporada(JButton btnTemporada) {
        this.btnTemporada = btnTemporada;
    }

    public JDesktopPane getDesctopPrincipal() {
        return desctopPrincipal;
    }

    public void setDesctopPrincipal(JDesktopPane desctopPrincipal) {
        this.desctopPrincipal = desctopPrincipal;
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        toolBar = new javax.swing.JToolBar();
        btnTemporada = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnPersonaMn = new javax.swing.JButton();
        btnCampeonato = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnProductosMN = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnFactura = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        desctopPrincipal = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnClientes = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mniProductosMP = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        mniReportesMP = new javax.swing.JMenu();
        btnReporteFac = new javax.swing.JMenu();
        mniReportesMP1 = new javax.swing.JMenu();
        mniAyudaMP = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        toolBar.setRollover(true);

        btnTemporada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/calendario 64x64.jpg"))); // NOI18N
        btnTemporada.setToolTipText("Ver las temporadas existentes");
        btnTemporada.setFocusable(false);
        btnTemporada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTemporada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnTemporada);
        toolBar.add(jSeparator2);

        btnPersonaMn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/identification32bn.png"))); // NOI18N
        btnPersonaMn.setToolTipText("Boton para registrar personas");
        btnPersonaMn.setFocusable(false);
        btnPersonaMn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPersonaMn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnPersonaMn);

        btnCampeonato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/campeonato64x64.png"))); // NOI18N
        btnCampeonato.setToolTipText("Ver Campeonatos");
        btnCampeonato.setFocusable(false);
        btnCampeonato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCampeonato.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnCampeonato);
        toolBar.add(jSeparator1);

        btnProductosMN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/producto32.png"))); // NOI18N
        btnProductosMN.setToolTipText("Boton para registrar productos\n");
        btnProductosMN.setFocusable(false);
        btnProductosMN.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductosMN.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnProductosMN);
        toolBar.add(jSeparator3);

        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/factura32.png"))); // NOI18N
        btnFactura.setToolTipText("Boton para crear facturas, de las ventas de los productos");
        btnFactura.setFocusable(false);
        btnFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnFactura);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        desctopPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desctopPrincipalLayout = new javax.swing.GroupLayout(desctopPrincipal);
        desctopPrincipal.setLayout(desctopPrincipalLayout);
        desctopPrincipalLayout.setHorizontalGroup(
            desctopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desctopPrincipalLayout.setVerticalGroup(
            desctopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desctopPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desctopPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 12)); // NOI18N
        jLabel1.setText("Mete Gol Gana 1.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(12, 12, 12))
        );

        mnClientes.setText("Clientes");

        jMenuItem2.setText("Mantenimiento");
        mnClientes.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnClientes.add(jMenuItem3);

        jMenuBar1.add(mnClientes);

        mniProductosMP.setText("Productos");

        jMenuItem4.setText("jMenuItem4");
        mniProductosMP.add(jMenuItem4);

        jMenuBar1.add(mniProductosMP);

        mniReportesMP.setText("Reportes");

        btnReporteFac.setText("Reporte Factura");
        mniReportesMP.add(btnReporteFac);

        jMenuBar1.add(mniReportesMP);

        mniReportesMP1.setText("Imprimir");
        jMenuBar1.add(mniReportesMP1);

        mniAyudaMP.setText("Ayuda");
        jMenuBar1.add(mniAyudaMP);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed


   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCampeonato;
    private javax.swing.JToggleButton btnFactura;
    private javax.swing.JButton btnPersonaMn;
    private javax.swing.JButton btnProductosMN;
    private javax.swing.JMenu btnReporteFac;
    private javax.swing.JButton btnTemporada;
    private javax.swing.JDesktopPane desctopPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JMenu mnClientes;
    private javax.swing.JMenu mniAyudaMP;
    private javax.swing.JMenu mniProductosMP;
    private javax.swing.JMenu mniReportesMP;
    private javax.swing.JMenu mniReportesMP1;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
