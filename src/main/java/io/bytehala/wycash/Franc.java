package io.bytehala.wycash;

public class Franc extends Money {

    public Franc(int i) {
        this.amount = i;
    }

    public Money times(int i) {
        return new Franc(amount * i);
    }
}
