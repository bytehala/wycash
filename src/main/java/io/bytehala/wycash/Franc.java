package io.bytehala.wycash;

public class Franc {

    private int amount;

    public Franc(int i) {
        this.amount = i;
    }

    public Franc times(int i) {
        return new Franc(amount * i);
    }

    @Override
    public boolean equals(Object o) {
        Franc d = (Franc) o;
        return d.amount == this.amount;
    }
}
