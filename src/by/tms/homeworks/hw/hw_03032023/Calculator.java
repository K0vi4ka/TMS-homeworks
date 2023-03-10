package by.tms.homeworks.hw.hw_03032023;

public class Calculator {
    private int firstOperand;
    private int secondOperand;

    public Calculator(int firstOperand, int secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public int getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
    }

    public int getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
    }

    public void sumOperands() {
        int sum = this.firstOperand + this.secondOperand;
        System.out.printf("%d + %d = %d\n", this.firstOperand, this.secondOperand, sum);
    }

    public void subtractOperands() {
        int subtract = this.firstOperand - this.secondOperand;
        System.out.printf("%d - %d = %d\n", this.firstOperand, this.secondOperand, subtract);
    }

    public void multiOperands() {
        int multi = this.firstOperand * this.secondOperand;
        System.out.printf("%d * %d = %d\n", this.firstOperand, this.secondOperand, multi);
    }

    public void divOperands() {
        float div = this.firstOperand / this.secondOperand;
        System.out.printf("%d * %d = %.2f\n", this.firstOperand, this.secondOperand, div);
    }
}
