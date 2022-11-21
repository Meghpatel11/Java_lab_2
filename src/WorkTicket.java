/*
 * Name: Megh Patel and Nirmal Patel
 * Title: Java lab 1
 * Student ID: 100802838 and 100830820
 */

// reqired imports
import javax.lang.model.type.NullType;
import java.time.LocalDate;

public class WorkTicket
{
    //attributes
    int number;
    String client_id;
    String description;
    LocalDate date;

    //constructor(s)
    public WorkTicket(int TicketNumber, String ClientID, String Description, LocalDate TickeDate)
    {
        number = TicketNumber;
        client_id = ClientID;
        description = Description;
        date = TickeDate;
    }

    public WorkTicket(){
        number = 0;
    }

    // setters
    public void setNumber(int my_num)
    {
        if (my_num<=0)
        {
            throw new IllegalArgumentException("Number can not be zero or negative");
        }
        else
        {
            number = my_num;
        }
    }

    public void setClientid(String my_id)
    {
        client_id = my_id;
    }

    public void setDescription(String my_des)
    {
        description = my_des;
    }

    public void setDate(LocalDate my_date)
    {
        if(my_date.isBefore(LocalDate.of(2000, 1, 1)) || my_date.isAfter(LocalDate.of(2099, 12, 31)))
        {
            throw new IllegalArgumentException("Work Ticket Date should of 21st century(between 2000 and 2099)");
        }
        else
        {
            date = my_date;
        }
    }

    //getters
    public int getNumber()
    {
        return number;
    }
    public String getClient_id()
    {
        return client_id;
    }
    public String getDescription()
    {
        return description;
    }
    public LocalDate getDate()
    {
        return date;
    }

    // methods

    public boolean SetWorkTicket(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription) {
        if(workTicketNumber > 0) {
            if(workTicketDate.isBefore(LocalDate.of(2000, 1, 1)) || workTicketDate.isAfter(LocalDate.of(2099, 12, 31))) {
                return false;
            } else {
                if(issueDescription.length() >= 1) {
                    number = workTicketNumber;
                    client_id = clientID;
                    date = workTicketDate;
                    description = issueDescription;
                    return true;
                }
            }

        } else {
            return false;
        }
        return false;
    }

    public void ShowWorkTicket()
    {
        System.out.println();
        System.out.println("Ticket Number : " + number);
        System.out.println("Client ID : " + client_id);
        System.out.println("Ticket Date : " + date);
        System.out.println("Description of issue: " + description);
    }




}
