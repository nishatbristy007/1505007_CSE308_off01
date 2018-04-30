/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1505007_takeout;

import java.util.LinkedList;

/**
 *
 * @author NABristy
 */
public class Burger {
    private LinkedList<String> parts;
    public Burger(){
        parts =  new LinkedList<String>();
    }
    public void add(String str){
        parts.addLast(str);
    }
    public void show(){
        System.out.println("You have been served with a burger having -->");
        for(int i = 0;i<parts.size();i++){
            System.out.println(parts.get(i));
        }
    }
            
}
