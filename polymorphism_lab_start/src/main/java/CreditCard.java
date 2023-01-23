public class CreditCard extends Card {


    public CreditCard(String cardNumber, String expiryDate, int securityNumber) {
        super(cardNumber, expiryDate, securityNumber);
    }

    public String getCardNumber() {
        return super.getCardNumber();
    }

    public String getExpiryDate() {
        return super.getExpiryDate();
    }

    public int getSecurityNumber() {
        return super.getSecurityNumber();
    }

}
