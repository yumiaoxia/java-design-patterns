package com.itsherman.ip;

import com.itsherman.ip.reload.DinerMenu;
import com.itsherman.ip.reload.PancakeHouseMenu;
import com.itsherman.ip.reload.Waitress;

/**
 * @author Sherman
 * created in 2019/3/30
 */

public class MenuTestDrive {


    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMemu();
    }
}
