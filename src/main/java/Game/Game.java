package Game;

import Messages.Messages;
import Place.Bag;
import Place.Kitchen;
import Place.Pantry;

import java.util.Scanner;

public class Game {
    private boolean endGame = false;
    private Pantry pantry = new Pantry();
    private Kitchen kitchen = new Kitchen();
    private Bag bag = new Bag();
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
                                System.out.println(Messages.HELP);
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
                                bag.add(pantry.getObject(pantry.checkIndex("jajka")));
                                pantry.removeItem(pantry.checkIndex("jajka"));
                                break;
                            case "sól zabierz":
                                bag.add(pantry.getObject(pantry.checkIndex("sól")));
                                pantry.removeItem(pantry.checkIndex("sól"));
                                break;
                            case "pieprz zabierz":
                                bag.add(pantry.getObject(pantry.checkIndex("pieprz")));
                                pantry.removeItem(pantry.checkIndex("pieprz"));
                                break;
                            default:
                                System.err.println(Messages.INCORRECT_COMMAND);
                        }
                    }
                    break;
                case "2":
                    System.out.println(Messages.KITCHEN_ENTER);
                    break;
                default: {
                    System.out.println(Messages.DEFAULT);
                }
            }


//            endGame = true;
        }


    }
}
