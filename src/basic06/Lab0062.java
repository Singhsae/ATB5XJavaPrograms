package src.basic06;

public class Lab0062 {
    public static void main(String[] args) {
        BankAccount sbi =new BankAccount();
        sbi.printDetails();
        System.out.println("-----------");

        BankAccount hdfc = new BankAccount( "HDFC","hdfc001");
        hdfc.printDetails();
        System.out.println("-----------");

        BankAccount icici=new BankAccount("ICICI","icici002");
        icici.printDetails();
        System.out.println("............");

        BankAccount yes_ref =new BankAccount("YES","yes003");
        yes_ref.printDetails();
        System.out.println(".................");
    }
}
