/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoleaplication;

/**
 *
 * @author Student
 */
public class ConsoleAplication {
    
        String getConsoleType();
        String getStore();
        int getTotalSales();
        
        public interface IConsoles {
            
            this.getConsoleType();
            this.getStore();
            this.getTotalSales();
        }
        //Display Console Information
        @Override
        public void displayConsole() {
            
            super.displayConsole();
            
            System.out.println("Console: + consoleType");
            
        }
}
