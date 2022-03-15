package co.com.sofka.app.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.InvalidParameterException;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long rest(Long number1, Long number2) {
        logger.info( "Resting {} + {}", number1, number2 );
        return number1 - number2;
    }

    public Long multi(Long number1, Long number2) {
        logger.info( "Multipling {} + {}", number1, number2 );
        return number1 * number2;
    }

    public Long div(Long number1, Long number2) {
        logger.info( "Dividing {} + {}", number1, number2 );
        if(number2 == 0)
            throw new InvalidParameterException("No se puede efectuar una division entera entre 0");
        return number1 / number2;
    }

}
