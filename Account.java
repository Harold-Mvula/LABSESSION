import java.util.Scanner;
public class Account{
    public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("\n Welcome Bank Management System");


System.out.println("\n");
   System.out.println("Select Operation Below");
   System.out.println("\n");
        System.out.println(" 1. list all acc and balances");
   System.out.println("2. create a new account ");
  System.out.println("3. deposit money into acc");
System.out.println("4. withdraw money");
   System.out.println ("5. check the balances ");
  System.out.println("6. exit ");

  System.out.println("\n");

   System.out.println("Enter your choice");
   int number = input.nextInt();

    AccountType one = new AccountType(number);

  //  System.out.println("here we go " + one.getNumber());

    if(number == 2){
        System.out.println("\n Select the bank type");

        System.out.println("\n");
        System.out.println("1. Student");
        System.out.println("2. Excutive");

        System.out.println("Enter ur choice ");
        int choice = input.nextInt();

      Choice two = new Choice(choice);
      //  System.out.print(two.getChoice());

       if(choice == 1){
         System.out.println("\n Creating a new account ");

System.out.print("Enter acc name: ");
           String accountName = input.next();

System.out.print("Enter acc #: ");
           int accountNumber = 2 + (int)(Math.random() * 50);
System.out.println(accountNumber);

System.out.print("Enter branc: ");
           String branchName = input.next();

System.out.print("Enter AccountAmount: ");
           int balance = input.nextInt();

         ///  public static void(int balance){
            //    if(balance > 200){
            //  System.out.print("Withdrwan");
            //  }
            //  else{
            //    System.out.print("Insufficient balance");
            //  }
  
  System.out.print("Enter RegNumber: ");
           String RegNumber = input.next();
           //  System.exit(0);
           StudentAccount town = new StudentAccount(RegNumber);
           AccountDetails the = new AccountDetails(accountName, accountNumber, branchName, balance);
       }
        System.out.print("\n Successfully created an Account");
    }
 
    }
}
 