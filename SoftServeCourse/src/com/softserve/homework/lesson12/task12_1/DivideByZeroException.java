package homework.lesson12.task12_1;

public class DivideByZeroException extends ArithmeticException{
    public DivideByZeroException(){
        super("Div by zero doesn't allow");
    }
}
