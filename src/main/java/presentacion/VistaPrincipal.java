package presentacion;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VistaPrincipal extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;
    
    public VistaPrincipal(Modelo m) {
        modelo = m;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioBoton1 = new javax.swing.ButtonGroup();
        grupoRadioBoton2 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        etiqueta = new javax.swing.JLabel();
        cajaNumero = new javax.swing.JTextField();
        radioBotonBinarioD = new javax.swing.JRadioButton();
        radioBotonDecimalD = new javax.swing.JRadioButton();
        radioBotonOctalH = new javax.swing.JRadioButton();
        radioBotonHexaH = new javax.swing.JRadioButton();
        radioBotonBinarioH = new javax.swing.JRadioButton();
        radioBotonOctalD = new javax.swing.JRadioButton();
        radioBotonDecimalH = new javax.swing.JRadioButton();
        radioBotonHexaD = new javax.swing.JRadioButton();
        etiquetaResultado = new javax.swing.JLabel();
        cajaResultado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqueta.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Ingrese el número: ");

        cajaNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroActionPerformed(evt);
            }
        });

        grupoRadioBoton1.add(radioBotonBinarioD);
        radioBotonBinarioD.setText("Binario");
        radioBotonBinarioD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonBinarioDActionPerformed(evt);
            }
        });

        grupoRadioBoton1.add(radioBotonDecimalD);
        radioBotonDecimalD.setText("Decimal");
        radioBotonDecimalD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonDecimalDActionPerformed(evt);
            }
        });

        grupoRadioBoton2.add(radioBotonOctalH);
        radioBotonOctalH.setText("Octal");
        radioBotonOctalH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonOctalHActionPerformed(evt);
            }
        });

        grupoRadioBoton2.add(radioBotonHexaH);
        radioBotonHexaH.setText("Hexadecimal");
        radioBotonHexaH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonHexaHActionPerformed(evt);
            }
        });

        grupoRadioBoton2.add(radioBotonBinarioH);
        radioBotonBinarioH.setText("Binario");

        grupoRadioBoton1.add(radioBotonOctalD);
        radioBotonOctalD.setText("Octal");
        radioBotonOctalD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonOctalDActionPerformed(evt);
            }
        });

        grupoRadioBoton2.add(radioBotonDecimalH);
        radioBotonDecimalH.setText("Decimal");

        grupoRadioBoton1.add(radioBotonHexaD);
        radioBotonHexaD.setText("Hexadecimal");
        radioBotonHexaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonHexaDActionPerformed(evt);
            }
        });

        etiquetaResultado.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        etiquetaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaResultado.setText("El resultado es: ");

        cajaResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaResultadoActionPerformed(evt);
            }
        });

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta)
                            .addComponent(cajaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBotonDecimalD)
                            .addComponent(radioBotonHexaD)
                            .addComponent(radioBotonBinarioD)
                            .addComponent(radioBotonOctalD))
                        .addGap(131, 131, 131)))
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cajaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaResultado))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBotonOctalH)
                            .addComponent(radioBotonBinarioH)
                            .addComponent(radioBotonDecimalH)
                            .addComponent(radioBotonHexaH))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta)
                    .addComponent(etiquetaResultado))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonBinarioH)
                    .addComponent(radioBotonBinarioD))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonOctalH)
                    .addComponent(radioBotonOctalD))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonDecimalH)
                    .addComponent(radioBotonDecimalD))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonHexaH)
                    .addComponent(radioBotonHexaD))
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroActionPerformed

    private void radioBotonBinarioDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonBinarioDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonBinarioDActionPerformed

    private void radioBotonOctalHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonOctalHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonOctalHActionPerformed

    private void radioBotonOctalDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonOctalDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonOctalDActionPerformed

    private void cajaResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaResultadoActionPerformed

    private void radioBotonHexaHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonHexaHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonHexaHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioBotonHexaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonHexaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonHexaDActionPerformed

    private void radioBotonDecimalDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonDecimalDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBotonDecimalDActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cajaNumero;
    private javax.swing.JTextField cajaResultado;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.ButtonGroup grupoRadioBoton1;
    private javax.swing.ButtonGroup grupoRadioBoton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton radioBotonBinarioD;
    private javax.swing.JRadioButton radioBotonBinarioH;
    private javax.swing.JRadioButton radioBotonDecimalD;
    private javax.swing.JRadioButton radioBotonDecimalH;
    private javax.swing.JRadioButton radioBotonHexaD;
    private javax.swing.JRadioButton radioBotonHexaH;
    private javax.swing.JRadioButton radioBotonOctalD;
    private javax.swing.JRadioButton radioBotonOctalH;
    // End of variables declaration//GEN-END:variables

    public Modelo getModelo(){
        return modelo;
    }
    
    public Controlador getControl(){
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public JRadioButton getRadioBotonBinarioD() {
        return radioBotonBinarioD;
    }

    public JRadioButton getRadioBotonBinarioH() {
        return radioBotonBinarioH;
    }

    public JRadioButton getRadioBotonDecimalD() {
        return radioBotonDecimalD;
    }

    public JRadioButton getRadioBotonDecimalH() {
        return radioBotonDecimalH;
    }

    public JRadioButton getRadioBotonHexaD() {
        return radioBotonHexaD;
    }

    public JRadioButton getRadioBotonHexaH() {
        return radioBotonHexaH;
    }

    public JRadioButton getRadioBotonOctalD() {
        return radioBotonOctalD;
    }

    public JRadioButton getRadioBotonOctalH() {
        return radioBotonOctalH;
    }

    public JTextField getCajaResultado() {
        return cajaResultado;
    }

    public void setCajaResultado(JTextField cajaResultado) {
        this.cajaResultado = cajaResultado;
    }

    public JTextField getCajaNumero() {
        return cajaNumero;
    }
    
    
}
