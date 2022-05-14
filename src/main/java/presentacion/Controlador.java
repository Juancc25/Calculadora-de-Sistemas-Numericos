package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    
    private final VistaPrincipal ventana;
    private Modelo modelo;
    
    public Controlador(VistaPrincipal aThis){
        ventana = aThis;
        modelo = ventana.getModelo();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == modelo.getVentanaInicial().getBoton1()){
            modelo.convertir();
        }
        if(e.getSource() == modelo.getVentanaInicial().getRadioBotonBinarioD()){
            modelo.getVentanaInicial().getRadioBotonBinarioH().setEnabled(false);
            modelo.getVentanaInicial().getRadioBotonOctalH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonDecimalH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonHexaH().setEnabled(true);
        }
        if(e.getSource() == modelo.getVentanaInicial().getRadioBotonOctalD()){
            modelo.getVentanaInicial().getRadioBotonOctalH().setEnabled(false);
            modelo.getVentanaInicial().getRadioBotonBinarioH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonDecimalH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonHexaH().setEnabled(true);
        }
        if(e.getSource() == modelo.getVentanaInicial().getRadioBotonDecimalD()){
            modelo.getVentanaInicial().getRadioBotonDecimalH().setEnabled(false);
            modelo.getVentanaInicial().getRadioBotonOctalH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonBinarioH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonHexaH().setEnabled(true);
        }
        if(e.getSource() == modelo.getVentanaInicial().getRadioBotonHexaD()){
            modelo.getVentanaInicial().getRadioBotonHexaH().setEnabled(false);
            modelo.getVentanaInicial().getRadioBotonOctalH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonDecimalH().setEnabled(true);
            modelo.getVentanaInicial().getRadioBotonBinarioH().setEnabled(true);
        }
    }    
}
