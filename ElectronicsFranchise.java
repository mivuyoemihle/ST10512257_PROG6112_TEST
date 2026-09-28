/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicsfranchise;

/**
 *
 * @author Student
 */
class ElectronicsFranchise {
    
    String city;
    String console;
    int year;
    double price;
    
    public ElectronicsFranchise(String city, String console, int year, double price);
    
    {
      
        this.cities = city;
        this.consoles = console;
        this.year = year;
        this.price = price;
        
    }
    public void displayElectronics() {
        
        System.out.println("City: " + city);
        System.out.println("Console: " + console);
        System.out.println("Year: " + year);
        System.out.println("Pice: R " + price);
    }
}

//public main class
public class ElectronicsFranch {
    
    public static void main(String[] args) {
        
        Electronics[] electronics = new Electronics[6];
        
        city[0] = CapeTown("PS5", 1000, "XBOX", 2000, "SWITCH", 3000);
        console[1] = PortElizabeth("PS5", 1000, "XBOX", 2000, "SWITCH", 4000);
        year[2] = Pretoria("PS5", 1500, "XBOX", 1100, "SWITCH", 1200);
        
        for(int i = 0; i < electronics.length; i++ ) {
            
            System.out.println("------------");
            
            electronics[i],displayElectronics();
        }
        
    }
}