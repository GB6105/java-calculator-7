package calculator.runner;

import calculator.controller.CalculatorController;
import calculator.view.CalculatorView;

public class Runner {
  public void run(){
    CalculatorView calculatorView = new CalculatorView();
    CalculatorController controller = new CalculatorController(calculatorView);
    controller.start();
  }

}
