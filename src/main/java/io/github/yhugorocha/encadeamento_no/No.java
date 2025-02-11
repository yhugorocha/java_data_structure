package io.github.yhugorocha.encadeamento_no;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class No<T> {

    private T content;
    private No<T> nextNo;

    public No (T content){
        this.nextNo = null;
        this.content = content;
    }

    @Override
    public String toString() {
        return "No{" +
                "content='" + content + '\'' +
                '}';
    }
}
