import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_divisibleByFour_true() {
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(2016));
  }

  @Test
  public void isLeapYear_notDivisibleByFour_false() {
    LeapYear leapyear = new LeapYear();
    assertEquals(false, leapyear.isLeapYear(2015));
  }

  @Test
  public void isLeapYear_divisbleBy400_true() {
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(1200));
  }


}
