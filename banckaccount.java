/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sheet7.practical;

/**
 *
 * @author STUDENT
 */
public class banckaccount {
   
    private String accountnumber; 
    private String accountholder;
    private double balance;
    
    public banckaccount(){
    
    accountnumber = " ";
    accountholder = " ";
    balance = 0;
    
    }
    
    public banckaccount(String accountnumber,String accountholder,double balance){
    
    this.accountholder=accountholder;
    this.accountnumber=accountnumber;
    this.balance=balance;
    
    
    }
    
    
    public String getaccountnumber(){
    
    return accountnumber;
    
    }
    
    
    public String getaccountholder(){
    
    return accountholder;
    
    }
    
    public double getaccountbalance(){
    
    return balance;
    
    }
    
    public void setaccountnumber(String accountnumber){
    
    
    this.accountnumber=accountnumber;
    }
    
    public void setaccountholder(String accountholder){
    
    
    this.accountholder=accountholder;
    }
    
    public void setaccountbalance(double balance){
    
    
    this.balance=balance;
    }
    
    public void deposit(double amount){
    
    balance+=amount;
    
    }
    
    public void withdraw (double amount){
    
    if (balance>=amount){
    balance-=amount;
    
    System.out.println(" withdrawal succesful");
    }
   
    else { System.out.println("insufficient balance");}
    
    
    }
    
    
    
}
