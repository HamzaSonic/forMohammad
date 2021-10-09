package org.example;

import java.math.BigDecimal;

public class ConversionRequest {
    private final String from;
    private final String to;
    private final BigDecimal amount;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public ConversionRequest(String from, String to, BigDecimal amount) {
        failIfNullCurrency(from,to);
//        validateAmount(amount);
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    private void validateAmount(BigDecimal amount) {
        if (amount == null)
            throw new IllegalArgumentException("null amount");
        if (amount.signum() <= 0)
            throw new IllegalArgumentException("expected positive amount");
    }

    private void failIfNullCurrency(String from, String to) {
        if (from == null)
            throw new IllegalArgumentException("null from");
        if (to == null)
            throw new IllegalArgumentException("null to");

    }
}
