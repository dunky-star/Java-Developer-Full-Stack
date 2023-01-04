package OOP2;

public class MainBankAccount {
    public static void main(String[] args){
        BankAccount dunkyAccount = new BankAccount("07800900", 0.0, "Dunky Kaligs", "carl@gmail.com", "+256780xxxxx" );
        // Testing...
        System.out.println("Customer name: " + dunkyAccount.getCustomerName());
        System.out.println("Customer email: " + dunkyAccount.getCustomerEmailAddress());
        System.out.println("Customer mobile No.:" + dunkyAccount.getCustomerPhoneNumber());
        dunkyAccount.withdrawal(200.0);
        dunkyAccount.deposit(250.0);
        dunkyAccount.withdrawal(100.0);

        BankAccount carlAccount = new BankAccount("Carl", "carl2@yahoo.com", "+25675000xxx");
        System.out.println("\nNext customer A/C: " + carlAccount.getNumber() + "  , customer name: " + carlAccount.getCustomerName() + " , Customer bank balance: " + carlAccount.getBalance());

    }
}
