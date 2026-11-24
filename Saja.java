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
public class Saja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Car car1 = new Car("BMW" , "NN" , 2020 , 4);
         car1.displayDetails();
         car1.calculateRentalprice(3);
     
    }
    
}
