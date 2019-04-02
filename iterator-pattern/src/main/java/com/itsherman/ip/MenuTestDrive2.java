package com.itsherman.ip;

import com.itsherman.ip.javaiterator.DinerMenu;
import com.itsherman.ip.javaiterator.Menu;
import com.itsherman.ip.javaiterator.PancakeHouseMenu;
import com.itsherman.ip.javaiterator.Waitress;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class MenuTestDrive2 {

    public static void main(String[] args) {
        Menu dinermenu = new DinerMenu("diner menu");
        Menu pancakeMenu = new PancakeHouseMenu("pancake menu");
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(dinermenu);
        menus.add(pancakeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMemu();
    }
}
