/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saja;

/**
 *
 * @author STUDENT
 */
public class Motocycle extends  Vechicle{
    private double engineCapacity;

    public Motocycle(String brand, String modele, int year) {
        super(brand, modele, year);
        this.engineCapacity=engineCapacity;
    } 
      @Override
       public double calculateRentalprice(int days){
        return days*30.0+engineCapacity*0.05;
    }
    @Override
     public void displayDetails(){
        super . displayDetails();
        System.out.println("engineCapacity"+engineCapacity);
     }
     @Override
      public String toString(){
        return "Motocycle["+super.toString()+",num of door="+engineCapacity+"]";
    }
    
}
