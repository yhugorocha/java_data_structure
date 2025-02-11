package io.github.yhugorocha.encadeamento_no;

public class Main {
    public static void main(String[] args) {

    //no1 -> no2 -> no3 -> no4 -> null
        var no1 = new No("Conteudo nó 1");
        var no2 = new No("Conteudo nó 2");
        no1.setNextNo(no2);

        var no3 = new No("Conteudo nó 3");
        no2.setNextNo(no3);

        var no4 = new No("Conteudo nó 4");
        no3.setNextNo(no4);

        System.out.println(no1.toString());
        System.out.println(no1.getNextNo());
        System.out.println(no1.getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo().getNextNo());
    }
}
