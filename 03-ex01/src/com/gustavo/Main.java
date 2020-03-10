package com.gustavo;

public class Main {

    public static void main(String[] args) {
        Book b = new Book("Gustavo", "Teste", 10);

        b.printDetails();

        b.setNumReference("te");

        b.loan();
        b.loan();

        b.printDetails();

    }
}
