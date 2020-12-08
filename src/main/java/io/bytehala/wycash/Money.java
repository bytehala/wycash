package io.bytehala.wycash;

public abstract class Money {

    protected String currency;
    protected int amount;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Dollar dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object o) {
        Money d = (Money) o;
        return d.amount == this.amount && getClass().equals(o.getClass());
    }

    public abstract Money times(int multiplier);

    public String currency() {
        return this.currency;
    }
}
