import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
  public void isLeapYear_divisibleByFour_true() {
    LeapYear leapyear = new LeapYear();
    assertEquals(true, leapyear.isLeapYear(2016));
  }
}
