package io.bytehala.wycash;

public class Dollar {

    public int amount;

    public Dollar(int i) {
        this.amount = i;
    }

    public void times(int i) {
        amount *= i;
    }
}
