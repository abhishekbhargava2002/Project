import java.util.Scanner;
class ATMs
{
    int pin=1234;
    float  balance;
    public void chechpin()
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter the users name:");
        String user=ss.nextLine();
        System.out.println("enter the pin number:");
        int pinnumber=ss.nextInt();
        if(pinnumber==pin)
        {
            menu();
        }
        else
        {
            System.out.println("enter the vaild pin number");
        }
    }
    public void menu()
    {
            System.out.println("enter the choice:");
            System.out.println("1.Transcation history:");
            System.out.println("2.Deposit:");
            System.out.println("3.Withdraw:");
            System.out.println("4.Transfer:");
            System.out.println("5.Exit:"); 
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();

            if(opt==1)
            {
                transactionhistory();
            }
            else if(opt==2)
            {
                deposit();
            }
            else if(opt==3)
            {
                wirhdraw();
            }
            else if(opt==4)
            {
                transfer();
            }
            else if(opt==5)
            {
                return ;
            }
            else
            {
                System.out.println("enter the valid code");
            }
    }
    public void transactionhistory()
    {
        System.out.println("History:"+balance);
        menu();
    }
    public void deposit()
    {
        System.out.println("enter amount to depoist:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        balance=balance+amount;
        System.out.println("Balance:"+balance);
        System.out.println("money deposied successfully:");
        menu();
    }
    public void wirhdraw()
    {
        System.out.println("enter amount to withdraw:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance=balance-amount;
            System.out.println("Balance:"+balance);
            System.out.println("Money withdraw successful");
        }
        menu();
    }
    public void transfer()
    {     
        System.out.println("enter the account number:");
        Scanner sc=new Scanner(System.in);
        int accountnumber=sc.nextInt();
        System.out.println("enter the amount:");
        float amount=sc.nextFloat();
        System.out.println("enter the pin number:");
        int pinnumber=sc.nextInt();
        if(pinnumber==pin)
        {
            balance=balance-amount;
            System.out.println("Balance:"+balance);
            System.out.println("Money is transfer scuccessful");
        }
        else
        {
            System.out.println("Invalid pin number");
        }
        menu();
    }
}
class ATMinterface
{
    public static void main(String[] args) 
    {
        ATMs obj=new ATMs();
        obj.chechpin();
    }
}