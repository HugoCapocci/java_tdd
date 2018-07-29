package kata.tdd;

import kata.tdd.ConverterRef;

public class NumberToRomanNumeral {

  public static ConverterRef[] refs = {
    new ConverterRef(50, "L"),
    new ConverterRef(40, "XL"),
    new ConverterRef(10, "X"),
    new ConverterRef(9, "IX"),
    new ConverterRef(5, "V"),
    new ConverterRef(4, "IV"),
    new ConverterRef(1, "I")
  };

  public String toRomanNumber(int numeral) {
    return toRomanNumber(numeral, 0);
  }

  public String repeat(String romanChar, int occurences) {
    String line = "";
    for (int i = 0; i < occurences; i++) {
      line += romanChar;
    }
    return line;
  }

  public String toRomanNumber(int numeral, int refIndex) {
    if (refIndex >= refs.length) { return ""; }
    String roman = "";
    ConverterRef ref = refs[refIndex];

    if (numeral == ref.numeral) {
      return ref.roman;
    } else if(numeral > ref.numeral) {
      int occurences = numeral / ref.numeral;
      int nextNumeral = numeral - occurences * ref.numeral;
      roman = repeat(ref.roman, occurences);
      return roman + toRomanNumber(nextNumeral, refIndex + 1);
    }
    return toRomanNumber(numeral, refIndex + 1);
  }
}
