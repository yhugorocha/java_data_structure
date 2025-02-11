package io.github.yhugorocha.encadeamento_no;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class No {

    private String content;
    private No nextNo;

    public No (String content){
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
