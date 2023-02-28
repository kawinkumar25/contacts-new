package org.example;

import java.util.logging.Logger;

public class Linked {
    Node rootnode;
    Logger log = Logger.getLogger("kawin");
    int count =0;
    Linked()
    {
        rootnode = null;
    }
    public void addContact(String name,long number,String email)
    {
        Node newnode = new Node(name,number,email);
        if(rootnode==null)
        {
            rootnode = newnode;
            count++;
        }
        else
        {
            Node temp = rootnode;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
            count++;
        }
    }
    public void display()
    {
        Node temp = rootnode;
        if(temp == null)
        {
            log.info("Contact List is Empty");
        }
        else {
            while(temp!=null)
            {
                String namecontact = "ContactName:" + temp.name;
                String numberphone = "PhoneNumber:"+ temp.number;
                String addressemail = "EmailAddress:" +temp.email;
                log.info(namecontact);
                log.info(numberphone);
                log.info(addressemail);
                temp=temp.next;
            }
        }
    }
    public void searchContact(String searchname)
    {
        int flag =0;
        Node temp = rootnode;
        if(temp == null)
        {
            log.info("Contacts is empty");
        }
        else {
            while(temp != null)
            {
                if(searchname.equals(temp.name))
                {
                    flag =1;
                    String namecontact = "ContactName:" + temp.name;
                    String numberphone = "PhoneNumber:"+ temp.number;
                    String addressemail = "EmailAddress:" +temp.email;
                    log.info(namecontact);
                    log.info(numberphone);
                    log.info(addressemail);
                    break;
                }
                else
                {
                    temp = temp.next;
                }
            }
            if(flag == 0)
            {
                log.info("No contact found");
            }
        }
    }

    public void deleteContact(String deletename)
    {
        Node temp = rootnode;
        Node prev=temp;
        int flag=0;
        while(temp!=null)
        {
            if(deletename.equals(rootnode.name))
            {
                flag=1;
                log.info("Deleted Contact Sucessfully");
                rootnode =temp.next;
                temp = null;
                
            }
            else if(deletename.equals(temp.name))
            {
                flag=1;
                log.info("Deleted Contact Sucessfully");
                prev.next =temp.next;
                temp = null;
                
            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
        }
        if(flag == 0)
        {
            log.info("No Contact found");
        }
    }
}
