package io.bytehala.wycash;

public interface Expression {
    Money reduce(Bank bank, String toCurrency);
}
