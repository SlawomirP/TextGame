package Place;

import Messages.Messages;

import java.util.ArrayList;

public abstract class Place<T> {
    boolean isActive;
    private ArrayList<T> itemList = new ArrayList<>();

    public int getListSize(){
        return itemList.size();
    }

    public ArrayList<T> getItemList() {
        return itemList;
    }

    public void addItem(T e) {
        itemList.add(e);
    }

    public void removeItem(int index) {
        itemList.remove(index);
    }

    public T getObject(int index) {
        return itemList.get(index);
    }

    public int checkIndex(String name) {
        int temp = 0;
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).toString().equals(name)) {
                temp = i;
            }
        }
        return temp;
    }

    public void print() {
        if (itemList.isEmpty()) {
            System.out.println(Messages.NO_PRODUCTS);
        } else
            itemList.forEach(System.out::println);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


}
