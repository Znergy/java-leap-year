import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_forNumbersDivisibleByFour_true() {
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(2016));
  }

  @Test
  public void isLeapYear_forNumbersNotDivisibleByFour_false() {
    LeapYear leapyear = new LeapYear();
    assertEquals(false, leapyear.isLeapYear(2015));
  }

  @Test
  public void isLeapYear_forNumbersDivisbleBy100_false() {
    LeapYear leapyear = new LeapYear();
    assertEquals(false, leapyear.isLeapYear(1900));
  }

  @Test
  public void isLeapYear_forNumbersDivisbleBy400_true() {
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(1200));
  }


}
