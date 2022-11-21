import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        // ticket with parameters
        WorkTicket my_ticket1 = new WorkTicket(10011, "Client101", "Description of ticket 1", LocalDate.of(2022, 5, 1));
        WorkTicket my_ticket2 = new WorkTicket(3232,"User102","first ticket for trip",LocalDate.of(2000,3,4));

        // ticket without parameters
        WorkTicket my_ticket3 = new WorkTicket();

        // store tickets into array
        WorkTicket[] tickets = new WorkTicket[]{my_ticket1, my_ticket2, my_ticket3};

        // display each ticket data
        for(WorkTicket ticket : tickets) {
            ticket.ShowWorkTicket();
        }

    }
}