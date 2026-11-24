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
public class Car extends  Vechicle{
    private int numDoor;
    public Car (String brand,String model,int year,int numDoor){
        super(brand,model,year);
        this.numDoor=numDoor;
    }
    @Override
    public double calculateRentalprice(int days){
        return days*50.0+numDoor*5;
    }
    @Override
    public void displayDetails(){
        super . displayDetails();
        System.out.println("num of door"+numDoor);
    }
    @Override
    public String toString(){
        return "Car["+super.toString()+",num of door="+numDoor+"]";
    }
    
    
        
    
    
}
