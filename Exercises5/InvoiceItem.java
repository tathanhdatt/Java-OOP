public class InvoiceItem {
  private String id;
  private String desc;
  private int qty;
  private double unitPrice;

  public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
  }

  public String getId() {
    return id;
  }

  public String getDesc() {
    return desc;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotal() {
    return unitPrice * qty;
  }

  @Override
  public String toString() {
    return String.format(
      "InvoiceItem[id=%s, desc=%s, qty=%d, unitPrice=%.2f]",
      this.id, this.desc, this.qty, this.unitPrice
    );
  }
}
