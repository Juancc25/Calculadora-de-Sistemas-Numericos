package presentacion;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class VistaPrincipal extends javax.swing.JFrame {

    private final Modelo modelo;
    private Controlador control;
    
    public VistaPrincipal(Modelo m) {
        modelo = m;
        initComponents();
        asignarEventos();
        insertarLogo();
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
        boton1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Sistemas Numéricos");

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etiqueta.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiqueta.setForeground(new java.awt.Color(255, 255, 255));
        etiqueta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta.setText("Ingrese el número: ");

        radioBotonBinarioD.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton1.add(radioBotonBinarioD);
        radioBotonBinarioD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonBinarioD.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonBinarioD.setText("Binario");

        radioBotonDecimalD.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton1.add(radioBotonDecimalD);
        radioBotonDecimalD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonDecimalD.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonDecimalD.setText("Decimal");

        radioBotonOctalH.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton2.add(radioBotonOctalH);
        radioBotonOctalH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonOctalH.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonOctalH.setText("Octal");

        radioBotonHexaH.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton2.add(radioBotonHexaH);
        radioBotonHexaH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonHexaH.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonHexaH.setText("Hexadecimal");

        radioBotonBinarioH.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton2.add(radioBotonBinarioH);
        radioBotonBinarioH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonBinarioH.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonBinarioH.setText("Binario");

        radioBotonOctalD.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton1.add(radioBotonOctalD);
        radioBotonOctalD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonOctalD.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonOctalD.setText("Octal");

        radioBotonDecimalH.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton2.add(radioBotonDecimalH);
        radioBotonDecimalH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonDecimalH.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonDecimalH.setText("Decimal");

        radioBotonHexaD.setBackground(new java.awt.Color(102, 102, 102));
        grupoRadioBoton1.add(radioBotonHexaD);
        radioBotonHexaD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        radioBotonHexaD.setForeground(new java.awt.Color(255, 255, 255));
        radioBotonHexaD.setText("Hexadecimal");

        etiquetaResultado.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiquetaResultado.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaResultado.setText("El resultado es: ");

        boton1.setText("Convertir");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(cajaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaResultado)
                            .addComponent(cajaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiqueta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBotonDecimalD)
                            .addComponent(radioBotonHexaD)
                            .addComponent(radioBotonBinarioD)
                            .addComponent(radioBotonOctalD))
                        .addGap(137, 137, 137)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBotonOctalH)
                            .addComponent(radioBotonBinarioH)
                            .addComponent(radioBotonDecimalH)
                            .addComponent(radioBotonHexaH))
                        .addContainerGap(51, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta)
                    .addComponent(etiquetaResultado))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonBinarioD)
                    .addComponent(radioBotonBinarioH))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonOctalD)
                    .addComponent(radioBotonOctalH))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonDecimalD)
                    .addComponent(radioBotonDecimalH))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBotonHexaD)
                    .addComponent(radioBotonHexaH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JTextField cajaNumero;
    private javax.swing.JTextField cajaResultado;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.ButtonGroup grupoRadioBoton1;
    private javax.swing.ButtonGroup grupoRadioBoton2;
    private javax.swing.JLabel logo;
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

    private void insertarLogo(){
        ImageIcon imagen1 = new ImageIcon("Logo.png");
        
        getLogo().setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(getLogo().getWidth(),getLogo().getHeight(),Image.SCALE_SMOOTH)));
    }
    
    public Modelo getModelo(){
        return modelo;
    }
    
    public Controlador getControl(){
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public JLabel getLogo() {
        return logo;
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
    
    private void asignarEventos() {
        boton1.addActionListener(getControl());
    }
}
