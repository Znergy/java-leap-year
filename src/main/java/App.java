import java.io.Console;


public class App {

  public static void main(String[] args) {

    Console myConsole = System.console();
    LeapYear leapYear = new LeapYear();
    System.out.println("Enter a year");
    int usersYear = Integer.parseInt(myConsole.readLine());
    System.out.println("Is your year a leap year? " + leapYear.isLeapYear(usersYear));
  }
}
