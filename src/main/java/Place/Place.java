package Place;

import java.util.ArrayList;

public abstract class Place<T> {

    private ArrayList<T> itemList = new ArrayList<>();

    public ArrayList<T> getItemList() {
        return itemList;
    }

    public void add(T e) {
        itemList.add(e);
    }

    public T get(int index) {
        return itemList.get(index - 1);
    }

    public void print() {
        for (int i = 0; i < itemList.size(); i++) {
            System.out.println((i + 1) + ". " +  itemList.get(i).toString());
        }
    }


}
