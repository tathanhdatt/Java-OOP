package invoiceitem;

public class TestInvoiceItem {
  public static void main(String[] args) {
    // Test constructor and toString()
    InvoiceItem invoiceItem = new InvoiceItem("A101", "Pen Red", 888, 0.08);
    System.out.println(invoiceItem);

    // Test setters and getters
    invoiceItem.setQty(999);
    invoiceItem.setUnitPrice(0.99);
    System.out.println(invoiceItem);
    System.out.println("Id is: " + invoiceItem.getId());
    System.out.println("Desc is: " + invoiceItem.getDesc());
    System.out.println("Qty is: " + invoiceItem.getQty());
    System.out.println("UnitPrice is: " + invoiceItem.getUnitPrice());

    // Test getTotal()
    System.out.println("The total is: " + invoiceItem.getTotal());
  }
}
