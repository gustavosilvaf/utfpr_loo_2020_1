package com.gustavo;

public class Main {

    public static void main(String[] args) {
    exercicio4();
    }

    public static void exercicio4(){
        Amplificador amp = new Amplificador(new Pedal(), new Guitarra());
        amp.reproduzirSom();
    }
}
