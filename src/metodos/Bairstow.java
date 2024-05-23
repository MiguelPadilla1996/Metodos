/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package metodos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saman
 */
public class Bairstow extends javax.swing.JFrame {

    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modeloa = new DefaultTableModel();
    DefaultTableModel modelob = new DefaultTableModel();

    /**
     * Creates new form Bairstow
     */
    public Bairstow() {
        initComponents();
        limpiar();
       // mostrartabla("");
      //  mostrartabla3("");
    }

    void limpiar() {
        formulatxt.setText("");
        rtxt.setText("");
        stxt.setText("");
        modelo2.setRowCount(0);
        modelo.setRowCount(0);
        modeloa.setRowCount(0);
        modelob.setRowCount(0);
    }

    void mostrartabla(String valor) {

        Object[] nombres = {"i", "b0", "b1", "b2", "b3", "b4", "b5", "c1", "c2", "c3", "c4", "c5", "r", "s", "ar", "as", "ear", "ears"};
        modelo2.addRow(nombres);
        modelo2.addColumn("i");
        modelo2.addColumn("b0");
        modelo2.addColumn("b1");
        modelo2.addColumn("b2");
        modelo2.addColumn("b3");
        modelo2.addColumn("b4");
        modelo2.addColumn("b5");
        modelo2.addColumn("c1");
        modelo2.addColumn("c2");
        modelo2.addColumn("c3");
        modelo2.addColumn("c4");
        modelo2.addColumn("c5");
        modelo2.addColumn("R");
        modelo2.addColumn("S");
        modelo2.addColumn("AR");
        modelo2.addColumn("AS");
        modelo2.addColumn("EAR");
        modelo2.addColumn("EARS");
        tabla.setModel(modelo2);
    }

    void mostrartabla2(String valor) {

        Object[] nombres = {"i", "b0", "b1", "b2", "b3", "c1", "c2", "c3", "r", "s", "ar", "as", "ear", "ears"};
        modelo.addRow(nombres);
        modelo.addColumn("i");
        modelo.addColumn("b0");
        modelo.addColumn("b1");
        modelo.addColumn("b2");
        modelo.addColumn("b3");
        modelo.addColumn("c1");
        modelo.addColumn("c2");
        modelo.addColumn("c3");
        modelo.addColumn("R");
        modelo.addColumn("S");
        modelo.addColumn("AR");
        modelo.addColumn("AS");
        modelo.addColumn("EAR");
        modelo.addColumn("EARS");
        tabla.setModel(modelo);
    }
    void mostrartabla3(String valor){
        Object[] nombres = {"a0","a1", "a2", "a3", "a4", "a5"};
        modeloa.addRow(nombres);
        modeloa.addColumn("a0");
        modeloa.addColumn("a1");
        modeloa.addColumn("a2");
        modeloa.addColumn("a3");
        modeloa.addColumn("a4");
        modeloa.addColumn("a5");
        tabla2.setModel(modeloa);
    }
    void mostrartabla4(String valor){
        Object[] nombres = {"a0", "a1", "a2", "a3"};
        modelob.addRow(nombres);
        modelob.addColumn("a0");
        modelob.addColumn("a1");
        modelob.addColumn("a2");
        modelob.addColumn("a3");
        tabla2.setModel(modelob);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        formulatxt = new javax.swing.JTextField();
        rtxt = new javax.swing.JTextField();
        stxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        Limpiar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Introduzca La Formula");

        jLabel2.setText("Introduzca El Valor De r");

        jLabel3.setText("Introduzca El Valor De s");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabla2);

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(359, 359, 359)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(formulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(210, 210, 210)
                                            .addComponent(stxt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Limpiar))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(209, 209, 209)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(107, 107, 107)
                                            .addComponent(jButton1))))))
                        .addGap(0, 309, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Limpiar)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DecimalFormat formato = new DecimalFormat("#.####");
        int iteraciones = 0;
        String formula = formulatxt.getText();
        double r = Double.parseDouble(rtxt.getText());
        double s = Double.parseDouble(stxt.getText());

        String[] partes = formula.split("(?=[+-])");

        ArrayList<Double> coeficientes = new ArrayList<>();

        Pattern pattern = Pattern.compile("([+-]?\\d*\\.?\\d*)([a-zA-Z]?.*)");

        for (String parte : partes) {
            Matcher matcher = pattern.matcher(parte.trim());
            if (matcher.find()) {
                String coefStr = matcher.group(1);
                String variablePart = matcher.group(2);

                if (coefStr.isEmpty() && !variablePart.isEmpty()) {
                    coefStr = "+1";
                } else if (coefStr.equals("+") || coefStr.equals("-")) {
                    coefStr += "1";
                }

                double coeficiente = Double.parseDouble(coefStr);
                coeficientes.add(coeficiente);

            }
        }

        double[] a = new double[coeficientes.size()];
        for (int i = 0; i < coeficientes.size(); i++) {
            a[i] = coeficientes.get(i);
        }

        if (a.length >= 5) {
            mostrartabla("");
            mostrartabla3("");
            modelo2.setRowCount(0);
            modeloa.setRowCount(0);
            int n = a.length;
            for (int i = 0; i < n / 2; i++) {
                double temp = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = temp;
            }
              Object[] fila = new Object[n];
            for (int i = 0; i < n; i++) {
                fila[i] = a[i];
            }
            modeloa.addRow(fila);
            do {
                double b5 = a[5];
                double b4 = a[4] + (r * (b5));
                double b3 = a[3] + (r * (b4)) + (s * (b5));
                double b2 = a[2] + (r * (b3)) + (s * (b4));
                double b1 = a[1] + (r * (b2)) + (s * (b3));
                double b0 = a[0] + (r * (b1)) + (s * (b2));

                double c5 = b5;
                double c4 = b4 + (r * (c5));
                double c3 = b3 + (r * (c4)) + (s * (c5));
                double c2 = b2 + (r * (c3)) + (s * (c4));
                double c1 = b1 + (r * (c2)) + (s * (c3));

                double ar = ((c3 * b0) - (c2 * b1)) / ((Math.pow(c2, 2)) - (c1 * c3));

                double as = ((c1 * b1) - (c2 * b0)) / ((Math.pow(c2, 2)) - (c1 * c3));

                double rNuevo = r + ar;
                double sNuevo = s + as;

                double ear = ar / rNuevo;
                double ears = as / sNuevo;
                
                String b5c = formato.format(b5);
                String b4c = formato.format(b4);
                String b3c = formato.format(b3);
                String b2c = formato.format(b2);
                String b1c = formato.format(b1);
                String b0c = formato.format(b0);
                String rc = formato.format(r);
                String sc = formato.format(s);
                String c5c = formato.format(c5);
                String c4c = formato.format(c4);
                String c3c = formato.format(c3);
                String c2c = formato.format(c2);
                String c1c = formato.format(c1);
                String arc = formato.format(ar);
                String asc = formato.format(as);
                
                String earc = formato.format(ear);
                String earsc = formato.format(ears);
                modelo2.addRow(new Object[]{
                    iteraciones, b0c, b1c, b2c, b3c, b4c, b5c, c1c, c2c, c3c, c4c, c5c, rc, sc, arc, asc, earc, earsc
                });

                r = rNuevo;
                s = sNuevo;
                iteraciones++;
            } while (iteraciones < 4);

        } else {
            mostrartabla4("");
            mostrartabla2("");
            modelo.setRowCount(0);
            modelob.setRowCount(0);
            int n = a.length;
            for (int i = 0; i < n / 2; i++) {
                double temp = a[i];
                a[i] = a[n - i - 1];
                a[n - i - 1] = temp;
            }
            Object[] fila = new Object[n];
            for (int i = 0; i < n; i++) {
                fila[i] = a[i];
            }
            modelob.addRow(fila);
            do {

                double b3 = a[3];
                double b2 = a[2] + (r * (b3));
                double b1 = a[1] + (r * (b2)) + (s * (b3));
                double b0 = a[0] + (r * (b1)) + (s * (b2));


                double c3 = b3;
                double c2 = b2 + (r * (c3));
                double c1 = b1 + (r * (c2)) + (s * (c3));

             

                double ar = ((c3 * b0) - (c2 * b1)) / ((Math.pow(c2, 2)) - (c1 * c3));
                
                double as = ((c1 * b1) - (c2 * b0)) / ((Math.pow(c2, 2)) - (c1 * c3));
                
                double rNuevo = r + ar;
                double sNuevo = s + as;

                double ear = ar / rNuevo;
                double ears = as / sNuevo;
                
                String b3c = formato.format(b3);
                String b2c = formato.format(b2);
                String b1c = formato.format(b1);
                String b0c = formato.format(b0);
                String rc = formato.format(r);
                String sc = formato.format(s);
                String c3c = formato.format(c3);
                String c2c = formato.format(c2);
                String c1c = formato.format(c1);
                String arc = formato.format(ar);
                String asc = formato.format(as);
                
                String earc = formato.format(ear);
                String earsc = formato.format(ears);
                modelo.addRow(new Object[]{
                    iteraciones, b0c, b1c, b2c, b3c, c1c, c2c, c3c, rc, sc, arc, asc, earc, earsc
                });

                r = rNuevo;
                s = sNuevo;
                iteraciones++;
            } while (iteraciones < 6);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Menu m=new Menu();
m.setVisible(true);
this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Bairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bairstow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bairstow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField formulatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rtxt;
    private javax.swing.JTextField stxt;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}