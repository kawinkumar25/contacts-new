package org.example;

public class Node {
    String name;
    String email;
    long number;

    Node next;
    Node(String name,long number,String email)
    {
        this.name=name;
        this.number=number;
        this.email=email;
        next=null;
    }

}
