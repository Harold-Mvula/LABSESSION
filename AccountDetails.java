//import java.util.Date;
public class AccountDetails{
    private String accountName;
      private int accountNumber;
      private String branchName;
    //Date day;
      private int balance = 200;

    AccountDetails(){} 
    AccountDetails(String accountName, int accountNumber, String branchName, int balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.branchName = branchName;
      //  this.day = day;
        this.balance = balance;
    }
    
    public String getAccountName(){
        return accountName;
    } 
    public int getAccountNumber(){
        return accountNumber;
    } 
    public String getBranchName(){
        return branchName;
    } 
    //public Date getDay(){
      //  return day;
    //} 
    public int getBalance(){
        return balance;
    } 
}