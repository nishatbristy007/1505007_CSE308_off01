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

class CoffeeFactory{
    private static CoffeeFactory cf  = new CoffeeFactory();
    private CoffeeFactory(){}
    
    public static CoffeeFactory getCoffeeFactory(){
        return cf;
    }
    
    public Coffee ProduceCoffee(String type){
        if(type==null){
            return null;
        }
        else if(type.equalsIgnoreCase("A"))
        {
            System.out.println("CoffeeA is served. Thank you!");
            return new CoffeeA();
        }
        else if(type.equalsIgnoreCase("B"))
        {
            System.out.println("CoffeeB is served. Thank you!");
            return new CoffeeB();
        }
        else if(type.equalsIgnoreCase("C"))
        {
            System.out.println("CoffeeC is served. Thank you!");
            return new CoffeeC();
        }
        return null;
    }
}
