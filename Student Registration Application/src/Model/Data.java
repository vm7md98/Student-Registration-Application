package Model;

import java.util.*;

public class Data<B> {

    private List<B> sList;

    public Data() {
        sList = new ArrayList<>();

    }

    public void add(B b) {
        sList.add(b);

    }

    public void delete(B b) {
        sList.remove(b);
    }

    public B get(int i) {
        return sList.get(i);
    }

    public int countItems() {
        return sList.size();
    }

}
