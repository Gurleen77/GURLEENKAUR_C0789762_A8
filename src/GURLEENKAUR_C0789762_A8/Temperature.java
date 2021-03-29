package GURLEENKAUR_C0789762_A8;

import javax.swing.*;
import java.util.*;

public class Temperature {
    static int  n = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number of days \n"));
    String[] days = new String[n];
    double[] temp = new double[n];
    double[] speed = new double[n];

    public static void main(String[] args) {
        Temperature tem = new Temperature();
        for (int i = 0; i< Temperature.n; i++) {
            String day = tem.getDay();
            double temperature = tem.getTemperature(day);
            double speed = tem.getWindSpeed(day);
            tem.temp[i] = temperature;
            tem.days[i] = day;
            tem.speed[i] = speed;
            System.out.println(day);
            System.out.println(temperature);
            System.out.println(speed);
        }
        TemperatureCheck.testTemperature(tem.days,tem.temp,tem.speed);
        System.out.println(Arrays.toString(tem.temp));
        System.out.println(Arrays.toString(tem.speed));
        System.out.println(Arrays.toString(tem.days));
    }
    public double getTemperature(String day){
        double temp = 0;
        temp = Double.parseDouble(JOptionPane.showInputDialog("Please enter the temperature of the " + day));
        return temp;
    }
    public String getDay(){
        String  day = "";
        day = JOptionPane.showInputDialog("Please enter the Day: ");
        return day;
    }
    public double getWindSpeed(String day){
        double speed = 0;
        speed = Double.parseDouble(JOptionPane.showInputDialog("Please enter the speed of the wind of the day " + day));
        return speed;
    }
}
