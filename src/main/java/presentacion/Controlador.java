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
    }    
}
