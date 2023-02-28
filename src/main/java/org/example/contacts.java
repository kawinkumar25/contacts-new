package org.example;

import java.util.*;
import java.util.logging.Logger;

class Contacts
{
    public static void main( String[] args )
    {
        String name;
        String email;
        long number;

        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger("kawin");
        Linked ll = new Linked();
        String searchname;
        String deletename;
        int choice;

        while(true)
        {
            log.info("1.Add contact \n 2.Display contact \n 3.Search contact  \n 4.Delete contact \n 5.Exit");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    log.info("Enter your Contact Name");
                    name = sc.next();
                    log.info("Enter your Phone Number ");
                    number = sc.nextLong();
                    log.info("Enter your Email Address");
                    email = sc.next();
                    ll.addContact(name, number, email);
                    break;

                case 2:
                    ll.display();
                    break;

                case 3:
                    log.info("Enter Contact Name to search");
                    searchname = sc.next();
                    ll.searchContact(searchname);
                    break;

                case 4:
                    log.info("Enter Contact Name to delete");
                    deletename = sc.next();
                    ll.deleteContact(deletename);
                    break;

                case 5:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    log.info("Invalid Choice");
                    break;
            }
        }
    }
}