package io.github.yhugorocha.fila;

public class Fila {

    private No refNo;

    public Fila(){
        this.refNo = null;
    }

    public void enqueue(Object obj){
        No newNo = new No(obj);
        newNo.setRefNo(refNo);
        refNo = newNo;
    }

    public Object dequeue(){
        if(!this.isEmpty()){
            No firstNo = refNo;
            No aux = refNo;
            while (true){
                if(firstNo.getRefNo() != null){
                    aux = firstNo;
                    firstNo = firstNo.getRefNo();
                }else{
                    aux.setRefNo(null);
                    break;
                }
            }
            return firstNo.getObject();
        }
        return null;
    }

    public Object first(){
        if(!this.isEmpty()){
            No firstNo = refNo;
            while (true){
                if(firstNo.getRefNo() != null){
                    firstNo = firstNo.getRefNo();
                }else{
                    break;
                }
            }
            return firstNo.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNo == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "------------------\n";
        stringRetorno += "      FILA       \n";
        stringRetorno += "------------------\n";

        No noAux = this.refNo;

        if (this.refNo != null){
            while (true){
                stringRetorno += "[No] { obj = " +noAux.getObject() + "}] --->";
                if(noAux.getRefNo() != null){
                    noAux = noAux.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }



}
