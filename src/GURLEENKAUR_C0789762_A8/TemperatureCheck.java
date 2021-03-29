package GURLEENKAUR_C0789762_A8;

import javax.swing.*;

public class TemperatureCheck {
    public static void testTemperature(String[] days, double[] temp, double[] speed){
        for (int i = 0; i < days.length; i++){
            double temperatureFeel = temp[i] - (temp[i] * speed[i])/100;
            JOptionPane.showMessageDialog(null,
                    "The temperature feel " + temperatureFeel + " like on " + days[i]);
        }
    }
}
