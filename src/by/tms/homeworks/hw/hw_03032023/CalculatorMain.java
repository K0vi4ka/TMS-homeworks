package by.tms.homeworks.hw.hw_03032023;


public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(4, 2);
        calculator.sumOperands();
        calculator.subtractOperands();
        calculator.multiOperands();
        calculator.divOperands();
    }
}
