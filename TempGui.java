import javax.swing.*;

public class TempGui {

    public static void main(String[] args) {
        String fString;
        Double fahrenheit, celcius;

        fString = JOptionPane.showInputDialog("Enter the Temperature in fahrenheit:");
        fahrenheit = Double.parseDouble(fString);
        celcius = (fahrenheit - 32) * 5.0/9.0;

        JOptionPane.showMessageDialog(null, "The temperature in celcius is: " + celcius);
    }
}