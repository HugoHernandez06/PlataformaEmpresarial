/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plataformas;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Invertir {
    
    public static void main(String[]args){
        
        String  N1 = (JOptionPane.showInputDialog("Ingrese el valor del Numero a invertir"));
        Numero n1 = new Numero(N1);
        
        for (int i =n1.getNum().length()-1;i>=0;i--){
            n1.setNum(n1.getNum()+n1.getNum().charAt(i));
        }
        System.out.println("El numero convertido es " + n1.getNum());
    }
}
