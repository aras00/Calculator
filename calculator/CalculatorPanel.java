/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Aras
 */
class CalculatorPanel extends JPanel{
   public static CalculatorScreen mainScreen;
   public static  CalculatorScreen memoryScreen;
   private ActionsPanel actionsPanel;
   private DigitsPanel digitsPanel;
   private OperationsPanel operationsPanel;
   private CalculatorEngine calculatorEngine;
   
   

    
   
   public CalculatorPanel(){
       memoryScreen = new CalculatorScreen();
       mainScreen = new CalculatorScreen();
       actionsPanel = new ActionsPanel();
       digitsPanel = new DigitsPanel();
       operationsPanel = new OperationsPanel();
       calculatorEngine = new CalculatorEngine();
       
       
       CalculatorEngine.calculatorEngine();
       
              
       memoryScreen.addKeyListener(new KeyAdapter(){
         @Override
         public void keyTyped(KeyEvent e) {
            e.consume();
         }
   });
        
       mainScreen.addKeyListener(new KeyAdapter() {
           @Override
           public void keyTyped(KeyEvent e) {
                int i = e.getKeyChar();
                if (i >=48 && i<=57 ){
                    int j = Integer.parseInt("" + e.getKeyChar());
                    digitsPanel.digitsclick(j);
                    e.consume();
                }
                else if (i == '.') {
                   digitsPanel.dotclick();
                   e.consume();
               }
                else if (i == 42 || i == 43 || i == 45 || i == 47 || i == 10 || i == 37 || i == 10){
                    operationsPanel.click(i);
                    e.consume();
                }
                else{
                    e.consume();
           }
            
           }
       });
       

       
       configureLayout();
   }
   
   private void configureLayout(){
       setLayout(new GridBagLayout());
       
              
       add(mainScreen, new GridBagConstraints(0, 0, 5, 1, 0.1, 0.1,
               GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
               new Insets(0, 0, 0, 0), 0, 0));
       
       add(memoryScreen, new GridBagConstraints(4, 1, 1, 1, 0.1, 0.1,
               GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
               new Insets(0, 0, 0, 0), 0, 0));
       
       add(actionsPanel, new GridBagConstraints(0, 2, 5, 1, 0.1, 0.1,
               GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
               new Insets(0, 0, 0, 0), 0, 0));
       
       add(digitsPanel, new GridBagConstraints(0, 3, 2, 1, 0.1, 0.1,
               GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
               new Insets(0, 0, 0, 0), 0, 0));
       
       add(operationsPanel, new GridBagConstraints(3, 3, 2, 1, 0.1, 0.1,
               GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
               new Insets(0, 0, 0, 0), 0, 0));
       
       
   }
    
}
