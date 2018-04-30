/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505007_coffeefactory;

/**
 *
 * @author NABristy
 */
class CoffeeB implements Coffee{
    private float qtmilk;
    private float qtcaffein;
    CoffeeB(){
        Milk();
        Caffein();
    }
    @Override
    public void Milk(){
        qtmilk = 140;
    }
    @Override
    public void Caffein(){
        qtcaffein = 80;
    }
    
}
