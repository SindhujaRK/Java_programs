public class Invoice {
    private String partnumber;
    private String partdescription;
    private int quantity;
    private double priceperitem;
    public Invoice(String partnumber, String partdescription, int quantity, double priceperitem) {
        this.partnumber = partnumber;
        this.partdescription = partdescription;
        this.quantity=quantity; 
        this.priceperitem=priceperitem; 
    }
    public String getpartnumber() {
        return partnumber;
    }
    public void setpartnumber(String partnumber) {
        this.partnumber = partnumber;
    } 
    public String getpartdescription() {
        return partdescription;
    }
    public void setpartdescription(String partdescription) {
        this.partdescription = partdescription;
    }
    public int getquantity() {
        return quantity;
    }
    public void setquantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }
    public double getpriceperitem() {
        return priceperitem;
    }
    public void setpriceperitem(double priceperitem) {
        if (priceperitem > 0) {
            this.priceperitem = priceperitem;
        } else {
            this.priceperitem = 0.0; 
        }
    }
    public double getInvoiceAmount() {
        return quantity * priceperitem;
}
public static void main(String[] args){
        Invoice invoice1 = new Invoice("1234", "Widget", 10, 19.99);
        System.out.println("Invoice 1");
        System.out.println("Part Number: " + invoice1.getpartnumber());
        System.out.println("Part Description: " + invoice1.getpartdescription());
        System.out.println("Quantity: " + invoice1.getquantity());
        System.out.println("Price per Item: " + invoice1.getpriceperitem());
        System.out.println("Invoice Amount: " + invoice1.getInvoiceAmount());
        Invoice invoice2 = new Invoice("5678", "Gadget", -3, 12);
        System.out.println("\nInvoice 2");
        System.out.println("Part Number: " + invoice2.getpartnumber());
        System.out.println("Part Description: " + invoice2.getpartdescription());
        System.out.println("Quantity: " + invoice2.getquantity());
        System.out.println("Price per Item: " + invoice2.getpriceperitem()); 
        System.out.println("Invoice Amount: " + invoice2.getInvoiceAmount()); 
}}
