public class Main
{
    public static void main(String[] args)
    {
        Account account = new Account();
        account.getdata();
        
        System.out.println("\nAccount Details");
        System.out.println("Balance: " + account.balance);
        System.out.println("Deposit: " + account.deposit);
        System.out.println("Check Balance: " + account.checkBalance);
    }
}