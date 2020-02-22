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
class ActionsPanel extends JPanel{
    private CalculatorButton memoryClearButton;
    private CalculatorButton memoryRecallButton;
    private CalculatorButton memoryStoreButton;
    private CalculatorButton memoryAddButton;
    private CalculatorButton memorySubtractButton;
    private CalculatorButton undoButton;
    private CalculatorButton clearButton;
    private CalculatorButton allClearButton;
    
    
    public ActionsPanel (){
        memoryClearButton = new CalculatorButton("MC");
        memoryClearButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                CalculatorEngine.memoryClear();
        }
    });
        
        memoryRecallButton = new CalculatorButton("MR");
        memoryRecallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.memoryRecall();
            }
        });
        
        memoryStoreButton = new CalculatorButton("MS");
        memoryStoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.memoryClear();
                CalculatorEngine.memoryAdd();
            }
        });
        
        memoryAddButton = new CalculatorButton("M+");
        memoryAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.memoryAdd();
            }
        });
        
        memorySubtractButton = new CalculatorButton("M-");
        memorySubtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.memorySubtract();
            }
        });
        
        undoButton = new CalculatorButton("<-");
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.undo();
            }
        });
        
        clearButton = new CalculatorButton("C");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.clear();
            }
        });
        
        allClearButton = new CalculatorButton("AC");
        allClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculatorEngine.allClear();
            }
        });
        
        configureLayout();
    }
    
    private void configureLayout(){
        setLayout (new GridLayout(2,1));
        add(memoryClearButton);
        add(memoryRecallButton);
        add(memoryStoreButton);
        add(memoryAddButton);
        add(memorySubtractButton);
        add(undoButton);
        add(clearButton);
        add(allClearButton);
  
        
    }
}
