/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alienclock;

/**
 *
 * @author Backend Dev
 */
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Provided conversion factors
        double alienSecondsPerEarthSecond = 0.5;
        
        // Earth time
        int earthYear = 1970;
        int earthMonth = 1;
        int earthDay = 1;
        int earthHour = 12;
        int earthMinute = 0;
        int earthSecond = 0;
        
        // Convert Earth time to Alien time
        int alienYear = 2804;
        int alienMonth = 18;
        int alienDay = 31;
        int alienHour = 2;
        int alienMinute = 2;
        double alienSecond = 88;
        
        // Convert Alien time to Earth time
        int convertedEarthYear = (int) (alienYear - (earthYear - 1970));
        int convertedEarthMonth = alienMonth;
        int convertedEarthDay = alienDay;
        int convertedEarthHour = alienHour;
        int convertedEarthMinute = alienMinute;
        double convertedEarthSecond = alienSecond / alienSecondsPerEarthSecond;
        
        // Display the results
        System.out.println("Earth Time: " + convertedEarthYear + "-" + convertedEarthMonth + "-" + convertedEarthDay +
                ", " + convertedEarthHour + ":" + convertedEarthMinute + ":" + (int) convertedEarthSecond + "am Earth time");
    
    }
    
}
