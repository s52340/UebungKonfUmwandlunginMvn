import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @org.junit.jupiter.api.Test
    void add() {
        calculator = new Calculator(3,4);

        Assertions.assertEquals(7,calculator.add());
    }

    // Kommentar zum pushen - Veränderung - alles funktioniert :)

}