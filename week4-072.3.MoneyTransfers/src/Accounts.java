
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account A = new Account("A's account", 100.00);
        Account B = new Account("B's account'", 0.00);
        Account C = new Account("C's account", 0.00);
        
        transfer(A, B, 50.00);
        transfer(B, C, 25.00);
        
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
    
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }


}
