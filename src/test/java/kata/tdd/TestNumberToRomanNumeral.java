package kata.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import kata.tdd.NumberToRomanNumeral;

public class TestNumberToRomanNumeral {

  NumberToRomanNumeral numberToRomanNumeral;

  @Before
  public void setUp() {
    numberToRomanNumeral = new NumberToRomanNumeral();
  }

  @Test
  public void testConvert1TtoI() {
    assertEquals("I", numberToRomanNumeral.toRomanNumber(1));
  }

  @Test
  public void testConvert2TtoII() {
    assertEquals("II", numberToRomanNumeral.toRomanNumber(2));
  }

  @Test
  public void testConvert3TtoIII() {
    assertEquals("III", numberToRomanNumeral.toRomanNumber(3));
  }

  @Test
  public void testConvert4TtoIV() {
    assertEquals("IV", numberToRomanNumeral.toRomanNumber(4));
  }

  @Test
  public void testConvert5TtoV() {
    assertEquals("V", numberToRomanNumeral.toRomanNumber(5));
  }
}
