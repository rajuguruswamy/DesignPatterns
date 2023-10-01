package SOP;

public class Invoice {
    public Book getBook() {
        return book;
    }

    private  Book book;

    public int getQuantity() {
        return quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotal() {
        return total;
    }

    private  int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    //calculates the total price,
    public double calculateTotal(){

        double price = ((book.price - book.price * discountRate) * this.quantity);
        double priceWithTaxes = price * (1 + taxRate);
//        System.out.println("calculateTotal : " +  priceWithTaxes);
        return priceWithTaxes;
    }
}
