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
public class Vechicle {
  private String brand;  
  private String model;
  private int year;
  
  public Vechicle(String brand,String modele,int year){
      this.brand=brand;
      this.model=model;
      this.year=year;
  }
   public String getbrand(){
       return brand;
   }
   public void setbrand(String brand){
       this.brand=brand;
   }
   public String getModel(){
       return model;
   }
   public void setModel(String model){
       this.model=model;
   }
   public int getyear(){
       return year;
   }
   public void setyear(int year){
       this.year=year;
   }
   public double calculateRentalprice(int days){
       return days*50.0;
   }
   public double calculateRentalprice(int days,double discount){
       double price=calculateRentalprice(days);
       return price-(price*discount/100);
   }
   public void displayDetails(){
       System.out.println("brand"+brand);
       System.out.println("model"+model);
       System.out.println("year"+year);
   }
   
   @Override
public String toString(){
       return  "Vechicle[brand"+brand+"model"+model+"year"+year+"]";
               
       
        
       
       
            
       

   
       
   }
   }
   
