
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double theChange = cashGiven;
        double economicalCost = 2.50;
        if (cashGiven >= economicalCost) {
            this.cashInRegister += economicalCost;
            theChange = cashGiven - economicalCost;
            economicalSold++;
        }
        return theChange;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double theChange = cashGiven;
        double gourmetCost = 4.00;
        if (cashGiven >= gourmetCost) {
            this.cashInRegister += gourmetCost;
            theChange = cashGiven - gourmetCost;
            gourmetSold++;
        }    
        return theChange;
    }
    
    public boolean payEconomical(LyyraCard card) {
        double economicalCost = 2.50;
        if (card.balance() >= economicalCost) {
            card.pay(economicalCost);
            this.economicalSold++;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card) {
        double gourmetCost = 4.00;
        if (card.balance() >= gourmetCost) {
            card.pay(gourmetCost);
            this.gourmetSold++;
            return true;
        } else {
        return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister+=sum;
        }
    }


    public String toString() {
        return "money in register " + this.cashInRegister + " economical lunches sold: " + this.economicalSold + " gourmet lunches sold: " + this.gourmetSold;
    }
}
