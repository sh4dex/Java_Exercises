package model;

public class CreditCard {
    private String cardNumber;
    private float balance;
    private String bankName;
    private CardType cardType;
    private User user;

    public CreditCard(String cardNumber, float balance, String bankName, User user, CardType cardType){
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.bankName = bankName;
        this.cardType = cardType;
        this.user = user;
    }
}
