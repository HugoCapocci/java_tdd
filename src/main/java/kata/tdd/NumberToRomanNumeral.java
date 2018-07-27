package kata.tdd;

import kata.tdd.ConverterRef;

public class NumberToRomanNumeral {

  public static ConverterRef[] refs = {
    new ConverterRef(5, "V"),
    new ConverterRef(4, "IV"),
    new ConverterRef(1, "I")
  };

  public String toRomanNumber(int numeral) {
    return toRomanNumber(numeral, 0);
  }

  public String toRomanNumber(int numeral, int refIndex) {
    String roman = "";
    ConverterRef ref = refs[refIndex];

    if (numeral == ref.numeral) {
      return ref.roman;
    } else if(numeral > ref.numeral) {
      for (int i = 1; i <= numeral; i++) {
        roman += ref.roman;
      }
      return roman;
    }
    return toRomanNumber(numeral, refIndex + 1);
  }
}
