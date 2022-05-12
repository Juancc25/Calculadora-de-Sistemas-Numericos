package presentacion;

import Logica.Operadora;
import javax.swing.JRadioButton;

public class Modelo {
    private VistaPrincipal ventanaInicial;
    private Operadora miSistema;
    
    public void iniciar(){
        getVentanaInicial().setVisible(true);
    }
    
    public void convertir(){
        obtenerDatos();
    }
    
    public void obtenerDatos(){
        String baseDesde = "", baseHasta = "", dato;
        
        if(radioBotonSeleccionado(ventanaInicial.getRadioBotonBinarioD()) == true){
            baseDesde = "Binario";
        }else if(radioBotonSeleccionado(ventanaInicial.getRadioBotonOctalD()) == true){
            baseDesde = "Octal";
        }else if(radioBotonSeleccionado(ventanaInicial.getRadioBotonDecimalD()) == true){
            baseDesde = "Decimal";
        }else if(radioBotonSeleccionado(ventanaInicial.getRadioBotonHexaD()) == true){
            baseDesde = "Hexa";
        } 
        
        if(radioBotonSeleccionado(ventanaInicial.getRadioBotonBinarioH()) == true){
            baseHasta = "Binario";
        }else if(radioBotonSeleccionado(ventanaInicial.getRadioBotonOctalH()) == true){
            baseHasta = "Octal";
        }else if(radioBotonSeleccionado(ventanaInicial.getRadioBotonDecimalH()) == true){
            baseHasta = "Decimal";
        }else if(radioBotonSeleccionado(ventanaInicial.getRadioBotonHexaH()) == true){
            baseHasta = "Hexa";
        }
        
        dato = ventanaInicial.getCajaNumero().getText();
        
        ventanaInicial.getCajaResultado().setText(getMiSistema().conversion(baseDesde, baseHasta, dato));
    }
    
    private boolean radioBotonSeleccionado(JRadioButton radioBoton){
        return radioBoton.isSelected();
    }
    
    //*********
    
    public VistaPrincipal getVentanaInicial(){
        if(ventanaInicial == null){
            ventanaInicial = new VistaPrincipal(this);
        }
        return ventanaInicial;
    }
    
    public Operadora getMiSistema() {
        if(miSistema == null){
            miSistema = new Operadora();
        }
        return miSistema;
    }
}
