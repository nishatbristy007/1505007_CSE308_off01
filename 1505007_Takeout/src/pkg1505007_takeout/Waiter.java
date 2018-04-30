/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505007_takeout;

/**
 *
 * @author NABristy
 */

class Waiter{
    BurgerBuilder myBurger;
    
    public void PrepareBurger(BurgerBuilder burger){
        myBurger =  burger;
        myBurger.addPatty();
        myBurger.addCheese();
        myBurger.addSauce();               
    }
}
