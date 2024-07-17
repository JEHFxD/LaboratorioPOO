package laboratorio13;

import javax.swing.JOptionPane;

public class FlechaPrincipal {

    Flecha flecha1,flecha2,flecha3;
     
   
    public static void main (String args[]){
        FlechaPrincipal Arrow=new FlechaPrincipal();
    }
    public FlechaPrincipal(){
        flecha1=new Flecha();
        flecha1.construirFlecha();
        flecha1.imprimirEspacio();
        
        flecha2=new Flecha();
        flecha2.longitud=34;
        flecha2.color="rojo";
        flecha2.construirFlecha();
        flecha2.imprimirEspacio();
        
        flecha3=new Flecha(12,"negro");
        flecha3.construirFlecha();
        flecha3.imprimirEspacio();
        
        String color;
        int size=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud de la flecha"));
        color = JOptionPane.showInputDialog("Ingrese un color");
         
        Flecha flecha4 = new Flecha(size,color);
        flecha4.construirFlecha();
        flecha4.imprimirEspacio();
    }
}
