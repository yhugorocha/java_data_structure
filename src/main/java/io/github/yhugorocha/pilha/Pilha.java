package io.github.yhugorocha.pilha;

import io.github.yhugorocha.encadeamento_no.No;

public class Pilha<T> {

    private No<T> refNoInitial;

    public Pilha() {
    }

    public Pilha(No<T> refNoInitial) {
        this.refNoInitial = null;
    }

    public No<T> pop (){
        if(!this.isEmpty()){
            No<T> varAssistant = this.refNoInitial;
            this.refNoInitial = this.refNoInitial.getNextNo();
            return varAssistant;
        }
        return null;
    }

    public void push(No<T> no){
        No<T> varAssistant = this.refNoInitial;
        this.refNoInitial = no;
        this.refNoInitial.setNextNo(varAssistant);
    }

    public No<T> top(){
        return refNoInitial;
    }

    public Boolean isEmpty(){
        return refNoInitial == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "------------------\n";
        stringRetorno += "      PILHA       \n";
        stringRetorno += "------------------\n";

        No<T> noAuxliar = this.refNoInitial;

        while (true){
            if(noAuxliar != null){
                stringRetorno += "[No{content="+ noAuxliar.getContent()+"}]\n";
                noAuxliar = noAuxliar.getNextNo();
            }else {
                break;
            }
        }
        stringRetorno += "==================\n";
        return stringRetorno;
    }
}
