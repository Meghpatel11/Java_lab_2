/*
 * Name: Megh Patel and Nirmal Patel
 * Title: Java lab 3
 * Student ID: 100802838 and 100830820
 */


import java.time.LocalDate;

public class ExtendedWorkTicket extends WorkTicket {

    // variable
    private boolean myOpen;

    // constructors
    public ExtendedWorkTicket() {
        super();
        openTicket();
    }

    public ExtendedWorkTicket(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        super(workTicketNumber, clientID, issueDescription,workTicketDate);
        openTicket();
    }

    public ExtendedWorkTicket(WorkTicket wt) {
        super(wt.getNumber(), wt.getClient_id(), wt.getDescription(), wt.getDate());
        openTicket();
    }



    // getter
    boolean isOpen() {
        return myOpen;
    }


    // setter
    void openTicket() {
        this.myOpen = true;
    }

    void closeTicket() {
        this.myOpen = false;
    }


    // methods

    public boolean SetWorkTicket(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        if (super.SetWorkTicket(workTicketNumber, clientID, workTicketDate, issueDescription))
        {
            openTicket();
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        String output = super.ShowWorkTicket();
        String ticketState = isOpen() ? "OPEN" : "CLOSED";
        output = output = output + "\n" + "Ticket: " + ticketState;
        return output;
    }







}
