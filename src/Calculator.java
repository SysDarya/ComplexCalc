
import java.util.logging.Logger;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    // Метод для сложения комплексных чисел

    public Complex add(Complex a, Complex b) {

        LOGGER.info("Операция сложения");

        Complex result = a.add(b);

        LOGGER.info("Результат: " + result);

        return result;

    }

    // Метод для умножения комплексных чисел

    public Complex multiply(Complex a, Complex b) {

        LOGGER.info("Операция умножения ");

        Complex result = a.multiply(b);

        LOGGER.info("Результат: " + result);

        return result;

    }

    // Метод для деления комплексных чисел

    public Complex divide(Complex a, Complex b) {

        LOGGER.info("Операция деления");

        Complex result = a.divide(b);

        LOGGER.info("Результат: " + result);

        return result;

    }

}