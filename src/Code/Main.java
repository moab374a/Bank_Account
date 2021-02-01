package Code;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("099" , 20);
        bankAccount.payIn(50);
        bankAccount.payOff(15);
    }
}
