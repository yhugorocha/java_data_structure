package io.github.yhugorocha.fila;

public class Main {
    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();

        fila.enqueue("Segundo");
        fila.enqueue("Quinto");
        fila.enqueue("Primeiro");

        System.out.println(fila.dequeue());

        fila.enqueue("Terceiro");
        fila.enqueue("Quarto");

        System.out.println(fila.first().toString());
        System.out.println(fila.toString());

    }
}
