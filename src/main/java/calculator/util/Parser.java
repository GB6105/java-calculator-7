package calculator.util;

import calculator.dto.ParseResultDTO;
import java.util.regex.Pattern;

public class Parser {

  public static int[] parseStringToIntArray(String input) {
    ParseResultDTO parsedResult = Validator.validate(input);
    String customSeparator = parsedResult.customSeparator();
    String mainString = parsedResult.mainString();

    String splitRegex;
    if(customSeparator == null || customSeparator.isEmpty()){
      splitRegex = ",|:";
    }else{
      splitRegex = ",|:|" + Pattern.quote(customSeparator);
    }

    String[] tokens = mainString.split(splitRegex);
    int[] targetNumbersInt = new int[tokens.length];
    for (int i = 0; i < tokens.length; i++) {
      targetNumbersInt[i] = Integer.parseInt(tokens[i]);
    }
    return targetNumbersInt;
  }

}