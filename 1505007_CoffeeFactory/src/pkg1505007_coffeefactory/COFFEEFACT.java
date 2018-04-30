/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505007_coffeefactory;

import java.util.Scanner;

/**
 *
 * @author NABristy
 */

public class COFFEEFACT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1; 
        Scanner sc =  new Scanner(System.in);
        System.out.println("Welcome to Coffee Factory. Press E to exit.");
        CoffeeFactory cof =  CoffeeFactory.getCoffeeFactory();
        
        while(a==1){
            System.out.println("Order a Coffee: \n A. CoffeeA(Cappuchino) \n B. CoffeeB(Diabates)\n C. CoffeeC(Espresso) \nEnter your choice Letter A/B/C/a/b/c");
            String type = sc.nextLine();
            Coffee c =  null;
            if(type.equalsIgnoreCase("A"))
            {
                c  =  cof.ProduceCoffee(type);
            }
            else if(type.equalsIgnoreCase("B"))
            {
                c  =  cof.ProduceCoffee(type);                
            }
            else if(type.equalsIgnoreCase("C"))
            {
                c =  cof.ProduceCoffee(type);
            }
            else if(type.equals("E"))
            {
                break;
            }
            else{
                System.out.println("Sorry, your order is not taken.Please order a Coffee from the listA.");
                continue;
            }
            
            
        }
    }
    
}
