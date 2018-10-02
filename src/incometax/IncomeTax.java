/*
 * Peter Horne-Deus
 * IncomeTax.java
 * This program calculate income tax based on salary
 * October 2,2018
 */

package incometax;

import java.util.Scanner;
import java.text.*;

public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("$#,###,###.##");
        
        Scanner keyedInput = new Scanner(System.in);
        //variables
        double salary;
        double taxTaken;
        double earning;
        //Tax levels constents 
        final double FEDERAL_TAX_BRACKET_1 = 0.15;
        final double FEDERAL_TAX_BRACKET_2 = 0.205;
        final double FEDERAL_TAX_BRACKET_3 = 0.26;
        final double FEDERAL_TAX_BRACKET_4 = 0.29;
        final double FEDERAL_TAX_BRACKET_5 = 0.33;
        
        
        //user input
        System.out.println("Enter your salary");
        salary = keyedInput.nextDouble();
        //calculations
        if (salary <= 46605){
            taxTaken = FEDERAL_TAX_BRACKET_1 * salary;
        }
        else if (salary >= 46606 && salary <= 93208){
            taxTaken = ((salary-46605)*FEDERAL_TAX_BRACKET_2)+ 6991;
        }
        else if (salary >= 93209 && salary <= 144489){
            taxTaken = (FEDERAL_TAX_BRACKET_3 * (salary-93208))+16544;
        }
        else if (salary >= 144490 && salary <= 205842){
            taxTaken = (FEDERAL_TAX_BRACKET_4 * (salary - 144489))+28877;
        }
        else {
            taxTaken = (FEDERAL_TAX_BRACKET_5 * (salary - 205842))+47670;
        }
        earning = salary - taxTaken;
        
        //Out put
        System.out.println("Your tax will be " + money.format(taxTaken));
        System.out.println("Your earings after tax will be "+money.format(earning));
    }
    
}
