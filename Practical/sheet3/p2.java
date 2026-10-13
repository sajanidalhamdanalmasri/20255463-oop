/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter num");
        int num=input.nextInt();
       int  reverse=0;
       while(num!=0){
           int digits=num%10;
             reverse= reverse*10+digits;
             num=num/10;
             
        }
      System.out.println(reverse);
    }
    
}
