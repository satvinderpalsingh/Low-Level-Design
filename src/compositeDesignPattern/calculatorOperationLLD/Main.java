package compositeDesignPattern.calculatorOperationLLD;

public class Main {
    public static void main(String[] args) {
        CalculatorArithemeticOperation number1 = new Number(2);
        CalculatorArithemeticOperation number2 = new Number(1);
        CalculatorArithemeticOperation number3 = new Number(7);
        CalculatorArithemeticOperation operation = new ArithemeticOperation(number2,number3,OperationType.ADD);
        System.out.println(operation.calculate());
        CalculatorArithemeticOperation operation1 = new ArithemeticOperation(number1,operation,OperationType.MULTIPLY);
        System.out.println(operation1.calculate());
        
    }

}
