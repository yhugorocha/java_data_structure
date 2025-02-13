package io.github.yhugorocha.fila;

public class Main {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.enqueue(2);
        fila.enqueue(5);
        fila.enqueue(1);

        System.out.println(fila.dequeue());

        fila.enqueue(3);
        fila.enqueue(4);

        System.out.println(fila.first().toString());
        System.out.println(fila.toString());

    }
}
