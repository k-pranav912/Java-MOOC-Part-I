
public class Main {

    public static void main(String[] args) {
        // write test code here
        CashRegister unicafe = new CashRegister();
        
        double theChange = unicafe.payEconomical(10);
        System.out.println("the change was: " + theChange);
        
        theChange = unicafe.payEconomical(5);
        System.out.println("the change was: " + theChange);
        
        theChange = unicafe.payGourmet(4);
        System.out.println("the change was: " + theChange);
    }
}

