package SimpleATMMod4;

public class ATM {
    public ATM(){
        System.out.println("Enter your pin: ");
    }

    public void menu(){
        System.out.println("\n1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance inquiry");
        System.out.println("4. Exit");

    }

    public void withdrawMenu(){System.out.println("Enter amount to withdraw: ");}
    public void depositMenu(){System.out.println("Enter amount to deposit: ");}
    public void balanceMenu(double balance){System.out.printf("The balance is: %.2f", balance);}
    public void InvalidMenuMessage(){System.out.println("Invalid option. Try again. ");}
    public void exitMenu(){System.out.println("\nThanks for banking with us. ");}

}
