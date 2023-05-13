package model;

public class CreditCard {
    private String cardNumber;
    private float balance;
    private String bankName;
    private CardType cardType;

    public CreditCard(String cardNumber, float balance, String bankName, CardType cardType){
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.bankName = bankName;
        this.cardType = cardType;
    }
}
