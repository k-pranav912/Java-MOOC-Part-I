
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account mattsAccount = new Account("Matt's account", 1000.00);
        Account myAccount = new Account("My account", 0.00);
        
        mattsAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        
        System.out.println(mattsAccount);
        System.out.println(myAccount);
        
    }

}
