package laboratorio12;

import javax.swing.*;

public class Bonus {
    //las siguientes lineas son para definir las variables
    int numer;
    int i,neg=0,par=0;
    
    public void entrada(){
        for(i=0;i<5;i++){// En esta linea de codigo lo que hace es iterar el número de veces (5) que se ingresa un número
            
            numer=ingresarDatos("digite 1 numero");//Código para ingresar un número
            if(numer%2==0){//Linea de codigo que verifica que un número es par
                par++;
            }
            if(numer<0){//Linea de codigo que verifica que un número que sea menor que 0 es negativo
                neg++;
            }
        }
        JOptionPane.showMessageDialog(null,"el numero de numeros pares es: "+par+"\n"+" y el numero de numero negativos es: "+neg);//Linea de Codigo que mostrará mediante un mensaje el final del proceso realizado 
        
    }
    
    public static int ingresarDatos(String mensaje){
        //las lineas 27 y 28 se definen las variables
        String cadena;
        int valor;
        cadena=JOptionPane.showInputDialog(null,mensaje);// Se muestra el mensaje definido que se definió como parametro y luego se pide el input del usuario
        valor=Integer.parseInt(cadena);//El valor ingresado por el usuario lo convierte en entero
        return valor;//retorna el valor ingresado por el usuario convertido en entero
    }
    
}
