package com.itsherman.ip.javaiterator;

import com.itsherman.ip.iterator.PancakeHouseMenuIterator;
import com.itsherman.ip.origion.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Sherman
 * created in 2019/3/28
 */

public class PancakeHouseMenu implements Menu{

    private String name;
    ArrayList menuItems;

    public PancakeHouseMenu(String name) {
        this.name = name;
        this.menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast","Pancakes with scrambled eggs,and toast",true,2.99);
        addItem("Regular Pancake Breakfast","Pancakes with fired eggs,sausage",false,2.99);
        addItem("BlueBerry Pancakes","Pancakes made with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
    }

    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems(){
        return getMenuItems();
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
        return menuItems.iterator();
    }
}
