/*
 * Ferris D.
 * 14/09/2018
 * This programm is for the summative quiz
 */

package unit.pkg1.activity.pkg3.summative;

import javax.swing.JOptionPane;

/**
 * @author fedie2562
 */
public class Unit1Activity3Summative {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Ask user for input on their name
        String name = JOptionPane.showInputDialog("Please enter your full name");
        Double number1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter your first number"));
        Double number2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter your second number"));
        name = name.toUpperCase(); // Makes it upper case
        System.out.println(name.substring(0, name.indexOf(" ")));
        System.out.println("Sum = "+ (number1 + number2));
        System.out.println("Product = "+(number1 * number2));
        System.out.println("Difference = "+(number1 - number2));
        System.out.println("Quotient = "+(number1 / number2));
        JOptionPane.showMessageDialog(null, name.substring(0, name.indexOf(" "))+"\n"
        +"Sum = "+(number1 + number2)+"\n"+"Product ="
        +(number1 * number2)+"\n"+"Difference ="+(number1 - number2)
        +"\n"+"Quotient ="+(number1 / number2)); // Message Display
    }
    
}
