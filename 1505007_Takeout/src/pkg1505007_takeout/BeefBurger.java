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

class BeefBurger implements BurgerBuilder{
    private Burger beefBurger = new Burger();
    @Override
    public void addPatty() {
        beefBurger.add("Beef Patty");
    }

    @Override
    public void addSauce() {
        beefBurger.add("Sauce(Beef flavour)");
    }

    @Override
    public void addCheese() {
        beefBurger.add("Cheese");
    }

    @Override
    public Burger getBurger() {
        return beefBurger;
    }
    
}
