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

class CoffeeA implements Coffee{
    private float qtmilk;
    private float qtsugar;
    private float qtcaffein;
    CoffeeA(){
        Milk();
        Caffein();
        sugar();
    }
    @Override
    public void Milk(){
        qtmilk = 35;
    }
    @Override
    public void Caffein(){
        qtcaffein = 70;
    }
    public void sugar(){
        qtsugar =  1;
    }       
}