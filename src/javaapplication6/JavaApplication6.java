/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Darlin
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num, dolares, euros, yanes;
        char operacion = 0;
        float d = 7.75f;
        float e = 9.15f;
        float y = 0.070f;
        
        var nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a convertir")); //muestra en pantalla un cuadro de dialogo
        operacion = JOptionPane.showInputDialog("Para convertir a Dolares ingrese *a*, " 
                + "para convertir a Euros ingrese *b*, "
                + "para convertir a Yanes ingrese *c*").charAt(0); //el ususario seleccionará la opcion 
        
        switch (operacion){
            case 'a': dolares = num*d; 
            JOptionPane.showMessageDialog(null,"Hola " + nombre + " convirtió " + num + " igual a " + dolares + " dolares");
            break;
            case 'b': euros = num *e;
            JOptionPane.showMessageDialog(null, "Hola " + nombre + " convirtió " + num + " igual a " + euros + " euros");
            break;
            case 'c': yanes = num * y;
            JOptionPane.showMessageDialog(null, "Hola " + nombre + " convirtió " + num + " igual a " + yanes + " yanes");
            break;
        }
    }
}
