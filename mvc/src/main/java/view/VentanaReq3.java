/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControladorRequerimientoReto4;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.vo.CargoAsignacion;
import model.vo.MaterialNacional;
import model.vo.ProyectoRankeadoCompras;
import static view.VentanaReq1.controlador;
import static view.VistaRequerimientosReto4.controlador;

/**
 *
 * @author Miguel Vinasco
 */
public class VentanaReq3 extends javax.swing.JFrame {
    
    public static final ControladorRequerimientoReto4 controlador = new ControladorRequerimientoReto4();

    private DefaultTableModel modeloTabla;
    /**
     * Creates new form VentanaReq2
     */
    public VentanaReq3() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Cargo");
        modeloTabla.addColumn("Numero_Proyectos");
        tableReq2.setModel(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReq2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Reporte 3");

        tableReq2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableReq2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tableReq2.setModel(new javax.swing.table.DefaultTableModel(
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
        tableReq2.setGridColor(new java.awt.Color(51, 51, 255));
        tableReq2.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tableReq2.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tableReq2.setShowGrid(true);
        jScrollPane1.setViewportView(tableReq2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addGap(0, 189, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
        public void generarTabla(){
        try {
            ArrayList<CargoAsignacion> cargosMenosAsignados = controlador.consultarCargosMenosAsignados();
            
            for (int i = 0; i < cargosMenosAsignados.size(); i++){
                
                String datos[] = new String[2];
                datos[0] = cargosMenosAsignados.get(i).getCargo();
                datos[1] = "" +cargosMenosAsignados.get(i).getNumeroProyectos();
                modeloTabla.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaReq1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReq2;
    // End of variables declaration//GEN-END:variables
}
