package io.bytehala.wycash;

public class Dollar {

    private int amount;

    public Dollar(int i) {
        this.amount = i;
    }

    public Dollar times(int i) {
        return new Dollar(amount * i);
    }

    @Override
    public boolean equals(Object o) {
        Dollar d = (Dollar) o;
        return d.amount == this.amount;
    }
}
