package io.bytehala.wycash;

public interface Expression {
    Money reduce(String toCurrency);
}
