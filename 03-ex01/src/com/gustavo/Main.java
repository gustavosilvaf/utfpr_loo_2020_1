package com.gustavo;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Wolfgang Engel", "ShaderX 3", 630);
        b1.printDetails();
        b1.setNumReference("21");
        b1.setNumReference("210");
        b1.loan();
        b1.loan();
        b1.printDetails();
    }
}
