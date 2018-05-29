package idv.jack.test;

import java.util.List;

public class HelloWorld {

    public int getList(List<String> lists) {
        return lists.size();
    }

    public String getElement(List<String> lists) {
        return lists.get(2).toUpperCase();
    }
}
