package io.github.yhugorocha.pilha;

import io.github.yhugorocha.encadeamento_no.No;

public class Main {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        No<Integer> num1 = new No<>(1);
        No<Integer> num2 = new No<>(2);
        No<Integer> num3 = new No<>(3);
        No<Integer> num4 = new No<>(4);


        pilha.push(num1);
        pilha.push(num2);
        System.out.println(pilha.top().toString());
        pilha.pop();
        pilha.push(num3);
        pilha.push(num4);
        pilha.pop();
        pilha.push(num2);
        System.out.println(pilha.toString());
    }
}
