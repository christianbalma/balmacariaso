/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Manolo
 */
public class main1 {
    public static void main(String[] args) {
		
		Scanner In = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("[1] Combinations and Permutations");
		System.out.println("[2] Stirling Number Of Second Case");
		System.out.println("[3] Pascal's Triangle Row Generator");
		System.out.println("                                 ");
		System.out.print("Please choose a number: "); 
		try{
			int Menu = In.nextInt();
			
			CombinationPermutation choice = new CombinationPermutation ();
			stirlingnumbers choice2 = new stirlingnumbers();
			pascaltriangle choice3 = new pascaltriangle();
			
			if (Menu == 1){
				
				choice.display1();	
				
			}
			
			else if(Menu == 2){
				
				choice2.Sterling();
				
			}
			
			else if(Menu == 3){
				
				choice3.Pascal();
				
				
			}
			
			else{
				System.out.println("  ");
				System.out.println("Invalid Input");
				main(null);
				
			}
		}catch(Exception e){
			
			System.out.println("          ");
			System.out.println("The Program only allow Numeric values!");
			main(null);
			
		}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}

