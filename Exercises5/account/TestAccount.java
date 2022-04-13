package account;

public class TestAccount {
  public static void main(String[] args) {
    // Test constructors and toString()
    Account acc1 = new Account("A101", "Tan Ah Teck", 88);
    System.out.println(acc1);
    Account acc2 = new Account("A102", "Kumar");
    System.out.println(acc2);

    // Test getters
    System.out.println("Id: " + acc1.getId());
    System.out.println("Name: " + acc1.getName());
    System.out.println("Balance: " + acc1.getBalance());

    // Test credit() and debit()
    acc1.credit(100);
    System.out.println(acc1);
    acc1.debit(50);
    System.out.println(acc1);
    acc1.debit(500);
    System.out.println(acc1);

    // Test transferTo()
    acc1.transferTo(acc2, 100);
    System.out.println(acc1);
    System.out.println(acc2);
  }
}
