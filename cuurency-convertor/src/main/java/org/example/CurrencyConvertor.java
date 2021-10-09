package org.example;

import java.math.BigDecimal;

public class CurrencyConvertor {
    private final CurrencyValidator currencyValidator;

    public CurrencyConvertor(CurrencyValidator currencyValidator) {
        this.currencyValidator = currencyValidator;
    }


    public BigDecimal convert(ConversionRequest request) {
        currencyValidator.validate(request.getFrom());
    }

}
