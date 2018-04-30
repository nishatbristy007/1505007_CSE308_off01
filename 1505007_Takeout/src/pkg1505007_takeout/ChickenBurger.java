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

class ChickenBurger implements BurgerBuilder{
    private Burger chickenBurger =  new Burger();
    @Override
    public void addPatty() {
        chickenBurger.add("Chicken Patty");
    }

    @Override
    public void addSauce() {
        chickenBurger.add("Sauce(Chicken flavour)");
    }

    @Override
    public void addCheese() {
        chickenBurger.add("Cheese");
    }

    @Override
    public Burger getBurger() {
        return chickenBurger;
    }
    
}
