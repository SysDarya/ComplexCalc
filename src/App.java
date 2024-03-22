public class App {
    public static void main(String[] args) throws Exception {
        Complex num1 = new Complex(1, -1);
        Complex num2 = new Complex(3, 6);

        Calculator calculator = new Calculator();

        calculator.multiply(num1, num2);
        calculator.add(num1, num2);
        calculator.divide(num1, num2);
    }
}
