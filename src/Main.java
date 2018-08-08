public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public Boolean submitCreditCardOrder(String firstName, String lastName, String zipcode,
                                         String streetAddress1, String streetAddress2, String city,
                                         String state, String country, String phoneNumber,
                                         String creditCardNumber, int expirationMonth, int expirationYear,
                                         Long saleAmount) {
        return false;
    }

    public Boolean submitCreditCardOrder(ContactInformation customerInfo, CreditCard card, Long saleAmount) {
        return false;
    }

    private class ContactInformation {
        
    }

    private class CreditCard {

    }
}
