package com.itsherman.ip.javaiterator;

import com.itsherman.ip.origion.MenuItem;

import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/28
 */

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6;

    private String name;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(String name){
        this.name = name;
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99);
        addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
        addItem("Soup of the day","Soup of the day,with a side of tomato salad",false,3.29);
        addItem("Hotdog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.05);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
     MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
     if(numberOfItems >= MAX_ITEMS){
         System.out.println("Sorry,menu is full");
     }else{
         menuItems[numberOfItems] = menuItem;
         numberOfItems = numberOfItems+1;
     }
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
