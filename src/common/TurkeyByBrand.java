/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;

/**
 *
 * @author tmcfall
 */
public class TurkeyByBrand implements Comparator<Turkey>{

    public int compare(Turkey t1, Turkey t2) {
        return t1.getBrand().compareTo(t2.getBrand());
    }
    
}
