package io.bytehala.wycash;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money d = (Money) o;
        return d.amount == this.amount && getClass().equals(o.getClass());
    }
}
