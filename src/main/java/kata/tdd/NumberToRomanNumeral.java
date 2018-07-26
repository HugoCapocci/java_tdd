package kata.tdd;

public class NumberToRomanNumeral {

  public String toRomanNumber(int numeral) {
    String roman = "";
    for (int i = 1; i <= numeral; i++) {
      roman += "I";
    }
    return roman;
  }
}
