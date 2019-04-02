package com.itsherman.ip.reload;

import com.itsherman.ip.origion.MenuItem;
import com.itsherman.ip.iterator.DinerMenuIterator;
import com.itsherman.ip.iterator.Iterator;

/**
 * @author Sherman
 * created in 2019/3/28
 */

public class DinerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
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

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
