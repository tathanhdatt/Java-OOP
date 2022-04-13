package customerandaccount;

public class Test {
  public static void main(String[] args) {
    // Test Customer class
    Customer customer = new Customer(13, "Name", 'm');
    System.out.println(customer);

    System.out.println("Customer's id: " + customer.getID());
    System.out.println("Customer's name: " + customer.getName());
    System.out.println("Customer's gender: " + customer.getGender());

    // Test Account class
    Account account = new Account(10, customer, 10000);
    System.out.println(account);

    account.setBalance(13000.0);
    System.out.println("Account's id: " + account.getId());
    System.out.println("Account's customer: " + account.getCustomer());
    System.out.println("Account's balance: " + account.getBalance());
    System.out.println("Account's customer's name: " + account.getCustomerName());

    account.deposit(5000.0);
    System.out.println(account);
    account.withdraw(7000.0);
    System.out.println(account);
    account.withdraw(12000.0);
  }
}
