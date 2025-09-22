package calculator.controller;

import calculator.service.CalculatorService;
import calculator.util.Parser;
import calculator.view.CalculatorView;

public class CalculatorController {

  private final CalculatorView calculatorView;

  public CalculatorController(CalculatorView calculatorView) {
    this.calculatorView = calculatorView;
  }

  public void start() {
    try {
      String input = calculatorView.readInput();
      int[] targetNumbers = Parser.parseStringToIntArray(input);
      int result = CalculatorService.calculate(targetNumbers);
      calculatorView.printResult(result);
    } catch (IllegalAccessError e) {
      throw new IllegalAccessError(e.getMessage());
    }
  }
}
