package main;

import model.CardReader;
import model.CardType;
import model.CreditCard;
import model.Ticket;
import model.User;

public class Main {
    public static void main(String[] args) {
        CardReader cardReader = new CardReader();
        User user = new User(1, "Thomas", "Sorza", "thomas@sorza.com", "123456789");
        CreditCard creditCard = new CreditCard("123456789", 1000, "Bancolombia",user,CardType.VISA);
    
        System.out.println("card before the payment:");
        System.out.println(creditCard);

        Ticket ticket = cardReader.makePayment(creditCard, 1000, 1);
        System.out.println(ticket);
        
        System.out.println("card after the payment:");
        System.out.println(creditCard);
    }
}