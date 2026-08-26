import java.util.Scanner;

public class Account
{
    public double balance;
    public int deposit;
    public int checkBalance;

    public void getdata()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the balance: ");
        balance = scanner.nextDouble();
        System.out.print("Enter the deposit: ");
        deposit = scanner.nextInt();
        System.out.print("Enter the checkBalance: ");
        checkBalance = scanner.nextInt();
    }
}