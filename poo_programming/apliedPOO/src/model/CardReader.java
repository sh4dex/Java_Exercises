package model;

public class CardReader {
    private static final double MAX_CUOTES = 6;
    private static final double MIN_CUOTES = 1;
    private static final double CHARGE_PERCENTAGE = 0.03;

    public Ticket makePayment(CreditCard card, double amount, int cuotes){
        Ticket ticket = null;
        if(validData(card, amount, cuotes)){
            double totalAmountToPay = amount + extraCharge(amount, cuotes);
        }
        return ticket;
    }

    private double extraCharge(double amount, int cuotes) {
        return 0;
    }

    private boolean validData(CreditCard card,double amount, int cuotes) {
        boolean valid = false;
        if(cuotes >= MIN_CUOTES && cuotes <= MAX_CUOTES && card.isValidAmount(amount)){
            valid = true;
        }
        return valid;
    }

}