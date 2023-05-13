package model;

public class Ticket {
    private String ticketNumber;
    private String clientNameAndLastName;
    private double totalAmountToPay;
    private double mountOfEachQuote;

    public Ticket(String ticketNumber, String clientNameAndLastName, double totalAmountToPay, double mountOfEachQuote){
        this.ticketNumber = ticketNumber;
        this.clientNameAndLastName = clientNameAndLastName;
        this.totalAmountToPay = totalAmountToPay;
        this.mountOfEachQuote = mountOfEachQuote;
    }
}
