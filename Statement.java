import java.util.Enumeration;

public abstract class Statement {
  public abstract String rentalHead(Customer aCustomer);
  public abstract String rentalBody(Rental each);
  public abstract String rentalFooter(Customer aCustomer);
  
  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = rentalHead(aCustomer);

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += rentalBody(each);
    }

    result += rentalFooter(aCustomer);
    return result;
  }
}