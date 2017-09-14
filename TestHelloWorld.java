package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

  private Main fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new Main();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void checkArray() throws Exception {
    String[] test1 = Main.fizzbuzz(-10);
    assertNull(test1);

    String[] test2 = Main.fizzbuzz(7);
    String[] restult = new String [] {"1", "2", "fizz", "4", "buzz", "fizz", "7"};
    assertArrayEquals(test2, restult);
  } 
}
