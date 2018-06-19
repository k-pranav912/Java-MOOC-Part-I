
public class Money {

    private final int euros;
    private final int cents;
    private Money Money;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int k = this.euros + added.euros;
        int l = this.cents + added.cents;
        Money i = new Money(k,l);
        if (l > 99) {
            k += l/100;
            l %= 100;
        }
        return i = new Money(k, l);
    }
    
    public Money minus(Money decremented) {
        int k = 0;
        int l = 0;
        Money i = new Money(k,l);
        if (this.euros < decremented.euros) {
            k = 0;
            l = 0;
        } else if (this.cents < decremented.cents) {
            k = (this.euros-1) - decremented.euros;
            l = (this.cents + 100) - decremented.cents;
        } else {
            k = this.euros - decremented.euros;
            l = this.cents - decremented.cents;
        }
        return i = new Money(k,l);
    }
    
    public boolean less(Money compared) {
        return (this.euros*100 + this.cents) < (compared.euros*100 + compared.cents);
    }

}
