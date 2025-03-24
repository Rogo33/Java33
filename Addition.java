/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.addition;

/**
 *
 * @author Rodrigo
 */
import javax.swing.JOptionPane;
public class Addition {
    public static void main(String[] args) {
        String firstNumber = 
          JOptionPane.showInputDialog("Insira o primeiro Número");
        String secondNumber =
          JOptionPane.showInputDialog("Insira o segundo Número");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
          int sum = number1 + number2;
          JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two Integers",JOptionPane.PLAIN_MESSAGE);
    }
}
