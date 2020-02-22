/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;



/**
 *
 * @author Aras
 */
class CalculatorEngine {
    private static Double memory;
    private static Double temp;
    private static Double temp2;
    private static OperationsEnum currentSign;
    private static OperationsEnum lastOperation;
    private static String v2;
    
    public static void calculatorEngine() {
        memory = 0.00;
        temp = 0.00;
        temp2 = 0.00;
        lastOperation = OperationsEnum.UNDEFINED;

    }
    
    public static void memoryClear(){
        memory = 0.00;
        CalculatorPanel.memoryScreen.setText("");
    }
    
    public static void memoryRecall() {
        CalculatorPanel.mainScreen.setText((memory).toString());
    }
    
    public static void memoryAdd() {
        memory = memory + new Double (CalculatorPanel.mainScreen.getText());
        CalculatorPanel.memoryScreen.setText("M");
        System.out.println(memory);
    }
    
    public static void memorySubtract() {
        memory -= new Double(CalculatorPanel.mainScreen.getText());
        CalculatorPanel.memoryScreen.setText("");
    }
    
    public static void undo() {
        v2 = "";
        for (int i = 0; i < DigitsPanel.v1.length()-1; i++)
            v2 += DigitsPanel.v1.charAt(i);
        DigitsPanel.v1 = v2;
        CalculatorPanel.mainScreen.setText(DigitsPanel.v1);

    }
    
    public static void clear() {
        CalculatorPanel.mainScreen.setText("0.0");
        DigitsPanel.v1 = "";
    }
    
    public static void allClear() {
        clear();
        temp = 0.0;
        lastOperation = OperationsEnum.UNDEFINED;
    }
    
    public static void operation(OperationsEnum currentOperation) {
        currentSign = currentOperation;
        if (lastOperation != OperationsEnum.UNDEFINED){
         
            switch (currentSign) {
                case PLUS:
                    temp += new Double(CalculatorPanel.mainScreen.getText());
                    CalculatorPanel.mainScreen.setText(temp.toString());
                    DigitsPanel.v1 = "";
                    lastOperation = OperationsEnum.PLUS;
                    break;

                case MINUS:
                    temp -= new Double(CalculatorPanel.mainScreen.getText());
                    CalculatorPanel.mainScreen.setText(temp.toString());
                    DigitsPanel.v1 = "";
                    lastOperation = OperationsEnum.MINUS;
                    break;

                case MULTIPLY:
                    temp *= new Double(CalculatorPanel.mainScreen.getText());
                    CalculatorPanel.mainScreen.setText(temp.toString());
                    DigitsPanel.v1 = "";
                    lastOperation = OperationsEnum.MULTIPLY;
                    break;

                case DIVIDE:
                    temp /= new Double(CalculatorPanel.mainScreen.getText());
                    CalculatorPanel.mainScreen.setText(temp.toString());
                    DigitsPanel.v1 = "";
                    lastOperation = OperationsEnum.DIVIDE;
                    break;

//                case SQRT:
//                    temp = Math.sqrt (new Double(CalculatorPanel.mainScreen.getText()));
//                    CalculatorPanel.mainScreen.setText(temp.toString());
//                    DigitsPanel.v1 = "";
//                    //operation(lastOperation);
//                   // lastOperation = OperationsEnum.SQRT;
//                    break;
//
//                case PERCENT:
//                    temp2 = new Double(CalculatorPanel.mainScreen.getText()) / 100;
//                    CalculatorPanel.mainScreen.setText(temp2.toString());
//                    DigitsPanel.v1 = "";
//                    lastOperation = OperationsEnum.PERCENT;
//                    break;

                case RESULT:
                    operation(lastOperation);
                    CalculatorPanel.mainScreen.setText(temp.toString());
                    lastOperation = OperationsEnum.UNDEFINED;
                    break;
               
        }
        
        }
//        else if (currentSign == OperationsEnum.SQRT){
//            temp = Math.sqrt(new Double(CalculatorPanel.mainScreen.getText()));
//            CalculatorPanel.mainScreen.setText(temp.toString());
//            DigitsPanel.v1 = "";
//        }
        else {
            temp = new Double(CalculatorPanel.mainScreen.getText());
            lastOperation = currentOperation;
            DigitsPanel.v1 = "";
        }

    }
    

}
