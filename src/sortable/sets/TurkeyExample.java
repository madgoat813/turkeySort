/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortable.sets;

import common.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tmcfall
 */
public class TurkeyExample {
    public static void main(String[] args) {
        Turkey t1 = new Turkey(106, 22.3, "Tyson");
        Turkey t2 = new Turkey(102, 18.0, "Popeye's");
        Turkey t3 = new Turkey(117, 13.5, "Checker's");
        Turkey t4 = new Turkey(108, 22.3, "Tyson");
        Turkey t5 = new Turkey(137, 18.0, "Popeye's");
        Turkey t6 = new Turkey(111, 24.0, "Checker's");
        Turkey t7 = new Turkey(127, 11.1, "Tyson");
        Turkey t8 = new Turkey(101, 20.9, "Popeye's");
        Turkey t9 = new Turkey(101, 30.4, "Checker's");
        Turkey dup = new Turkey(101, 94.9, "Checker's");
        
        Set<Turkey> set = new TreeSet<Turkey>();
        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        set.add(t5);
        set.add(t6);
        set.add(t7);
        set.add(t8);
        set.add(t9);
        set.add(dup);
        
        for (Turkey t : set) {
            System.out.println(t);
        }
        System.out.println("\n--------------------\n");
        List<Turkey> list = new ArrayList<Turkey>(set);
        Collections.sort(list, new TurkeyByBrand());
        for (Turkey newList : list) {
            System.out.println(newList);
        }
    }
}
