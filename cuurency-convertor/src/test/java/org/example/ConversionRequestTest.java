package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ConversionRequestTest {

    @Test
    public void givenNullFrom_whenConstructing_thenThrowException(){
        IllegalArgumentException exception =
                Assertions.assertThrows(IllegalArgumentException.class, () -> new ConversionRequest(null, "jod", BigDecimal.ONE));
        Assertions.assertEquals(exception.getMessage(),"null from");
    }
    @Test
    public void givenNullTo_whenConstructing_thenThrowException(){
        IllegalArgumentException exception =
                Assertions.assertThrows(IllegalArgumentException.class, () -> new ConversionRequest("usd", null, BigDecimal.ONE));
        Assertions.assertEquals(exception.getMessage(),"null to");
    }

}
