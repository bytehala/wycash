package io.bytehala.wycash;

public class Sum implements Expression {
    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String toCurrency) {
        return new Money(augend.amount + addend.amount, toCurrency);
    }
}
