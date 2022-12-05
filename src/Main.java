/*
 * Name: Megh Patel and Nirmal Patel
 * Title: Java lab 2
 * Student ID: 100802838 and 100830820
 */

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        ExtendedWorkTicket ewt = new ExtendedWorkTicket();
        System.out.println(ewt.toString());

        ewt = new ExtendedWorkTicket(15334, "Client 1", LocalDate.of(2021, 2, 1), "Issue of description goes here");
        System.out.println(ewt.toString());

        ExtendedWorkTicket ewtClone = new ExtendedWorkTicket(ewt);
        System.out.println(ewtClone.toString());
        ewtClone.SetWorkTicket(1231, "Client 2", LocalDate.of(2011, 10, 5), "Example of any issues ");
        System.out.println(ewtClone.toString());



    }
}