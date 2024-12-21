package com.example;

public class Class007 {

    public static void main(String[] args) {

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 1.0 : preco * 0.05;

        // double desconto;

        /*
        if(preco < 20){
            desconto = preco * 0.1;
        }
        else{
            desconto = preco * 0.05;
        }
        */

        System.out.println("desconto "+ desconto);
    }
}
