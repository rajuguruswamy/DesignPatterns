package SOP;

public class Solution {
/*
The Single Responsibility Principle states that a class should do one thing
and therefore it should have only a single reason to change.
 */
    public static void main(String[] args) {

        System.out.println("The Single Responsibility Principle");

        Book  book  = new Book("Heaven","Steve",2011,40,"AB XX-YYYY");
        Invoice invoice  =new Invoice(book,2,0.1,0.6);

        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.print();

        InvoicePersistence persistence = new InvoicePersistence(invoice);
        persistence.saveToFile("Heaven.pdf");


    }
}
