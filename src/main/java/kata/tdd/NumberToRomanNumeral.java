package kata.tdd;

import kata.tdd.ConverterRef;

public class NumberToRomanNumeral {

  public static ConverterRef[] refs = {
    new ConverterRef(1, "I"),
    new ConverterRef(4, "IV"),
    new ConverterRef(5, "V")
  };

  public String toRomanNumber(int numeral) {
    String roman = "";

    for(ConverterRef ref: refs ) {
      if(numeral > ref.numeral) {
        for (int i = 1; i <= numeral; i++) {
          roman += ref.roman;
        }
      } else if (numeral == ref.numeral) {
        roman = ref.roman;
      }
    }

    return roman;
  }
}
