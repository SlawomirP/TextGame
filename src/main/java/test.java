import Place.Bag;
import Place.Recipe;
import Things.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        Bag bag = new Bag();
        Recipe recipe = new Recipe();

        bag.addItem(new Pepper());
        bag.addItem(new Salt());
        bag.addItem(new Butter());
        bag.addItem(new Egg());

//        bag.print();
//        System.out.println("--------");
//        recipe.print();

        System.out.println("-----------po sort recipe");

        Collections.sort(recipe.getItemList());
        recipe.print();

        System.out.println("-------------po sortowaniu baga");
        Collections.sort(bag.getItemList());
        bag.print();

        System.out.println("przypisanie");
        System.out.println();
        ArrayList<Food> temp1 = bag.getItemList();
        ArrayList<Food> temp2 = recipe.getItemList();
        Collections.sort(temp1);
        Collections.sort(temp2);
        System.out.print(temp1);
        System.out.println();
        System.out.print(temp2);

        System.out.println(temp1.equals(temp2));

    }
}
