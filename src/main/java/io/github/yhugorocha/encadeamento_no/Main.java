package io.github.yhugorocha.encadeamento_no;

public class Main {
    public static void main(String[] args) {

    //no1 -> no2 -> no3 -> no4 -> null
        No<String> no1 = new No<>("Conteudo nó 1");
        No<String> no2 = new No<>("Conteudo nó 2");
        no1.setNextNo(no2);

        No<String> no3 = new No<>("Conteudo nó 3");
        no2.setNextNo(no3);

        No<String> no4 = new No<>("Conteudo nó 4");
        no3.setNextNo(no4);

        System.out.println(no1.toString());
        System.out.println(no1.getNextNo());
        System.out.println(no1.getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo());
        System.out.println(no1.getNextNo().getNextNo().getNextNo().getNextNo());
    }
}
