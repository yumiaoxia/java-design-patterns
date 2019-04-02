package com.itsherman.cp;


import com.itsherman.cp.upgrade.Menu;
import com.itsherman.cp.upgrade.MenuComponent;
import com.itsherman.cp.upgrade.MenuItem;
import com.itsherman.cp.upgrade.Waitress;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class MenuTestDrive2 {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Marinara Sauce,and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day", "Soup of the day,with a side of tomato salad", false, 3.29));
        dinerMenu.add(new MenuItem("Hotdog", "A hot dog,with saurkraut,relish,onions,topped with cheese", false, 3.05));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust,topped with wanilla ice cream", true, 1.59));
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs,and toast", true, 2.99));
        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fired eggs,sausage", false, 2.99));
        pancakeHouseMenu.add(new MenuItem("BlueBerry Pancakes", "Pancakes made with fresh blueberries", true, 3.49));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Waffles,with your choice of blueberries or strawberries", true, 3.59));


        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }
}
