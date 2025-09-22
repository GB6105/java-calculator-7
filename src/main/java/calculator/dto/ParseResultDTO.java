package calculator.dto;

//public final class ParsedResult {
//  private final String customSeparator;
//  private final String mainString;
//  // record로 작성해보기
//
//  public ParsedResult(String customSeparator, String mainString) {
//    this.customSeparator = customSeparator;
//    this.mainString = mainString;
//  }
//
//  public String getCustomSeparator() {
//    return customSeparator;
//  }
//
//  public String getMainString() {
//    return mainString;
//  }
//}
public record ParseResultDTO(String customSeparator, String mainString){};
