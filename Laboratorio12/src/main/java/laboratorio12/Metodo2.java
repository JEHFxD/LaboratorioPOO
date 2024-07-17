package laboratorio12;

import javax.swing.*;

public class Metodo2 {
    
    public static void main (String args []){
  
        double ladoA;
        double ladoB;
        
        ladoA = ingresarDatos ("Ingrese la longitud del lado A: ");
        ladoB = ingresarDatos ("Ingrese la longitud del lado B: ");
        
        calcularArea (ladoA,ladoB);
    }
    
    public static double ingresarDatos (String mensaje){
        
        String cadena;
        double valor;
        
        cadena=JOptionPane.showInputDialog(null, mensaje);
        valor = Double.parseDouble (cadena);
        
        return valor;
    }
    
    public static void calcularArea (double a , double b){
        
        double resultado;
        
        resultado = a*b;
        
        JOptionPane.showMessageDialog(null, "El resultado es:_"+ resultado);
    }
    
}
