package compositeDesignPattern.calculatorOperationLLD;

public class Number implements CalculatorArithemeticOperation {
    private int number;
    public Number(int number){
        this.number = number;
    }
    @Override
    public double calculate() {
        return number;
    }
    

}
