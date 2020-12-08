package io.bytehala.wycash;

public abstract class Money {

    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object o) {
        Money d = (Money) o;
        return d.amount == this.amount && getClass().equals(o.getClass());
    }

    public abstract Money times(int multiplier);

}
