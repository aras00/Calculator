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
class DigitsPanel extends JPanel{
    private CalculatorButton[] digitsButton;
    private CalculatorButton dotButton;
    public static String v1; 
    private static Boolean dotAllowed;
    
    
    DigitsPanel(){
        
        v1 = "";

        
         digitsButton = new CalculatorButton[10];
         for (int i = 0; i < 10; i++){
             digitsButton[i] = new CalculatorButton(Integer.toString(i));
             int j = i;
             digitsButton[i].addActionListener (new ActionListener(){
                @Override
                    public void actionPerformed(ActionEvent e){
                        v1 += Integer.toString(j);
                        CalculatorPanel.mainScreen.setText(v1);
                    }
            });
        }
         dotButton = new CalculatorButton(".");
            dotButton.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    dotAllowed = true;
                    for (int i = 0; i < v1.length(); i++ ){
                         if (v1.charAt(i) == '.')
                            dotAllowed = false;
                    }
                    if (dotAllowed == true) {
                        v1 += ".";
                        CalculatorPanel.mainScreen.setText(v1);
                    }    
                    }
                
            });
            
  

    configureLayout();
    
    }
    
    public void digitsclick (int i){
        digitsButton[i].doClick();
    }
    
    public void dotclick() {
        dotButton.doClick();
    }
    
    private void configureLayout(){
        setLayout (new GridBagLayout());
        
        add(digitsButton[7], new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[8], new GridBagConstraints(1, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[9], new GridBagConstraints(2, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[4], new GridBagConstraints(0, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[5], new GridBagConstraints(1, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[6], new GridBagConstraints(2, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[1], new GridBagConstraints(0, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[2], new GridBagConstraints(1, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[3], new GridBagConstraints(2, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(digitsButton[0], new GridBagConstraints(0, 4, 2, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));

        add(dotButton, new GridBagConstraints(2, 4, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
    }

//    private class ButtonPressed implements KeyListener{
//
//        @Override
//        public void keyTyped(KeyEvent ke) {
//            if (ke.getKeyChar() == '1')
//                digitsButton[1].doClick();
//        }
//
//        @Override
//        public void keyPressed(KeyEvent ke) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//
//        @Override
//        public void keyReleased(KeyEvent ke) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
//        
//    }
    
}
