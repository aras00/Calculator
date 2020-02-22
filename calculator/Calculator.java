/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Aras
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int userScreenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int userScreenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        
        JFrame calculatorFrame = new JFrame ("Calculator");
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setResizable(false);
        calculatorFrame.setSize(new Dimension (300, 300));
        calculatorFrame.setLocation((userScreenWidth-calculatorFrame.getWidth())/2, (userScreenHeight - calculatorFrame.getHeight()) / 2);
        
        CalculatorPanel calculatorPanel = new CalculatorPanel();
        calculatorFrame.getContentPane().add(BorderLayout.CENTER, calculatorPanel);
        


        
        calculatorFrame.setVisible(true);
        
    }
    
}
