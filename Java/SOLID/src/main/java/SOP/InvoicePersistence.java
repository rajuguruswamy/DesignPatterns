package SOP;

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    // Creates a file with given name and writes the invoice
    public void saveToFile(String filename) {
        System.out.println("Saved the file as  "+ filename);
    }
}
