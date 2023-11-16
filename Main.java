import java.util.Scanner;

class Account {
    public float Balance = 1000 ;
    private int pin = 1234;

    void checkBalance() {
        System.out.println("Current Balance Your Account is " + Balance+" Rs3");
    }


    void deposit(){
        System.out.println(" Please Enter amount ");
        Scanner scn = new Scanner(System.in);
        float cash = scn.nextFloat();
        System.out.println(" Succesfully Deposited ");

        System.out.println(" Available Balance in your account is "+(Balance+cash)+" Rs"+"\n");


        
    }

    void withdraw(float Balance) {
        System.out.println(" Please Enter amount ");
        Scanner scr = new Scanner(System.in);
        float amount = scr.nextFloat();

        if (amount <= Balance) {

            System.out.println(" Enter Pin To Proceed Transaction");
            Scanner scan = new Scanner(System.in);
            int pass = scan.nextInt();

            if (pass == pin) {
                System.out.println("Transaction succesfull");
                System.out.println("Available Balance " + (Balance - amount)+"Rs");
                System.out.println("\n");
            } else {
                System.out.println("!!wrong pin \n Transaction Failed");

            }

        }

        else
            System.out.println("!!Insufficient Balance ");

    }

}

class Main {

    public static void main(String args[]) {
        Account s = new Account();
        while (true) {
            System.out.println("Please select an option ");
            System.out.println("press 1 for Balance Enquiry ");
            System.out.println("press 2 for cash withdraw ");
            System.out.println("press 3 for Cash Deposit ");

            Scanner sc = new Scanner(System.in);

            int keyValue = sc.nextInt();
            switch (keyValue) {
                case 1:

                    s.checkBalance();
                    break;
                case 2:
                    System.out.println(" ->Withdraw Menu ");
                      System.out.println("");
                    s.withdraw(s.Balance);
                    break;
                case 3:
                    System.out.println(" ->Cash Deposit Menu");
                    System.out.println("");
                    s.deposit();
                    break;
                    default :
                    System.out.println("Invalid Options");

            }
        }
    }
                                                           }