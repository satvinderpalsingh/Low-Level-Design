package compositeDesignPattern.calculatorOperationLLD;

public class ArithemeticOperation implements CalculatorArithemeticOperation {
    private CalculatorArithemeticOperation left;
    private CalculatorArithemeticOperation right;
    private OperationType operationType;
    public ArithemeticOperation(CalculatorArithemeticOperation left, CalculatorArithemeticOperation right, OperationType operationType){
        this.left = left;
        this.right = right;
        this.operationType = operationType;
    }

    @Override
    public double calculate() {
        double leftValue = left.calculate();
        double rightValue = right.calculate();
        switch (operationType){
            case ADD:
                return leftValue + rightValue;
            case SUBTRACT:
                return leftValue - rightValue;
            case MULTIPLY:
                return leftValue * rightValue;
            case DIVIDE:
                return leftValue / rightValue;
            default:
                return 0;
        }
    }

}
