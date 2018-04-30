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

class CoffeeC implements Coffee{
    private float qtmilk;
    private float qtsugar;
    private float qtcaffein;
    CoffeeC(){
        Milk();
        Caffein();
        sugar();
    }
    @Override
    public void Milk(){
        qtmilk = 210;
    }
    @Override
    public void Caffein(){
        qtcaffein = 90;
    }
    public void sugar(){
        qtsugar =  2;
    }
}

