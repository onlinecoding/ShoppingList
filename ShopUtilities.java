package com.shop;
import java.util.ArrayList;

public class ShopUtilities {
	
	//This variable will hold the all the items as String
	private ArrayList<String> shoppingList;
	
	//Constructor
	public ShopUtilities(){
		shoppingList = new ArrayList<>();
	}
	
	//Check to see if the list is empty?
	public boolean isEmpty(){
		return shoppingList.isEmpty();
	}//end isEmpty()
	
	//Add a new item to the list
	public void addItem(String input){
		shoppingList.add(input);
	}//end addItem
	
	//Check the number of items in the list
	public int shoppingListSize(){
		return shoppingList.size();
	}//end ShoppingListSize()
	
	//Display all the items in the list
	public void showList(){
		
		if(!shoppingList.isEmpty()){
			for(String item:shoppingList){
				System.out.println(item+"\n");
				}
			}else{
				System.out.println("Its empty mate");
			}
		}//end showList()
	
	
	/*
	public void removeItem(String item){
		
	}
	*/
	
	//Empty the list
	public void clearlist(){
		shoppingList.clear();
	}//end clearList
	
	
}//end class
