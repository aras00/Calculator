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
class OperationsPanel extends JPanel{
    
    private CalculatorButton divideButton;
    private CalculatorButton multiplyButton;
    private CalculatorButton minusButton;
    private CalculatorButton plusButton;
    private CalculatorButton sqrtButton;
    private CalculatorButton percentButton;
    private CalculatorButton resultButton;
    
    
    
    OperationsPanel(){
        
        divideButton = new CalculatorButton("/");
        divideButton.addActionListener (new ActionListener(){
            @Override
                public void actionPerformed (ActionEvent e){
                    CalculatorEngine.operation(OperationsEnum.DIVIDE);
                }
        });
        
        multiplyButton = new CalculatorButton("*");
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.operation(OperationsEnum.MULTIPLY);
                
            }
        });
        
        minusButton = new CalculatorButton("-");
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.operation(OperationsEnum.MINUS);
            }
        });
        
        plusButton = new CalculatorButton("+");
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.operation(OperationsEnum.PLUS);
            }
        });
        
//        sqrtButton = new CalculatorButton("sqrt");
//        sqrtButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                CalculatorEngine.operation(OperationsEnum.SQRT);
//            }
//        });
//        
//        percentButton = new CalculatorButton("%");
//        percentButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                CalculatorEngine.operation(OperationsEnum.PERCENT);
//            }
//        });
//        
        resultButton = new CalculatorButton("=");
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.operation(OperationsEnum.RESULT);
            }
        });
        
        configureLayout();
    }
    
    public void click(int c) {
        switch(c) {
            case 43:
                plusButton.doClick();
                break;
            case 45:
                minusButton.doClick();
                break;
            case 42:
                multiplyButton.doClick();
                break;
            case 47:
                divideButton.doClick();
                break;
            case 37:
                percentButton.doClick();
                break;
            case 61: 
                resultButton.doClick();
                break;
            case 10:
                resultButton.doClick();
                break;
        }
    }
    
    private void configureLayout(){
        setLayout(new GridBagLayout());
        
        add(divideButton, new GridBagConstraints(0, 0, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        
        add(multiplyButton, new GridBagConstraints(0, 1, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        
        add(minusButton, new GridBagConstraints(0, 2, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        
        add(plusButton, new GridBagConstraints(0, 3, 1, 1, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
        
//        add(sqrtButton, new GridBagConstraints(1, 0, 1, 1, 0.1, 0.1,
//                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
//                new Insets(0, 0, 0, 0), 0, 0));
//        
//        add(percentButton, new GridBagConstraints(1, 1, 1, 1, 0.1, 0.1,
//                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
//                new Insets(0, 0, 0, 0), 0, 0));
//        
        add(resultButton, new GridBagConstraints(1, 3, 1, 2, 0.1, 0.1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 0, 0), 0, 0));
    }
}
