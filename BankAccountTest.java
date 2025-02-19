
package Encapsulation;


public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount per = new BankAccount();
        
        per.setAccountNumber("SB - 221");
        per.setBalance(3000.00);
        
        System.out.println("Acc Num : "+per.getAccountNumber());
        System.out.println("Balance : "+per.getBalance());
    }
    
}
