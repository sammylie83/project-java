

package alienclock;

import java.util.Scanner;
/**
 *
 * @author Backend Dev
 */
public class AlienClock {
  private static int alienYear = 1;
    private static int alienMonth = 1;
    private static int alienDay = 1;
    private static int alienHour = 0;
    private static int alienMinute = 0;
    private static int alienSecond = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display Alien clock
            displayAlienClock();

            System.out.println("Options:");
            System.out.println("1. Set Alien Date and Time");
            System.out.println("2. Display Earth Date and Time");
            System.out.println("3. Set Alarm");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                setAlienDateAndTime(scanner);
            } else if (choice == 2) {
                displayEarthDateAndTime();
            } else if (choice == 3) {
                setAlarm(scanner);
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayAlienClock() {
        System.out.println("Alien Clock: Year " + alienYear + ", Month " + alienMonth + ", Day " + alienDay +
                ", Hour " + alienHour + ", Minute " + alienMinute + ", Second " + alienSecond);
        alienSecond++;
        if (alienSecond >= 90) {
            alienSecond = 0;
            alienMinute++;
            if (alienMinute >= 90) {
                alienMinute = 0;
                alienHour++;
                if (alienHour >= 90) {
                    alienHour = 0;
                    alienDay++;
                    if (alienDay > getDaysInAlienMonth(alienMonth)) {
                        alienDay = 1;
                        alienMonth++;
                        if (alienMonth > 18) {
                            alienMonth = 1;
                            alienYear++;
                        }
                    }
                }
            }
        }
    }

    private static void setAlienDateAndTime(Scanner scanner) {
        System.out.print("Enter Alien Year: ");
        alienYear = scanner.nextInt();
        System.out.print("Enter Alien Month: ");
        alienMonth = scanner.nextInt();
        System.out.print("Enter Alien Day: ");
        alienDay = scanner.nextInt();
        System.out.print("Enter Alien Hour: ");
        alienHour = scanner.nextInt();
        System.out.print("Enter Alien Minute: ");
        alienMinute = scanner.nextInt();
        System.out.print("Enter Alien Second: ");
        alienSecond = scanner.nextInt();
    }

    private static int getDaysInAlienMonth(int month) {
        int[] daysInMonth = {
            44, 42, 48, 40, 48, 44, 40, 44, 42, 40, 40, 42, 44, 48, 42, 40, 44, 38
        };
        return daysInMonth[month - 1];
    }

    private static void displayEarthDateAndTime() {
        // Calculate Earth's date and time based on Alien time
        int earthMinutes = alienSecond * 2;
        int earthHours = alienMinute * 2;
        int earthDays = alienHour * 2;
        int earthMonths = alienDay;
        int earthYears = alienYear;

        System.out.println("Earth Date and Time: Year " + earthYears + ", Month " + earthMonths +
                ", Day " + earthDays + ", Hour " + earthHours + ", Minute " + earthMinutes);
    }

    private static void setAlarm(Scanner scanner) {
        System.out.print("Enter the Earth Year for the alarm: ");
        int earthYear = scanner.nextInt();
        System.out.print("Enter the Earth Month for the alarm: ");
        int earthMonth = scanner.nextInt();
        System.out.print("Enter the Earth Day for the alarm: ");
        int earthDay = scanner.nextInt();
        System.out.print("Enter the Earth Hour for the alarm: ");
        int earthHour = scanner.nextInt();
        System.out.print("Enter the Earth Minute for the alarm: ");
        int earthMinute = scanner.nextInt();

        System.out.println("Alarm set for Earth Date and Time: Year " + earthYear + ", Month " + earthMonth +
                ", Day " + earthDay + ", Hour " + earthHour + ", Minute " + earthMinute);
    }
}

