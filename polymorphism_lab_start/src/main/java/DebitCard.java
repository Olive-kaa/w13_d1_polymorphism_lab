public class DebitCard extends Card {
    private int sortCode;
    private int accountNumber;


    public DebitCard(String cardNumber, String expiryDate, int securityNumber, int sortCode, int accountNumber) {
        super(cardNumber, expiryDate, securityNumber);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getCardNumber() {
        return super.getCardNumber();
    }

    public int getSortCode() {
        return this.sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getExpiryDate() {
        return super.getExpiryDate();
    }

    public int getSecurityNumber() {
        return super.getSecurityNumber();
    }
}
