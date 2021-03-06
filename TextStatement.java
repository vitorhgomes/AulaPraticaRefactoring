import java.util.Enumeration;

public class TextStatement extends Statement {

  public String rentalHead(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  public String rentalBody(Rental each) {
    return "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
  }

  public String rentalFooter(Customer aCustomer) {
    String footer = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    footer += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    return footer;
  }

}