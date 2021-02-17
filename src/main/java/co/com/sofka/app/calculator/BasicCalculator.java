package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    //TODO: Completar las demás operaciones aritméticas

    public Long res(Long number1, Long number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mul(Long number1, Long number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        try{
            logger.info( "Summing {} / {}", number1, number2 );
            return number1 / number2;
        } catch (ArithmeticException e){
            System.out.println("La división entre 0 no está definida, por eso hemos retornado un valor de 0");
            return Long.parseLong("0");
        }
    }
}
