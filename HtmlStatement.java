import java.util.Enumeration;

public class HtmlStatement extends Statement {

  public String rentalHead(Customer aCustomer) {
    return "<H1>Rental Record for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }

  public String rentalBody(Rental each) {
    return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
  }

  public String rentalFooter(Customer aCustomer) {
    String footer = "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    footer += "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
    
    return footer;
  }

}