package customerandinvoice;

public class Test {
  public static void main(String[] args) {
    // Test CustomerAndInvoice.Customer class
    Customer customer = new Customer(88, "Tan Ah Tech", 10);
    System.out.println(customer);

    customer.setDiscount(8);
    System.out.println(customer);
    System.out.println("Id is: " + customer.getId());
    System.out.println("Name is: " + customer.getName());
    System.out.println("Discount is: " + customer.getDiscount());

    // Test CustomerAndInvoice.Invoice class
    Invoice invoice = new Invoice(101, customer, 888.8);
    System.out.println(invoice);

    invoice.setAmount(999.9);
    System.out.println(invoice);
    System.out.println("Id is: " + invoice.getId());
    System.out.println("Customer's name is: " + invoice.getCustomer());
    System.out.println("Amount is: " + invoice.getAmount());
    System.out.println("Customer's id is: " + invoice.getCustomerId());
    System.out.println("Customer's name is: " + invoice.getCustomerName());
    System.out.println("Customer's discount is: " + invoice.getCustomerDiscount());
    System.out.printf("Amount after discount is: %.2f%n", invoice.getAmountAfterDiscount());
  }
}
