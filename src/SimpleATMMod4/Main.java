package SimpleATMMod4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pinNum;
        int userOption = 0;

       CheckingAccount account1 = new CheckingAccount(5000, 1423, 2) ;

        Scanner scanner = new Scanner(System.in);

        account1.printTransactions();

        ATM atm = new ATM();

        pinNum = scanner.nextInt();

        if(account1.validatePin(pinNum)){
            do{
                atm.menu();
                userOption = scanner.nextInt();
                switch(userOption){
                    case 1:
                        atm.withdrawMenu();
                        double withdrawAmount = scanner.nextDouble();
                        account1.withdraw(withdrawAmount + account1.getFee());
                        break;
                   case 2:
                       atm.depositMenu();
                       double depositAmount = scanner.nextDouble();
                       account1.deposit(depositAmount);
                       break;

                    case 3:
                        atm.balanceMenu(account1.getBalance());
                        //System.out.printf("\nThe interest is $%.2f", account1.calculateInterest()); // savings account
                        break;

                    case 4:
                        atm.exitMenu();
                        break;

                    default:
                        atm.InvalidMenuMessage();
                        break;



                }
            }while(userOption != 4);
        }
    }
}