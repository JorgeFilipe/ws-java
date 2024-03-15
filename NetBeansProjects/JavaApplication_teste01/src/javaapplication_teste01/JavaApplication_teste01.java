/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication_teste01;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class JavaApplication_teste01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Informe seu nome:");
        JOptionPane.showMessageDialog(null, "Olá "+nome+"!");
    }
    
}
