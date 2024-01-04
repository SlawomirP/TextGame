package Game;

import Messages.Messages;
import Place.Bag;
import Place.Kitchen;
import Place.Pantry;
import Place.Recipe;
import Things.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {
    private boolean endGame = false;
    private Pantry pantry = new Pantry();
    private Kitchen kitchen = new Kitchen();
    private Bag bag = new Bag();
    private Recipe recipe = new Recipe();
    Scanner scanner = new Scanner(System.in);

    public void start() {

        System.out.println(Messages.INTRODUCTION);
        System.out.println(Messages.INGREDIENTS);

        while (!endGame) {

            System.out.println(Messages.START_OPTIONS);
            switch (scanner.nextLine()) {
                case "1":
                    pantry.setActive(true);

                    System.out.println(Messages.PANTRY_ENTER);

                    while (pantry.isActive()) {

                        System.out.println(Messages.PLACE_OPTIONS);
                        switch (scanner.nextLine()) {
                            case "1":
                                pantry.print();
                                break;
                            case "2":
                                System.out.println(Messages.HELP_PANTRY);
                                break;
                            case "3":
                                System.out.println(Messages.PANTRY_DESCRPT);
                                break;
                            case "4":
                                bag.print();
                                break;
                            case "0":
                                pantry.setActive(false);
                                break;
                            case "jajka zabierz":
                                bag.addItem(pantry.getObject(pantry.checkIndex("jajka")));
                                pantry.removeItem(pantry.checkIndex("jajka"));
                                break;
                            case "sól zabierz":
                                bag.addItem(pantry.getObject(pantry.checkIndex("sól")));
                                pantry.removeItem(pantry.checkIndex("sól"));
                                break;
                            case "pieprz zabierz":
                                bag.addItem(pantry.getObject(pantry.checkIndex("pieprz")));
                                pantry.removeItem(pantry.checkIndex("pieprz"));
                                break;
                            case "masło zabierz":
                                bag.addItem(pantry.getObject(pantry.checkIndex("masło")));
                                pantry.removeItem(pantry.checkIndex("masło"));
                                break;
                            default:
                                System.err.println(Messages.INCORRECT_COMMAND);
                        }
                    }
                    break;
                case "2":
                    kitchen.setActive(true);

                    // to do wyciągnięcia

                    System.out.println("przypisanie recipe");
                    ArrayList<Food> temp1 = recipe.getItemList();

                    System.out.println("przypisanie baga");
                    ArrayList<Food> temp2 = bag.getItemList();

                    Collections.sort(temp1);
                    Collections.sort(temp2);

                    System.out.println("wynik: " + temp1.equals(temp2));


                    System.out.println(Messages.KITCHEN_ENTER);

                    while(kitchen.isActive()){
                        System.out.println(Messages.PLACE_OPTIONS);

                        switch (scanner.nextLine()){
                            case "1":
                                kitchen.print();
                                break;
                            case "2":
                                System.out.println(Messages.HELP_KITCHEN);
                                break;
                            case "3":
                                System.out.println(Messages.KITCHEN_DESCRPT);
                                break;
                            case "4":
                                bag.print();
                                break;
                            case "0":
                                kitchen.setActive(false);
                                break;
                            case "sprawdź torba":


                                break;
                            case "przedmioty w torbie":
                                bag.print();
                                break;
                        }
                    }

                    break;
                default: {
                    System.out.println(Messages.DEFAULT);
                }
            }


//            endGame = true;
        }


    }
}
