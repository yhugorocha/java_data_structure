package io.github.yhugorocha.atribuicao_referencia;

public class Main {
    public static void main(String[] args) {

    //Cópia o valor de endereço da memória
        var numA = 1;
        var numB = numA;

        System.out.println("numA: " + numA +", numB: " +numB);

        numA = 2;

        System.out.println("numA: " + numA +", numB: " +numB);

    //Cópia a referência de endereço da memória
        var obj1 = new MyObj(1);
        var obj2 = obj1;

        System.out.println("obj1: " + obj1 +", obj2: " +obj2);

        obj1.setNum(2);

        System.out.println("obj1: " + obj1 +", obj2: " +obj2);
    }
}
