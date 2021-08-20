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
import model.vo.MaterialNacional;
import static view.VistaRequerimientosReto4.controlador;

/**
 *
 * @author Miguel Vinasco
 */
public class VentanaReq1 extends javax.swing.JFrame {

    public static final ControladorRequerimientoReto4 controlador = new ControladorRequerimientoReto4();

    
    private DefaultTableModel modeloTabla;
    /**
     * Creates new form VentanaReq1
     */
    public VentanaReq1() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre_Material");
        modeloTabla.addColumn("Importado");
        modeloTabla.addColumn("No_Compras");
        tableReq1.setModel(modeloTabla);
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
        tableReq1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta 1");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Reporte 1");

        tableReq1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableReq1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tableReq1.setModel(new javax.swing.table.DefaultTableModel(
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
        tableReq1.setGridColor(new java.awt.Color(51, 51, 255));
        tableReq1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tableReq1.setSelectionForeground(new java.awt.Color(204, 204, 204));
        tableReq1.setShowGrid(true);
        jScrollPane1.setViewportView(tableReq1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            ArrayList<MaterialNacional> rankingMaterialesNacionales = controlador.consultarMaterialesNacionalesComprados();
            
            for (int i = 0; i < rankingMaterialesNacionales.size(); i++){
                
                String datos[] = new String[3];
                datos[0] = rankingMaterialesNacionales.get(i).getNombreMaterial();
                datos[1] = rankingMaterialesNacionales.get(i).getImportado();
                datos[2] = "" + rankingMaterialesNacionales.get(i).getNoCompras();
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
    private javax.swing.JTable tableReq1;
    // End of variables declaration//GEN-END:variables
}
