package presentacion;

public class Modelo {
    private VistaPrincipal ventanaInicial;
    
    public void iniciar(){
        //getVentanaInicial().setSize(500,500);
        getVentanaInicial().setVisible(true);
    }
    
    //*********
    
    public VistaPrincipal getVentanaInicial(){
        if(ventanaInicial == null){
            ventanaInicial = new VistaPrincipal(this);
        }
        return ventanaInicial;
    }
}
