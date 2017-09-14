package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    List<String> test1 = Main.fizzbuzz(-10);
    assertNull(test1);

    List<String> test2 = Main.fizzbuzz(7);
    List<String> restult = new ArrayList<>(Arrays.asList("1", "2", "fizz", "4", "buzz", "fizz", "7"));
    assertEquals(test2, restult);
  }
}
