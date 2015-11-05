/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author tmcfall
 */
public class Turkey implements Comparable{
    private double weight;
    private String brand;
    private int turkeyID;

    public Turkey() {
    }

    public Turkey(int turkeyID, double weight, String brand ) {
        this.turkeyID = turkeyID;
        this.weight = weight;
        this.brand = brand;
        
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTurkeyID() {
        return turkeyID;
    }

    public void setTurkeyID(int turkeyID) {
        this.turkeyID = turkeyID;
    }

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 97 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
//        hash = 97 * hash + (this.brand != null ? this.brand.hashCode() : 0);
//        hash = 97 * hash + this.turkeyID;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Turkey other = (Turkey) obj;
//        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
//            return false;
//        }
//        if ((this.brand == null) ? (other.brand != null) : !this.brand.equals(other.brand)) {
//            return false;
//        }
//        if (this.turkeyID != other.turkeyID) {
//            return false;
//        }
//        return true;
//    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 23 * hash + this.turkeyID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (this.turkeyID != other.turkeyID) {
            return false;
        }
        return true;
    }

    

    

    @Override
    public String toString() {
        return "weight = " + weight + ", brand = " + brand + ", turkeyID = " + turkeyID;
    }

    
     

    public int compareTo(Object target) {
        Turkey ty = (Turkey)target;
        
        return new CompareToBuilder()
               .append(this.weight, ty.weight)
               .append(this.turkeyID, ty.turkeyID)
               .toComparison();
    }
    
    
}
