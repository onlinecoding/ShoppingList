package com.shop;

import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {
		
		ShopUtilities selection = new ShopUtilities();

		// Scanner element initialized to take input from the user
		Scanner input = new Scanner(System.in);
		String item;

		do {
			
			System.out.println("\nMenu: \n");
			System.out.print("1. Add an item\n");
			//System.out.print("2. Remove an item\n");
			System.out.print("2. Clear the list\n");
			System.out.print("3. Show the list\n\n");
			System.out.print("Select a number: \n\n");
			
			// Get a String input and parse to an Integer 
			int option = Integer.parseInt(input.nextLine());

			// Switch takes an int compatible or String
			switch (option) {
			
			// Add an Item to the Shopping List
			case 1:				
				System.out.println("What would you like to add?\n");
				
				selection.addItem(item = input.nextLine());
				break;

			//case 2:
				// Remove an Item from the Shopping List
				//selection.removeItem(input);
			//	break;

			// Clear the Shopping List
			case 2:				
				selection.clearlist();
				break;
				
			// show shopping list			
			case 3:				
				selection.showList();;
				break;

				
			
			//if no other valid selection
			default:
				
				System.out.println("** Invalid selection **\n");
				break;

			}
		} while (true);

		


	}

}
