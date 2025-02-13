package io.github.yhugorocha.fila;

public class No {

    private Object object;
    private No refNo;

    public No(){
    }

    public No(Object object){
        this.object = object;
        this.refNo = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
