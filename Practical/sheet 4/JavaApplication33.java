/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author STUDEN
 */
public class JavaApplication33 {
    public static double calculateDistance (double x1,double y1,double x2,double y2){
        double dx =x2-x1;
        double dy =y2-y1;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public static void main(string[]args){
            Scanner input=new Scanner(System.in);
            System.out.print("enter x1, y1,x2,y2");
            double x1=input.nextDouble();
            double y1=input.nextDouble();
         
            double x2=input.nextDouble();
            double y2=input.nextDouble();
            double distance=calculateDistance(x1,y1,x2,y2);
            System.out.println("Distance"+distance);
                    
            
        }
    
        // TODO code application logic here
    }
    