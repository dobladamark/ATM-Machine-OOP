
package atm.machine.oop;


public class ATMMachineOOP {

    
    public static void main(String[] args) {
       SavingsAccount savingsAccount = new SavingsAccount(123456, 100000,0.5);
       ATM atm1 = new ATM(savingsAccount);
        System.out.println("Welcome to Bank");
        atm1.run();
        
        
    }
    
}
