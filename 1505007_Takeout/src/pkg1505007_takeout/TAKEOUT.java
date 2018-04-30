/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505007_takeout;

import java.util.Scanner;

/**
 *
 * @author NABristy
 */

interface BurgerBuilder{
    void addPatty();
    void addSauce();
    void addCheese();
    Burger getBurger();
}


public class TAKEOUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1; 
        Scanner sc =  new Scanner(System.in);
        System.out.println("Welcome to Takeout\nPress E to exit.");
        Waiter d =  new Waiter();
        while(a==1){
            System.out.println("Order a burger: \n 1. Beef \n 2. Chicken\n Enter your choice number");
            String type = sc.nextLine();
            Burger p = new Burger();
            if(type.equalsIgnoreCase("1"))
            {
                BurgerBuilder beefBurger =  new BeefBurger();
                d.PrepareBurger(beefBurger);
                p = beefBurger.getBurger();
            }
            else if(type.equals("2"))
            {
                BurgerBuilder chickenBurger =  new ChickenBurger();
                d.PrepareBurger(chickenBurger);
                p = chickenBurger.getBurger();                
            }
            else if(type.equals("E"))
            {
                break;
            }
            else{
                System.out.println("Sorry, your order is not taken.Please order a Burger from the list.");
                continue;
            }
            p.show();
            
        }
        
    }
    
}
