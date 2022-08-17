package me.hakusai;

public class Doller {

    private int amount;

    public Doller(int amount) {
        this.amount = amount;
    }

    public Doller times(int multiplier) {
        return new Doller(amount * multiplier);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + amount;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Doller other = (Doller) obj;
        if (amount != other.amount)
            return false;
        return true;
    }

}
