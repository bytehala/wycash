package io.bytehala.wycash;

public class Dollar extends Money {

    public Dollar(int i) {
        this.amount = i;
    }

    public Money times(int i) {
        return new Dollar(amount * i);
    }
}
